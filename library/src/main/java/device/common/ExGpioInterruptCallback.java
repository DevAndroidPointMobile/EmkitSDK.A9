package device.common;

import android.os.Handler;
import device.common.IExGpioInterruptCallback;

public abstract class ExGpioInterruptCallback {
    private final Object mLock = new Object();
    private CallbackWrapper mStub;
    private Handler mHandler;

    public ExGpioInterruptCallback() {}

    public ExGpioInterruptCallback(Handler handler) {
        mHandler = handler;
    }

    public void setHandler(Handler handler) {
        mHandler = handler;
    }

    public IExGpioInterruptCallback getInterruptCallback() {
        synchronized (mLock) {
            if (mStub == null) {
                mStub = new CallbackWrapper(this);
            }
            return mStub;
        }
    }

    public IExGpioInterruptCallback releaseCallback() {
        synchronized (mLock) {
            final CallbackWrapper oldStub = mStub;
            if (oldStub != null) {
                oldStub.releaseCallback();
                mStub = null;
            }
            return oldStub;
        }
    }

    public void onChanged(int gpio) {}

    public final void dispatchChangedState(int gpio) {
        if (mHandler == null) {
            onChanged(gpio);
        } else {
            mHandler.post(new NotificationRunnable(gpio));
        }
    }

    private final class NotificationRunnable implements Runnable {
        private final int mGpio;
        public NotificationRunnable(int gpio) {
            mGpio = gpio;
        }
        @Override
        public void run() {
            ExGpioInterruptCallback.this.onChanged(mGpio);
        }
    }

    private static final class CallbackWrapper extends IExGpioInterruptCallback.Stub {
        private ExGpioInterruptCallback mCallback;
        public CallbackWrapper(ExGpioInterruptCallback callback) {
            mCallback = callback;
        }
        @Override
        public void onChanged(int gpio) {
            ExGpioInterruptCallback callback = mCallback;
            if (callback != null) {
                callback.dispatchChangedState(gpio);
            }
        }
        public void releaseCallback() {
            mCallback = null;
        }
    }
}
