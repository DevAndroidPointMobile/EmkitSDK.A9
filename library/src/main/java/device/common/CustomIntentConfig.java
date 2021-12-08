package device.common;

import android.os.Parcel;
import android.os.Parcelable;

public class CustomIntentConfig implements Parcelable {

    public String action;
    public String category;
    public String extraDecodeResult;
    public String extraDecodeBytesValue;
	public String extraDecodeStringValue;
    public String extraDecodeLength;
    public String extraDecodeLetter;
    public String extraDecodeModifier;
    public String extraDecodeTime;
    public String extraSymbolName;
    public String extraSymbolId;
    public String extraSymbolType;
    public String extraSource;

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
       extraDecodeResult = in.readString();
       extraDecodeBytesValue = in.readString();
	   extraDecodeStringValue = in.readString();
       extraDecodeLength = in.readString();
       extraDecodeLetter = in.readString();
       extraDecodeModifier = in.readString();
       extraDecodeTime = in.readString();
       extraSymbolName = in.readString();
       extraSymbolId = in.readString();
       extraSymbolType = in.readString();
       extraSource = in.readString();
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
        dest.writeString(extraDecodeResult);
        dest.writeString(extraDecodeBytesValue);
		dest.writeString(extraDecodeStringValue);
        dest.writeString(extraDecodeLength);
        dest.writeString(extraDecodeLetter);
        dest.writeString(extraDecodeModifier);
        dest.writeString(extraDecodeTime);
        dest.writeString(extraSymbolName);
        dest.writeString(extraSymbolId);
        dest.writeString(extraSymbolType);
        dest.writeString(extraSource);
    }
}