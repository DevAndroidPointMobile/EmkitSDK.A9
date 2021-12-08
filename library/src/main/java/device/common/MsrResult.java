package device.common;

import android.os.Parcel;
import android.os.Parcelable;

public class MsrResult implements Parcelable {
	/**
	* Track type
	*/
	public int msr_read_track_type;
	public int msr_read_track_error;
	public String msr_track1;
	public String msr_track2;
	public String msr_track3;
	private int readerType;
	private String displayCardNo;
	private int cardLength;
	///<BEGIN>[lowdata][olivia.gyeong] - 2018.04.02 changed callback API for lowdata
    public int msr_track1_buf_Len;
    public int msr_track2_buf_Len;
    public int msr_track3_buf_Len;

    public byte[] msr_track1_buf;
    public byte[] msr_track2_buf;
    public byte[] msr_track3_buf;
	///< END >[lowdata][olivia.gyeong] - 2018.04.02 changed callback API for lowdata
	
	public static final Parcelable.Creator<MsrResult> CREATOR
	        = new Parcelable.Creator<MsrResult>() {
        public MsrResult createFromParcel(Parcel in) {
            return new MsrResult(in);
        }

        public MsrResult[] newArray(int size) {
            return new MsrResult[size];
        }
    };

    public MsrResult() {
    }

    private MsrResult(Parcel in) {
        readFromParcel(in);
    }

    public void readFromParcel(Parcel in) {
        msr_read_track_type = in.readInt();
        msr_read_track_error = in.readInt();
        msr_track1 = in.readString();
		msr_track2 = in.readString();
		msr_track3 = in.readString();
		readerType = in.readInt();
		displayCardNo = in.readString();
		cardLength = in.readInt();

///<BEGIN>[lowdata][olivia.gyeong] - 2018.04.02 changed callback API for lowdata
        msr_track1_buf_Len =  in.readInt();
        msr_track2_buf_Len =  in.readInt();
        msr_track3_buf_Len =  in.readInt();

        if (msr_track1_buf_Len > 0) {
            msr_track1_buf = new byte[msr_track1_buf_Len];
            in.readByteArray(msr_track1_buf);
        }
        if (msr_track2_buf_Len > 0) {
            msr_track2_buf = new byte[msr_track2_buf_Len];
            in.readByteArray(msr_track2_buf);
        }
        if (msr_track3_buf_Len > 0) {
            msr_track3_buf = new byte[msr_track3_buf_Len];
            in.readByteArray(msr_track3_buf);
        }
    }
///< END >[lowdata][olivia.gyeong] - 2018.04.02 changed callback API for lowdata

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(msr_read_track_type);
        dest.writeInt(msr_read_track_error);
        dest.writeString(msr_track1);
		dest.writeString(msr_track2);
		dest.writeString(msr_track3);
		dest.writeInt(readerType);
		dest.writeString(displayCardNo);
		dest.writeInt(cardLength);

///<BEGIN>[lowdata][olivia.gyeong] - 2018.04.02 changed callback API for lowdata
        dest.writeInt(msr_track1_buf_Len);
        dest.writeInt(msr_track2_buf_Len);
        dest.writeInt(msr_track3_buf_Len);

        if (msr_track1_buf != null) {
            dest.writeByteArray(msr_track1_buf);
        }
        if (msr_track2_buf != null) {
            dest.writeByteArray(msr_track2_buf);
        }
        if (msr_track3_buf != null) {
            dest.writeByteArray(msr_track3_buf);
        }
///< END >[lowdata][olivia.gyeong] - 2018.04.02 changed callback API for lowdata
    }

	public int getMsrReadType() {
        return msr_read_track_type;
    }

	public void setMsrReadType(int MsrReadType) {
        msr_read_track_type = MsrReadType;
    }

	public int getMsrReadError() {
        return msr_read_track_error;
    }

	public void setMsrReadError(int MsrReadError) {
        msr_read_track_error = MsrReadError;
    }

	public String getMsrTrack1() {
        return msr_track1;
    }

	public void setMsrTrack1(String track) {
        msr_track1 = track;
    }

	public String getMsrTrack2() {
        return msr_track2;
    }

	public void setMsrTrack2(String track) {
        msr_track2 = track;
    }

	public String getMsrTrack3() {
        return msr_track3;
    }

	public void setMsrTrack3(String track) {
        msr_track3 = track;
    }

    public int getReaderType() {
        return readerType;
    }

    public void setReaderType(int type) {
        readerType = type;
    }

    public String getDisplayCardNo() {
        return displayCardNo;
    }

    public void setDisplayCardNo(String number) {
        displayCardNo = number;
    }

    public int getCardLength() {
        return cardLength;
    }

    public void setCardLength(int length) {
        cardLength = length;
    }

	///<BEGIN>[lowdata][olivia.gyeong] - 2018.04.02 changed callback API for lowdata
    public void setMsrTrack1Buf(byte[] track) {
        msr_track1_buf = track;
    }
    public void setMsrTrack2Buf(byte[] track) {
        msr_track2_buf = track;
    }
    public void setMsrTrack3Buf(byte[] track) {
        msr_track3_buf = track;
    }
    public byte[] getMsrTrack1Buf() {
        return msr_track1_buf;
    }
    public byte[] getMsrTrack2Buf() {
        return msr_track2_buf;
    }
    public byte[] getMsrTrack3Buf() {
        return msr_track3_buf;
    }
    public void setMsrTrack1BufLen(int length) {
        msr_track1_buf_Len= length;
    }
    public void setMsrTrack2BufLen(int length) {
        msr_track2_buf_Len = length;
    }
    public void setMsrTrack3BufLen(int length) {
        msr_track3_buf_Len = length;
    }
    public int getMsrTrack1BufLen() {
        return msr_track1_buf_Len;
    }
    public int getMsrTrack2BufLen() {
        return msr_track2_buf_Len;
    }
    public int getMsrTrack3BufLen() {
        return msr_track3_buf_Len;
    }
	///<END>[lowdata][olivia.gyeong] - 2018.04.02 changed callback API for lowdata
}
