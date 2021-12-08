package device.common;

import android.view.KeyEvent;

public class ScanConst {
    public static final String TAG = "ScannerService";
    public static final boolean DEBUG = false;

    public static final String ENABLED_SCANNER_ACTION = "device.common.ENABLED_SCANNER";
    public static final String EXTRA_ENABLED_SCANNER = "EXTRA_ENABLED_SCANNER";
    public static final String ENABLED_TRIGGER_ACTION = "device.common.ENABLED_TRIGGER";
    public static final String EXTRA_ENABLED_TRIGGER = "EXTRA_ENABLED_TRIGGER";
    public static final String ENABLED_CAMERA_SYNC = "device.common.CAMERA_SYNC";
	public static final String ENABLED_TOUCHSCAN_ACTION = "device.commom.ENABLED_TOUCHSCAN";
	public static final String EXTRA_ENABLED_TOUCHSCAN = "EXTRA_ENABLED_TOUCHSCAN";
	public static final String READ_TOUCHSCAN_STATE_ACTION = "device.commom.READ_TOUCHSCAN_STATE";
	public static final String STATE_TOUCHSCAN_ACTION = "device.commom.STATE_TOUCHSCAN";
	public static final String EXTRA_TOUCHSCAN_STATE = "EXTRA_TOUCHSCAN_STATE";
    public static final String EXTRA_ENABLED_CAMERASYNC = "EXTRA_ENABLED_CAMERASYNC";
    public static final String LAUNCH_SCAN_SETTING_ACITON = "device.common.LAUNCH_SCAN_SETTING";
    public static final String INTENT_USERMSG = "device.common.USERMSG";
    public static final String EXTRA_USERMSG = "EXTRA_USERMSG";
    public static final String EXTRA_NOTIFY_TIME = "EXTRA_NOTIFY_TIME";
    public static final String INTENT_SCANKEY_EVENT = "device.common.SCANKEY_EVENT";
    public static final String EXTRA_SCANKEY_EVENT = "EXTRA_SCANKEY";
    public static final String INTENT_SCAN_STATE = "device.common.SCAN_STATE";
    public static final String EXTRA_SCAN_STATE = "EXTRA_SCAN_STATE";
    public static final String INTENT_EVENT = "device.scanner.EVENT";
    public static final String EXTRA_EVENT_DECODE_RESULT = "EXTRA_EVENT_DECODE_RESULT";
    public static final String EXTRA_EVENT_DECODE_LENGTH = "EXTRA_EVENT_DECODE_LENGTH";
    public static final String EXTRA_EVENT_DECODE_VALUE = "EXTRA_EVENT_DECODE_VALUE";
    public static final String EXTRA_EVENT_DECODE_LETTER = "EXTRA_EVENT_DECODE_LETTER";
    public static final String EXTRA_EVENT_DECODE_MODIFIER = "EXTRA_EVENT_DECODE_MODIFIER";
    public static final String EXTRA_EVENT_DECODE_TIME = "EXTRA_EVENT_DECODE_TIME";
    public static final String EXTRA_EVENT_SYMBOL_NAME = "EXTRA_EVENT_SYMBOL_NAME";
    public static final String EXTRA_EVENT_SYMBOL_ID = "EXTRA_EVENT_SYMBOL_ID";
    public static final String EXTRA_EVENT_SYMBOL_TYPE = "EXTRA_EVENT_SYMBOL_TYPE";
    public static final String EXTRA_EVENT_BYTES_LENGTH = "EXTRA_EVENT_BYTES_LENGTH";
    public static final String EXTRA_EVENT_BYTES_VALUE = "EXTRA_EVENT_BYTES_VALUE";
    public static final String EXTRA_EVENT_SOURCE = "EXTRA_EVENT_SOURCE";
    public static final String INTENT_LASER_CALIBRATION = "device.common.LASER_CALIBRATION";
    public static final String EXTRA_LASER_CALIBRATION_RESULT = "EXTRA_LASER_CALIBRATION_RESULT";
    public static final String GOOD_BEEP_FILE = "ScanSuccess.wav";
    public static final String BAD_BEEP_FILE = "ScanFail.wav";
    public static final String FINAL_BEEPS_PATH = "/data/system/scanner";
    public static final String FINAL_GOOD_BEEP_FILE_PATH = FINAL_BEEPS_PATH + "/" + GOOD_BEEP_FILE;
    public static final String FINAL_BAD_BEEP_FILE_PATH = FINAL_BEEPS_PATH + "/" + BAD_BEEP_FILE;
    public static final String SCANNER_SOURCE_IMAGER = "dev.scanner.imager";
    public static final String SCANNER_SOURCE_LASER = "dev.scanner.laser";
    public static final int NOTIFICATION_ID_SCANNER = 27155275;
    public static final int NOTIFICATION_ID_LED = 27155276;
    public static final int NOTIFY_SCANNER_GONE = -1;
    public static final int NOTIFY_SCANNER_DISABLE = 0;
    public static final int NOTIFY_SCANNER_ENABLE = 1;
    public static final int NOTIFY_SCANNER_RESUME = 0;
    public static final int NOTIFY_SCANNER_SUSPEND = 1;
    public static final int CLIPBOARD_CHANGE_MSG = 0;
    public static final int SCANNER_CHANGE_MSG = 1;
    public static final int SCREEN_CHANGE_MSG = 2;
    public static final int CHANGED_STATE_MSG = 3;
	public static final int STATE_REJECTED_GETTING_VALUE = -2;
	public static final int STATE_FAILED_TO_DO_SOMETHING = -1;
    public static final int STATE_INIT = 0;
    public static final int STATE_TURNING_ON = 1;
    public static final int STATE_ON = 2;
    public static final int STATE_TURNING_OFF = 3;
    public static final int STATE_OFF = 4;
	public static final int STATE_LOCK_BY_CAMERA = 5;
	public static final int STATE_UNLOCK_BY_CAMERA = 6;
	public static final int STATE_CAMERA_ON = 7;
	public static final int STATE_CAMERA_OFF = 8;
	public static final int STATE_SUSPENDING = 9;
	public static final int STATE_SUSPEND_DONE = 10;
	public static final int STATE_RESUMING = 11;
	public static final int STATE_RESUME_DONE = 12;
    public static final int KEYCODE_SCAN_FRONT = 1010; // KeyEvent.KEYCODE_SCANNER_F;
    public static final int KEYCODE_SCAN_RIGHT = 1011; // KeyEvent.KEYCODE_SCANNER_R;
    public static final int KEYCODE_SCAN_LEFT = 1012; // KeyEvent.KEYCODE_SCANNER_L;
    public static final int KEYCODE_SCAN_REAR = 1013; // KeyEvent.KEYCODE_SCANNER_B;
    public static final int RESULT_USERMSG = 0;
    public static final int RESULT_KBDMSG = 1;
    public static final int RESULT_COPYPASTE = 2;
    public static final int RESULT_EVENT = 3;
    public static final int RESULT_CUSTOM_INTENT = 4;
    public static final int RESULT_CTRLV = 5;
    // public static final int RESULT_CALLBACK = 4; /* Current Not Used */
    public static final String RESULT_TYPE[] = {
                                                "RESULT_USERMSG",
                                                "RESULT_KBDMSG",
                                                "RESULT_COPYPASTE",
                                                "RESULT_EVENT",
                                                "RESULT_CUSTOM_INTENT",
                                                "RESULT_CTRLV"
                                                //"RESULT_CALLBACK"
                                                };
    public final static class SymbologyID {
		private SymbologyID() {}
		public static final int DCD_SYM_NIL = 0;
		public static final int DCD_SYM_AIRLINE_2OF5_13_DIGIT = 1;
		public static final int DCD_SYM_AIRLINE_2OF5_15_DIGIT = 2;
		public static final int DCD_SYM_AZTEC = 3;
		public static final int DCD_SYM_AUSTRALIAN_POSTAL = 4;
		public static final int DCD_SYM_BOOKLAND_EAN = 5;
		public static final int DCD_SYM_BPO = 6;
		public static final int DCD_SYM_CANPOST = 7;
		public static final int DCD_SYM_CHINAPOST = 8;
		public static final int DCD_SYM_CHINESE_2OF5 = 9;
		public static final int DCD_SYM_CODABAR = 10;
		public static final int DCD_SYM_CODABLOCK = 11;
		public static final int DCD_SYM_CODE11 = 12;
		public static final int DCD_SYM_CODE128 = 13;
		public static final int DCD_SYM_CODE16K = 14;
		public static final int DCD_SYM_CODE32 = 15;
		public static final int DCD_SYM_CODE39 = 16;
		public static final int DCD_SYM_CODE49 = 17;
		public static final int DCD_SYM_CODE93 = 18;
		public static final int DCD_SYM_COMPOSITE = 19;
		public static final int DCD_SYM_COUPON_CODE = 20;
		public static final int DCD_SYM_DATAMATRIX = 21;
		public static final int DCD_SYM_DISCRETE_2OF5 = 22;
		public static final int DCD_SYM_DUTCH_POSTAL = 23;
		public static final int DCD_SYM_EAN128 = 24;
		public static final int DCD_SYM_EAN13 = 25;
		public static final int DCD_SYM_EAN8 = 26;
		public static final int DCD_SYM_GS1_DATABAR_14 = 27;
		public static final int DCD_SYM_GS1_DATABAR_EXPANDED = 28;
		public static final int DCD_SYM_GS1_DATABAR_LIMITED = 29;
		public static final int DCD_SYM_HONGKONG_2OF5 = 30;
		public static final int DCD_SYM_IATA_2OF5 = 31;
		public static final int DCD_SYM_IDTAG = 32;
		public static final int DCD_SYM_INTERLEAVED_2OF5 = 33;
		public static final int DCD_SYM_ISBT128 = 34;
		public static final int DCD_SYM_JAPANESE_POSTAL = 35;
		public static final int DCD_SYM_KOREAN_POSTAL = 36;
		public static final int DCD_SYM_MATRIX_2OF5 = 37;
		public static final int DCD_SYM_MAXICODE = 38;
		public static final int DCD_SYM_MESA = 39;
		public static final int DCD_SYM_MICRO_PDF417 = 40;
		public static final int DCD_SYM_MICRO_QR = 41;
		public static final int DCD_SYM_MSI = 42;
		public static final int DCD_SYM_NEC_2OF5 = 43;
		public static final int DCD_SYM_OCR = 44;
		public static final int DCD_SYM_PDF417 = 45;
		public static final int DCD_SYM_PLESSEY = 46;
		public static final int DCD_SYM_POSICODE = 47;
		public static final int DCD_SYM_POST_US4 = 48;
		public static final int DCD_SYM_QR = 49;
		public static final int DCD_SYM_STRAIGHT_2OF5 = 50;
		public static final int DCD_SYM_STANDARD_2OF5 = 51;
		public static final int DCD_SYM_TELEPEN = 52;
		public static final int DCD_SYM_TLCODE39 = 53;
		public static final int DCD_SYM_TRIOPTIC = 54;
		public static final int DCD_SYM_UK_POSTAL = 55;
		public static final int DCD_SYM_UPCA = 56;
		public static final int DCD_SYM_UPCE = 57;
		public static final int DCD_SYM_UPCE1 = 58;
		public static final int DCD_SYM_US_PLANET = 59;
		public static final int DCD_SYM_US_POSTNET = 60;
		public static final int DCD_SYM_USPS_4CB = 61;
		public static final int DCD_SYM_RSS = 62;
		public static final int DCD_SYM_LABEL = 63;
		public static final int DCD_SYM_HANXIN = 64;
		public static final int DCD_SYM_GRIDMATRIX = 65;
		public static final int DCD_SYM_INFO_MAIL = 66;
		public static final int DCD_SYM_INTELLIGENT_MAIL = 67;
		public static final int DCD_SYM_SWEDENPOST = 68;
		public static final int DCD_SYM_DOTCODE = 69;
		public static final int DCD_SYM_LAST = 70;
	}
	public final static class ScannerType {
		private ScannerType() {}
		public static final int DCD_MODULE_TYPE_UNKNOWN = -1;
		public static final int DCD_MODULE_TYPE_NONE	= 0;
		public static final int DCD_MODULE_TYPE_IT4000  = 5;
		public static final int DCD_MODULE_TYPE_IT4100  = 6;
		public static final int DCD_MODULE_TYPE_IT4300  = 7;
		public static final int DCD_MODULE_TYPE_IT5100  = 8;
		public static final int DCD_MODULE_TYPE_IT5300  = 9;
		public static final int DCD_MODULE_TYPE_N5603   = 12;
		public static final int DCD_MODULE_TYPE_N5600   = 13;
		public static final int DCD_MODULE_TYPE_IS4813  = 14;
		public static final int DCD_MODULE_TYPE_HI704A  = 15;
		public static final int DCD_MODULE_TYPE_N4313   = 16;
		public static final int DCD_MODULE_TYPE_N6603   = 17;
		public static final int DCD_MODULE_TYPE_EX25     = 18;
		public static final int DCD_MODULE_TYPE_EX30     = 19;
		public static final int DCD_MODULE_TYPE_SE955   = 20;
		public static final int DCD_MODULE_TYPE_SE4500  = 21;
		public static final int DCD_MODULE_TYPE_SE655   = 22;
		public static final int DCD_MODULE_TYPE_SE965   = 23;
		public static final int DCD_MODULE_TYPE_SE4710  = 24;
		public static final int DCD_MODULE_TYPE_UE966   = 25;
		public static final int DCD_MODULE_TYPE_CR8000  = 26;
		public static final int DCD_MODULE_TYPE_SE4750  = 27;
		public static final int DCD_MODULE_TYPE_MDL1500 = 28;
		public static final int DCD_MODULE_TYPE_N6703   = 29;
		public static final int DCD_MODULE_TYPE_N3601   = 31;
		public static final int DCD_MODULE_TYPE_N3603   = 32;
		public static final int DCD_MODULE_TYPE_N2600   = 33;
		public static final int DCD_MODULE_TYPE_N4603   = 34;
	}
	public final static class TriggerMode {
		private TriggerMode() {}
		public static final int DCD_TRIGGER_MODE_ONESHOT = 0;
		public static final int DCD_TRIGGER_MODE_AUTO = 1;
		public static final int DCD_TRIGGER_MODE_CONTINUOUS = 2;
		public static final int DCD_TRIGGER_MODE_MULTI = 3;
		public static final int DCD_TRIGGER_MODE_MULTI_ONCE = 4;
		public static final int DCD_TRIGGER_MODE_PRESS_DECODING = 5;
		public static final int DCD_TRIGGER_MODE_RELEASE_DECODING = 6;
	}
	public final static class Terminator {
		private Terminator() {}
		public static final int DCD_TERMINATOR_NONE = 0;
		/**
	     * @deprecated use DCD_TERMINATOR_LF instead.
	     */
		public static final int DCD_TERMINATOR_CRLF = 1;
		public static final int DCD_TERMINATOR_SPACE = 2;
		public static final int DCD_TERMINATOR_TAB = 3;
		/**
	     * @deprecated use DCD_TERMINATOR_LF instead.
	     */
		public static final int DCD_TERMINATOR_CR = 4;
		public static final int DCD_TERMINATOR_LF = 5;
		/**
	     * @deprecated use DCD_TERMINATOR_TAB_LF instead.
	     */
		public static final int DCD_TERMINATOR_TAB_CRLF = 6;
		public static final int DCD_TERMINATOR_TAB_LF = DCD_TERMINATOR_TAB_CRLF;
	}
	public final static class ResultType {
		private ResultType() {}
		public static final int DCD_RESULT_USERMSG = 0;
		public static final int DCD_RESULT_KBDMSG = 1;
		public static final int DCD_RESULT_COPYPASTE = 2;
		public static final int DCD_RESULT_EVENT = 3;
		public static final int DCD_RESULT_CUSTOM_INTENT = 4;
		public static final int DCD_RESULT_CTRLV = 5;
	}
	public final static class PowerSaveMode {
		private PowerSaveMode() {}
		public static final int POWER_SAVE_OFF = 0;
		public static final int POWER_SAVE_SLEEP = 1;
		public static final int POWER_SAVE_HIBERNATE = 2;
	}
	public final static class LightMode {
		private LightMode() {}
		public static final int DCD_LIGHT_MODE_OFF = 0;
		public static final int DCD_LIGHT_MODE_AIM_ON = 1;
		public static final int DCD_LIGHT_MODE_ILLUM_ON = 2;
		public static final int DCD_LIGHT_MODE_ON = 3;
	}
	public final static class OCRFont {
		private OCRFont() {}
		public static final int DCD_OCRFONT_DISABLED = 0;
		public static final int DCD_OCRFONT_A = 1;
		public static final int DCD_OCRFONT_B = 2;
		public static final int DCD_OCRFONT_MONEY = 3;
	}
	public final static class DecodeMode {
		private DecodeMode() {}
		public static final int DCD_DECODE_MODE_STANDARD = 0;
		/**
	     * @deprecated
	     */
		public static final int DCD_DECODE_MODE_QUICK_OMNI = 1;
		public static final int DCD_DECODE_MODE_PRIORITY_2D = 1;
		public static final int DCD_DECODE_MODE_FIXED_FOCUS = 2;
	}
	public final static class ScanMode {
		private ScanMode() {}
		public static final int DCD_MODE_SCAN = 0;
		public static final int DCD_MODE_IMAGE = 1;
	}
	public final static class RedundancyLevel {
		private RedundancyLevel() {}
		public static final int LEVEL_1 = 1;
		public static final int LEVEL_2 = 2;
		public static final int LEVEL_3 = 3;
		public static final int LEVEL_4 = 4;
	}
	public final static class SecurityLevel {
		private SecurityLevel() {}
		public static final int LEVEL_0 = 0;
		public static final int LEVEL_1 = 1;
		public static final int LEVEL_2 = 2;
		public static final int LEVEL_3 = 3;
	}
	public final static class LinearSecurityLevel {
		private LinearSecurityLevel() {}
		public static final int LEVEL_1 = 1;
		public static final int LEVEL_2 = 2;
		public static final int LEVEL_3 = 3;
		public static final int LEVEL_4 = 4;
	}
	public final static class Inverse1DMode {
		private Inverse1DMode() {}
		public static final int REGULAR_ONLY = 0;
		public static final int INVERSE_ONLY = 1;
		public static final int INVERSE_AUTODETECT = 2;
	}
	public final static class QuietZone1DLevel {
		private QuietZone1DLevel() {}
		public static final int LEVEL_0 = 0;
		public static final int LEVEL_1 = 1;
		public static final int LEVEL_2 = 2;
		public static final int LEVEL_3 = 3;
	}
	public final static class IntercharacterGapSize {
		private IntercharacterGapSize() {}
		public static final int NORMAL = 6;
		public static final int LARGE = 10;
	}
	public final static class ActionIndex {
		private ActionIndex() {}
		public static final int ACTION_MOVE_TO_AFTER = 0;
		public static final int ACTION_MOVE_TO_BEFORE = 1;
		public static final int ACTION_MOVE_TO_START = 2;
		public static final int ACTION_MOVE_TO_STRING_FORWARD = 3;
		public static final int ACTION_MOVE_TO_STRING_BACKWARD = 4;
		public static final int ACTION_REMOVE_SPACE = 5;
		public static final int ACTION_REMOVE_ALL_SPACE = 6;
		public static final int ACTION_REMOVE_ZERO = 7;
		public static final int ACTION_REMOVE_ALL_ZERO = 8;
		public static final int ACTION_FILL_ZERO = 9;
		public static final int ACTION_FILL_SPACE = 10;
		public static final int ACTION_CHANGE_STRING = 11;
		public static final int ACTION_SEND_NEXT = 12;
		public static final int ACTION_SEND_REMAINING = 13;
		public static final int ACTION_SEND_FIND_STRING = 14;
		public static final int ACTION_SEND_DELAY = 15;
		public static final int ACTION_SEND_STRING = 16;
		public static final int ACTION_SEND_CHAR = 17;
		public static final int ACTION_MOVE_CHAR_FORWARD = 18;
		public static final int ACTION_MOVE_CHAR_BACKWARD = 19;
		public static final int ACTION_REMOVE_CHAR = 20;
		public static final int ACTION_REMOVE_ALL_CHAR = 21;
		public static final int ACTION_CHANGE_CHAR = 22;
		public static final int ACTION_CHANGE_ALL_STRING = 23;
		public static final int ACTION_CHANGE_ALL_CHAR = 24;
		public static final int ACTION_LAST = 25;
	}
	public final static class ScanAngle {
		private ScanAngle() {}
		public static final int DISABLE = 0;
		public static final int NARROW = 1;
		public static final int MIDDLE = 2;
		public static final int WIDE = 3;
	}
	public final static class LastError {
		private LastError() {}
		public static final int ERROR_NO_ERROR = 0;
		public static final int ERROR_NOT_SUPPORTED = 1;
		public static final int ERROR_INVALID_PARAMETER = 2;
		public static final int ERROR_CANCELLED = 3;
	}
}
