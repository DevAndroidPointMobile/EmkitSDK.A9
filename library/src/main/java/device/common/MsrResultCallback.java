package device.common;

import android.util.Log;

public abstract class MsrResultCallback {
    private static final String TAG = "MsrResultCallback";

    public void onResult(int cmd, int status) {
        Log.d(TAG, "onResult: " + cmd + "Status: " + status);
    }
	///<BEGIN>[lowdata][olivia.gyeong] - 2018.04.02 changed callback API for lowdata
    public void onResultData(int cmd, int status, byte[] data) {
    }
    public void onResultTrackData(int cmd, int status, byte[] track1Buf, byte[] tract2, byte[] tract3){
    }
	///< END >[lowdata][olivia.gyeong] - 2018.04.02 changed callback API for lowdata
}
