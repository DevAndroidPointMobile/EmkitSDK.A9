package device.common.rfid;

import android.os.Parcel;
import android.os.Parcelable;

public class CustomIntentConfig implements Parcelable {

    public String action;
    public String category;
	public String extraRfidData;
    /*public String extraRfidTime;
    public String extraRfidRssi;
    public String extraRfidChannel;
    public String extraRfidTemp;
    public String extraRfidPhase;
    public String extraRfidAnt;*/

    public static final Parcelable.Creator<CustomIntentConfig> CREATOR
        = new Parcelable.Creator<CustomIntentConfig>() {
            public CustomIntentConfig createFromParcel(Parcel in) {
                return new CustomIntentConfig(in);
            }

            public CustomIntentConfig [] newArray(int size) {
                return new CustomIntentConfig [size];
            }
        };

    /**
     * Constructor of CustomIntentConfig.
     */
    public CustomIntentConfig() {
    }

    private CustomIntentConfig(Parcel in) {
        readFromParcel(in);
    }

    /**
     * Set the rectangle's coordinates from the data stored in the specified parcel.
     *
     * @param in  The parcel to read the rectangle's coordinate from
     *
     * @see   writeToParcel()
     */
    public void readFromParcel(Parcel in) {
       action = in.readString();
       category = in.readString();
	   extraRfidData = in.readString();
	   /*extraRfidTime = in.readString();
	   extraRfidRssi = in.readString();
	   extraRfidChannel = in.readString();
	   extraRfidTemp = in.readString();
	   extraRfidPhase = in.readString();
	   extraRfidAnt = in.readString();*/
    }

    /**
     * Describe the kinds of special objects contained in this Parcelable's marchalled representation.
     */
    @Override
    public int describeContents() {
        return 0;
    }

    /**
     * Write this rectangle to the specified parcel.
     *
     * @param dest   The parcel to write the rectangle's coordinate into
     * @param flags  Additional flags about how the object should be written. Unused.
     *
     * @see   readFromParcel()
     */
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(action);
        dest.writeString(category);
		dest.writeString(extraRfidData);
		/*dest.writeString(extraRfidTime);
		dest.writeString(extraRfidRssi);
		dest.writeString(extraRfidChannel);
		dest.writeString(extraRfidTemp);
		dest.writeString(extraRfidPhase);
		dest.writeString(extraRfidAnt);*/
    }
}
