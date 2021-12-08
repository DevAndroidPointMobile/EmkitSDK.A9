package device.common.rfid;

import android.os.Handler;
import device.common.rfid.RecvPacket;

public abstract class RFIDCallback {
    private final Object mLock = new Object();
    private Transport mTransport;
    Handler mHandler;

    public RFIDCallback() {
    }

    public void setHandler(Handler handler) {
        mHandler = handler;
    }

    public RFIDCallback(Handler handler) {
        mHandler = handler;
    }

    public IRFIDCallback getRFIDCallback() {
        synchronized (mLock) {
            if (mTransport == null) {
                mTransport = new Transport(this);
            }
            return mTransport;
        }
    }

    public IRFIDCallback RFIDCallback() {
        synchronized (mLock) {
            final Transport oldTransport = mTransport;
            if (oldTransport != null) {
                oldTransport.releaseRFIDCallback();
                mTransport = null;
            }
            return oldTransport;
        }
    }

    public boolean deliverSelfNotification() {
        return false;
    }

    public void onNotifyDataWriteFail() {
    }

    /*public void onBtDeviceConnected() {
    }

    public void onBtDeviceConnectFail() {
    }*/

    public void onNotifyReceivedPacket(RecvPacket recvPacket) {
    }

    public void onNotifyChangedState(int state) {
    }
    
    public final void dispatchonNotifyDataWriteFail(){
        if (mHandler == null) {
            onNotifyDataWriteFail();
        } else {
            mHandler.post(new NotificationRunnable_onNotifyDataWriteFail());
        }
    }

    /*public final void dispatchonBtDeviceConnected() {
        if (mHandler == null) {
            onBtDeviceConnected();
        } else {
            mHandler.post(new NotificationRunnable_onBtDeviceConnected());
        }
    }

    public final void dispatchonBtDeviceConnectFail() {
        if (mHandler == null) {
            onBtDeviceConnectFail();
        } else {
            mHandler.post(new NotificationRunnable_onBtDeviceConnectFail());
        }
    }*/

    public final void dispatchonNotifyReceivedPacket(RecvPacket recvPacket) {
        if (mHandler == null) {
            onNotifyReceivedPacket(recvPacket);
        } else {
            mHandler.post(new NotificationRunnable_onNotifyReceivedPacket(recvPacket));
        }
    }

    public final void dispatchonNotifyChangedState(int state) {
        if (mHandler == null) {
            onNotifyChangedState(state);
        } else {
            mHandler.post(new NotificationRunnable_onNotifyChangedState(state));
        }
    }

    private final class NotificationRunnable_onNotifyDataWriteFail implements Runnable {
        public NotificationRunnable_onNotifyDataWriteFail(){
        }
        @Override
        public void run() {
            RFIDCallback.this.onNotifyDataWriteFail();
        }
    }

    /*private final class NotificationRunnable_onBtDeviceConnected implements Runnable {
        public NotificationRunnable_onBtDeviceConnected(){
        }
        @Override
        public void run() {
            RFIDCallback.this.onBtDeviceConnected();
        }
    }

    private final class NotificationRunnable_onBtDeviceConnectFail implements Runnable {
        public NotificationRunnable_onBtDeviceConnectFail() {
        }
        @Override
        public void run() {
            RFIDCallback.this.onBtDeviceConnectFail();
        }
    }*/

    private final class NotificationRunnable_onNotifyReceivedPacket implements Runnable {
        private final RecvPacket mPacket;
        public NotificationRunnable_onNotifyReceivedPacket(RecvPacket recvPacket) {
            mPacket = recvPacket;
        }
        @Override
        public void run() {
            RFIDCallback.this.onNotifyReceivedPacket(mPacket);
        }
    }

    private final class NotificationRunnable_onNotifyChangedState implements Runnable {
        private final int mState;
        public NotificationRunnable_onNotifyChangedState(int state) {
            mState = state;
        }
        @Override
        public void run() {
            RFIDCallback.this.onNotifyChangedState(mState);
        }
    }

    private static final class Transport extends IRFIDCallback.Stub {
        private RFIDCallback mRFIDCallback;
        public Transport(RFIDCallback RFIDCallback) {
            mRFIDCallback = RFIDCallback;
        }

        @Override
        public void onNotifyDataWriteFail() {
            RFIDCallback rfidCallback = mRFIDCallback;
            if (rfidCallback != null) {
                rfidCallback.dispatchonNotifyDataWriteFail();
            }
        }

        /*@Override
        public void onBtDeviceConnected() {
            RFIDCallback rfidCallback = mRFIDCallback;
            if (rfidCallback != null) {
                rfidCallback.dispatchonBtDeviceConnected();
            }
        }

        @Override
        public void onBtDeviceConnectFail() {
            RFIDCallback rfidCallback = mRFIDCallback;
            if (rfidCallback != null) {
                rfidCallback.dispatchonBtDeviceConnectFail();
            }
        }*/

        @Override
        public void onNotifyReceivedPacket(RecvPacket recvPacket) {
            RFIDCallback rfidCallback = mRFIDCallback;
            if (rfidCallback != null) {
                rfidCallback.dispatchonNotifyReceivedPacket(recvPacket);
            }
        }

        @Override
        public void onNotifyChangedState(int state) {
            RFIDCallback rfidCallback = mRFIDCallback;
            if (rfidCallback != null) {
                rfidCallback.dispatchonNotifyChangedState(state);
            }
        }

        public void releaseRFIDCallback() {
            mRFIDCallback = null;
        }
    }
}
