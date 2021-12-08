package device.common.rfid;


public class RFIDConst {
    public static final String TAG = "RFIDService";
    public static final boolean DEBUG = false;

    public final static class DeviceType {
        private DeviceType() {}
        public static final int DEVICE_UNKNOWN = 0;
        public static final int DEVICE_BT = 1;
        public static final int DEVICE_USB = 2;
        public static final int DEVICE_UART = 3;
    }

    public static class DeviceState {
        private DeviceState() {}
        public final static int BT_CONNECTED = 1;
        public final static int BT_DISCONNECTED = 2;
        public final static int BT_OPENED = 3;
        public final static int BT_CLOSED = 4;
        public final static int USB_OPENED = 5;
        public final static int USB_CLOSED = 6;
        public final static int UART_OPENED = 7;
        public final static int UART_CLOSED = 8;
        public final static int TRIGGER_MODE_RFID = 9;
        public final static int TRIGGER_MODE_SCAN = 10;
        public final static int TRIGGER_RFID_KEYDOWN = 11;
        public final static int TRIGGER_RFID_KEYUP = 12;
        public final static int TRIGGER_SCAN_KEYDOWN = 13;
        public final static int TRIGGER_SCAN_KEYUP = 14;
        public final static int LOW_BATT = 15;
        public final static int POWER_OFF = 16;
        public final static int USB_CONNECTED = 17;
        public final static int USB_DISCONNECTED = 18;
        public final static int UART_CONNECTED = 19;
        public final static int UART_DISCONNECTED = 20;
    }

    public final static class DeviceConfig {
        private DeviceConfig() {}
        // Buzzer volume
        public static final int BUZZER_HIGH = 2;
        public static final int BUZZER_LOW = 1;
        public static final int BUZZER_MUTE = 0;

        // Vibrator
        public static final int VIBRATOR_ON = 1;
        public static final int VIBRATOR_OFF = 0;

        // Battery life
        public static final int BATT_LIFE_OFF = 0;
        public static final int BATT_LIFE_ON = 1;

        // Baudrate
        public static final int BAUDRATE_9600 = 9600;
        public static final int BAUDTATE_19200 = 19200;
        public static final int BAUDTATE_38400 = 38400;
        public static final int BAUDTATE_57600 = 57600;
        public static final int BAUDTATE_115200 = 115200;
        public static final int BAUDTATE_230400 = 230400;
        public static final int BAUDTATE_460800 = 460800;
        public static final int BAUDTATE_921600 = 921600;

        // BT power class
        public static final int BT_POWER_CLASS_1 = 1;
        public static final int BT_POWER_CLASS_2 = 2;
    }

    public final static class RFIDConfig {
        private RFIDConfig() {}
        // Inventory mode
        public static final int INVENTORY_MODE_CONTINUOUS = 0;
        public static final int INVENTORY_MODE_SINGLE = 1;
        public static final int INVENTORY_SELECT_NONE = 0;
        public static final int INVENTORY_SELECT_NONE_1 = 1; // same as 0
        public static final int INVENTORY_SELECT_EXCLUSION = 2;
        public static final int INVENTORY_SELECT_INCLUSION = 3;
        public static final int INVENTORY_TIMEOUT_INFINITE = 0;
        // Inventory parameter
        public static final int INVENTORY_SESSION_0 = 0;
        public static final int INVENTORY_SESSION_1 = 1;
        public static final int INVENTORY_SESSION_2 = 2;
        public static final int INVENTORY_SESSION_3 = 3;
        public static final int INVENTORY_Q_0 = 0;
        public static final int INVENTORY_Q_1 = 1;
        public static final int INVENTORY_Q_2 = 2;
        public static final int INVENTORY_Q_3 = 3;
        public static final int INVENTORY_Q_4 = 4;
        public static final int INVENTORY_Q_5 = 5;
        public static final int INVENTORY_Q_6 = 6;
        public static final int INVENTORY_Q_7 = 7;
        public static final int INVENTORY_Q_8 = 8;
        public static final int INVENTORY_Q_9 = 9;
        public static final int INVENTORY_Q_10 = 10;
        public static final int INVENTORY_Q_11 = 11;
        public static final int INVENTORY_Q_12 = 12;
        public static final int INVENTORY_Q_13 = 13;
        public static final int INVENTORY_Q_14 = 14;
        public static final int INVENTORY_Q_15 = 15;
        public static final int INVENTORY_TARGET_A = 0;
        public static final int INVENTORY_TARGET_B = 1;
        public static final int INVENTORY_TARGET_AB = 2;
        // Link profile
        public static final int LINK_PROFILE_0 = 0;
        public static final int LINK_PROFILE_1 = 1;
        public static final int LINK_PROFILE_2 = 2;
        public static final int LINK_PROFILE_3 = 3;
        // Data format
        public static final int DATA_FORMAT_PC_EPC_CRC = 0;
        public static final int DATA_FORMAT_PC_EPC = 1;
        public static final int DATA_FORMAT_EPC_CRC = 2;
        public static final int DATA_FORMAT_EPC_ONLY = 3;
        // Transmission data format
        public static final int TX_FORMAT_TAG_DATA = 0;
        public static final int TX_FORMAT_PREFIX_TAG_DATA = 1;
        public static final int TX_FORMAT_TAG_DATA_SUFFIX = 2;
        public static final int TX_FORMAT_PREFIX_TAG_DATA_SUFFIX = 3;
        // Filter
        public static final int FILTER_ON = 1;
        public static final int FILTER_OFF = 0;
    }

    public final static class ResultType {
        private ResultType() {}
        public static final String INTENT_EVENT = "device.rfid.EVENT";
        public static final String EXTRA_EVENT_ACTION = "EXTRA_EVENT_ACTION";
        public static final String EXTRA_EVENT_CATEGORY = "EXTRA_EVENT_CATEGORY";
        public static final String EXTRA_EVENT_RFID_DATA = "EXTRA_EVENT_RFID_DATA";
        public static final String EXTRA_EVENT_RFID_TIME = "EXTRA_EVENT_RFID_TIME";
        public static final String EXTRA_EVENT_RFID_RSSI = "EXTRA_EVENT_RFID_RSSI";
        public static final String EXTRA_EVNET_RFID_CHANNEL = "EXTRA_EVNET_RFID_CHANNEL";
        public static final String EXTRA_EVENT_RFID_TEMP = "EXTRA_EVENT_RFID_TEMP";
        public static final String EXTRA_EVENT_RFID_PHASE = "EXTRA_EVENT_RFID_PHASE";
        public static final String EXTRA_EVENT_RFID_ANT = "EXTRA_EVENT_RFID_ANT";

        public static final int RFID_RESULT_CALLBACK = 0;
        public static final int RFID_RESULT_KBDMSG = 1;
        public static final int RFID_RESULT_COPYPASTE = 2;
        public static final int RFID_RESULT_EVENT = 3;
        public static final int RFID_RESULT_CUSTOM_INTENT = 4;
        public static final int RFID_RESULT_USERMSG = 5;
        public static final int RFID_RESULT_CTRLV = 6;
    }

    public final static class TerminatorType {
        private TerminatorType() {}
        public static final int RFID_TERMINATOR_NONE = 0;
        public static final int RFID_TERMINATOR_SPACE = 1;
        public static final int RFID_TERMINATOR_TAB = 2;
        public static final int RFID_TERMINATOR_LF = 3;
        public static final int RFID_TERMINATOR_TAB_LF = 4;
    }

    public final static class CommandErr {
        private CommandErr() {}
        public final static int SUCCESS = 0;
        public final static int COMM_ERR = -1;
        public final static int OPEN_FAILED = -2;
        public final static int OTHER_CMD_RUNNING = -3;
        public final static int WRITE_FAILED = -4;
        public final static int WRONG_DEVICE_STATE = -5;
        public final static int WRONG_READ_PACKET = -6;
        public final static int WRONG_PARAM = -7;
        public final static int NOT_SUPPORTED = -8;
        public final static int FW_NOT_EXISTED = -9;
        public final static int FW_UPDATE_FAILED = -10;
        public final static int TIMEOUT = -100;
    }

    // RF Transceiver errors : return err_op=xx
    public final static class TransErr {
        private TransErr() {}
        public final static int HANDLE_MISMATCH = 1;
        public final static int CRC_TAG_RESPONSE = 2;
        public final static int NO_TAG_REPLY = 3;
        public final static int INVALID_PASSWORD = 4;
        public final static int ZERO_KILL_PASSWORD = 5;
        public final static int TAG_LOST = 6;
        public final static int CMD_FORMAT = 7;
        public final static int INVALID_READ_COUNT = 8;
        public final static int OUT_OF_RETRY = 9;
    }

    // EPC Global Gen2 Tag errors : return err_tag=xx
    public static class TagErr {
        private TagErr() {}
        public final static int UNKNOWN = 0;
        public final static int NOT_SUPPORTED = 1;
        public final static int INSUFF_PRIV = 2;
        public final static int MEM_OVERRUN = 3;
        public final static int MEM_LOCKED = 4;
        public final static int CRYPT_SUITE = 5;
        public final static int CMD_NOT_ENCAP = 6;
        public final static int RESP_BUF_OVERFLOW = 7;
        public final static int SECU_TIMEOUT = 8;
        public final static int INSUFF_PWR = 11;
        public final static int NON_SPEC = 15;
    }
}
