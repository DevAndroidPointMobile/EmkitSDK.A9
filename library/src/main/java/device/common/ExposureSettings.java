package device.common;

import android.os.Parcel;
import android.os.Parcelable;

public class ExposureSettings implements Parcelable {

    /**
	* Maximum allowable exposure setting for the Imager. (1~7874).
	*/
    public int maxExpousre;

    /**
	* Maximum allowable gain for the Imager. (1~4).
	*/
    public int maxGain;

    /**
	* Target white value. (1~255).
	*/
    public int targetValue;

    /**
	* Target Percentile value. (1~99).
	*/
    public int targetPercentile;

    /**
	* Target acceptcap value. (1~50).
	*/
    public int targetAcceptGap;

    public static final Parcelable.Creator<ExposureSettings> CREATOR
            = new Parcelable.Creator<ExposureSettings>() {
        public ExposureSettings createFromParcel(Parcel in) {
            return new ExposureSettings(in);
        }

        public ExposureSettings[] newArray(int size) {
            return new ExposureSettings[size];
        }
    };

    public ExposureSettings() {
    }

    private ExposureSettings(Parcel in) {
        readFromParcel(in);
    }

    public void readFromParcel(Parcel in) {
        maxExpousre = in.readInt();
        maxGain = in.readInt();
        targetValue = in.readInt();
        targetPercentile = in.readInt();
        targetAcceptGap = in.readInt();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(maxExpousre);
        dest.writeInt(maxGain);
        dest.writeInt(targetValue);
        dest.writeInt(targetPercentile);
        dest.writeInt(targetAcceptGap);
    }
}
