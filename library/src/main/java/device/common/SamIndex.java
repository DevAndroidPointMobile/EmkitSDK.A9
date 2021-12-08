package device.common;

public class SamIndex {
	//________________________________________
	public final static int TDA8029_OK					= 0;
	public final static int TDA8029_ERROR				= 1;
	public final static int TDA8029_PACKETPATTERNNOK	= 2;
	public final static int TDA8029_PACKETPATTERNERROR	= 3;
	public final static int TDA8029_PACKETRESBADCMD		= 4;
	public final static int TDA8029_PACKETBADLENGTH		= 5;
	public final static int TDA8029_BUFFERTOOSMALL		= 6;
	public final static int TDA8029_COMMERROR			= 7;
	public final static int TDA8029_PACKETBADCHECKSUM	= 8;
	public final static int TDA8029_CARDDETECTFAILED	= 9;

	//________________________________________
	public final static int PKT_PATTERN_OK			= 0x60;
	public final static int PKT_PATTERN_NOK			= 0xE0;
	public final static int PKT_MAX_DATA_SIZE		= 506;
	public final static int MAX_PKT_BUF_SIZE		= (PKT_MAX_DATA_SIZE + 5);
	
	//________________________________________
	public final static int PKT_PATTERN_OFFSET		= 0;
	public final static int PKT_MSBLEN_OFFSET		= 1;
	public final static int PKT_LSBLEN_OFFSET		= 2;
	public final static int PKT_CMD_OFFSET			= 3;
	public final static int PKT_DATA_OFFSET			= 4;
	//________________________________________
	public final static int PKT_CMD_MASK			= 0x0A;
	public final static int PKT_CMD_GETREADERSTATUS	= 0xAA;
	public final static int PKT_CMD_CHECKCARDPRES	= 0x09;
	public final static int PKT_CMD_ATR			= 0x69;// modified 5V power up->iso power
	public final static int PKT_CMD_APDU			= 0x00;
	public final static int PKT_CMD_POWER_OFF		= 0x4d;

    // Receiver status
	public final static int PKT_RETRY = 4;

	public final static int STATE_NOTHING   = 0;
	public final static int STATE_PROCESS   = 1;
	public final static int STATE_RES_BEGIN = 2;
	public final static int STATE_RES_DONE  = 3;
	public final static int STATE_RES_LEN_ERROR = 4;
	public final static int STATE_RES_CRC_ERROR = 5;
	public final static int STATE_RES_TIMEOUT = 6;
}
