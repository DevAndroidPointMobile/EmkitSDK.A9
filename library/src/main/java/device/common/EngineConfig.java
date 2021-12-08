package device.common;

import android.os.Parcel;
import android.os.Parcelable;

public class EngineConfig implements Parcelable {
    public int engineID;
    public int imagerRows;
    public int imagerCols;
    public int bitsPerPixel;
    public int roation;
    public int aimerXoffset;
    public int aimerYoffset;
    public int YDepth;

    public static final Parcelable.Creator<EngineConfig> CREATOR
            = new Parcelable.Creator<EngineConfig>() {
        public EngineConfig createFromParcel(Parcel in) {
            return new EngineConfig(in);
        }

        public EngineConfig[] newArray(int size) {
            return new EngineConfig[size];
        }
    };

    public EngineConfig() {
    }

    private EngineConfig(Parcel in) {
        readFromParcel(in);
    }

    public void readFromParcel(Parcel in) {
        engineID = in.readInt();
        imagerRows = in.readInt();
        imagerCols = in.readInt();
        bitsPerPixel = in.readInt();
        roation = in.readInt();
        aimerXoffset = in.readInt();
        aimerYoffset = in.readInt();
        YDepth = in.readInt();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(engineID);
        dest.writeInt(imagerRows);
        dest.writeInt(imagerCols);
        dest.writeInt(bitsPerPixel);
        dest.writeInt(roation);
        dest.writeInt(aimerXoffset);
        dest.writeInt(aimerYoffset);
        dest.writeInt(YDepth);
    }
}
