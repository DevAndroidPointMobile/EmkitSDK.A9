package device.common;

public class MsrIndex {
	//________________________________________
	public final static int MMD1000_READ_OK				= 0;
	public final static int MMD1000_READ_ERROR			= 1;
	public final static int MMD1000_CRC_ERROR			= 2;
	public final static int MMD1000_NOINFOSTORE			= 3;
	public final static int MMD1000_AES_INIT_NOT_SET	= 4;
	public final static int MMD1000_READ_PREAMBLE_ERROR = 5;
	public final static int MMD1000_READ_POSTAMBLE_ERROR = 6;
	public final static int MMD1000_READ_LRC_ERROR		= 7;
	public final static int MMD1000_READ_PARITY_ERROR	= 8;
	public final static int MMD1000_BLANK_TRACK			= 9;
	public final static int MMD1000_CMD_STXETX_ERROR	= 10;
	public final static int MMD1000_CMD_UNRECOGNIZABLE	= 11;
	public final static int MMD1000_CMD_BCC_ERROR		= 12;
	public final static int MMD1000_CMD_LENGTH_ERROR	= 13;
	public final static int MMD1000_READ_NO_DATA		= 14;
	public final static int MMD1000_OTP_NO_MORE_SPACE	= 15;
	public final static int MMD1000_OTP_WRITE_WITHOUT_DATA	= 16;
	public final static int MMD1000_OTP_CRC_ERROR		= 17;
	public final static int MMD1000_OTP_NO_DATA_STORED	= 18;
	public final static int MMD1000_READ_STOP           = 19;

	public final static int MMD1000_DEVICE_READ_TIMEOUT		= 20;
	public final static int MMD1000_DEVICE_POWER_DISABLE	= 21;
	public final static int MMD1000_DEVICE_NOT_OPENED		= 22;
	public final static int MMD1000_DEVICE_DATA_CLEARED		= 23;

	//________________________________________
	public final static int MMD1000_POWER_ON_CMD		= 0x11<<8;
	public final static int MMD1000_POWER_OFF_CMD		= 0x12<<8;
	public final static int MMD1000_READSTART_CMD		= 0x13<<8;
	public final static int MMD1000_READSTOP_CMD		= 0x14<<8;
}
