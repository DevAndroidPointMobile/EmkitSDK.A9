package device.common;

public class DevInfoIndex {
    /* Device Name */
    public static final int OCTANT_MAJOR    = 88;
    public static final int PM80_MAJOR      = 80;
    public static final int CHD8_MAJOR      = 82;
    public static final int XT2_MAJOR       = 87;
    public static final int CR4900_MAJOR    = 89;
    public static final int PM70_MAJOR      = 70;
    public static final int XT2P_MAJOR      = 71;
    public static final int PM66_MAJOR      = 76;
    public static final int PM80P_MAJOR     = 81;
    public static final int XG200_MAJOR     = 54;
    public static final int PM550_MAJOR     = 55;
    public static final int PM550R_MAJOR    = 56;
    public static final int PM45_MAJOR      = 45;
    public static final int DTX400_MAJOR    = 40;
    public static final int PM85_MAJOR      = 85;
    public static final int XT200_MAJOR     = 84;
    public static final int PM90_MAJOR      = 90;
    public static final int XT3_MAJOR       = 91;
    public static final int ITG600_MAJOR    = 60;
    public static final int ITG650_MAJOR    = 65;
    public static final int PM451_MAJOR     = 41;
    public static final int XG4_MAJOR       = 42;
    public static final int PM500_MAJOR     = 50;
    public static final int PM30_MAJOR      = 30;
    public static final int PM75_MAJOR      = 75;

    public static enum DEVICE_NAME {
        octant(OCTANT_MAJOR),
        sextant(OCTANT_MAJOR),
        pm80(PM80_MAJOR),
        cr4900(CR4900_MAJOR),
        pm70(PM70_MAJOR),
        pm66(PM66_MAJOR),
        pm80plus(PM80P_MAJOR),
        pm550(PM550_MAJOR),
        xg200(XG200_MAJOR),
        pm45(PM45_MAJOR),
        dtx400(DTX400_MAJOR),
        pm85(PM85_MAJOR),
        xt200(XT200_MAJOR),
        pm90(PM90_MAJOR),
        xt3(XT3_MAJOR),
        itg600(ITG600_MAJOR),
        itg650(ITG650_MAJOR),
        pm451(PM451_MAJOR),
        xg4(XG4_MAJOR),
        pm500(PM500_MAJOR),
        pm30(PM30_MAJOR),
        pm75(PM75_MAJOR);
        private int mMajorNumber;
        public int getMajorNumber() {return mMajorNumber;}
        DEVICE_NAME(int majorNumber) {mMajorNumber=majorNumber;}
    }

	/* Global */
	public static final int NONE                    = 0;
    public static final int UNKNOWN                 = -1;
    public static final int DEPRECATED              = -1;
	public static final int NOT_SUPPORTED           = -1;
    public static final int ON                      = 1;
    public static final int OFF                     = 0;
    public static final int ENABLED                 = 1;
    public static final int DISABLED                = 0;
    public static final String STRING_NOT_SUPPORTED = "Not Supported";
    public static final String STRING_DEPRECATED    = "Deprecated";
    public static final String STRING_UNKNOWN       = "Unknown";
    public static final String STRING_UNIMPLEMENTED = "Unimplemented";

    /* Device Type */
    public static final int DEVICE_KEYBOARD             = 0;
    public static final int DEVICE_TOUCH                = 1;
    public static final int DEVICE_DISPLAY              = 2;
    public static final int DEVICE_BLUETOOTH            = 3;
    public static final int DEVICE_WLAN                 = 4;
    public static final int DEVICE_WWAN                 = 5;
    public static final int DEVICE_GPS                  = 6;
    public static final int DEVICE_NAND                 = 7;
    public static final int DEVICE_CAMERA               = 8;
    public static final int DEVICE_SCANNER              = 9;
    public static final int DEVICE_RFID                 = 10;
    public static final int DEVICE_ACCELEROMETER        = 11;
    public static final int DEVICE_AMBIENT_LIGHT        = 12;
    public static final int DEVICE_AMBIENT_TEMPERATURE  = 13;
    public static final int DEVICE_GYROSCOPE            = 14;
    public static final int DEVICE_MAGNETIC_FIELD       = 15;
    public static final int DEVICE_PRESSURE             = 16;
    public static final int DEVICE_PROXIMITY            = 17;
    public static final int DEVICE_CPU_TEMPERATURE      = 18;
    public static final int DEVICE_FLASH_LED            = 19;
    public static final int DEVICE_CAMERA_SECOND        = 20;
    public static final int DEVICE_MSR                  = 21;
    public static final int DEVICE_COUNT                = 22;
    public static final int DEVICE_MAX_COUNT            = 40;

    /* Keyboard Type */
	public static final int KEYBOARD_D6100_28           = 16; // (D6100) Numeric-key keyboard
	public static final int KEYBOARD_D6500_28           = 17; // (D6500) Numberic 28-key keyboard
	public static final int KEYBOARD_D6500_52           = 18; // (D6500) Alpha-numeric 52-key keyboard
	public static final int KEYBOARD_NUMERIC            = 19; // Numberic keyboard
	public static final int KEYBOARD_ALPHANUMERIC       = 20; // Alpha-Numeric keyboard
	public static final int KEYBOARD_QWERTY             = 21; // Qwerty keyboard
	public static final int KEYBOARD_NAVIGATION         = 22; // Navigation keyboard
	public static final int KEYBOARD_PM251              = 34; // (PM251) Only one keyboard
	public static final int KEYBOARD_NUMERIC_PM40       = 39; // (PM40) Numeric keyboard
	public static final int KEYBOARD_QWERTY_PM40        = 40; // (PM40) Qwerty keyboard
	public static final int KEYBOARD_NUMERIC_PM60       = 41; // (PM60) Numeric keyboard
	public static final int KEYBOARD_QWERTY_PM60        = 42; // (PM60) Qwerty keyboard
	public static final int KEYBOARD_NUMERIC_MUTANT     = 43; // (MUTANT) Numeric keyboard
	public static final int KEYBOARD_QWERTY_MUTANT      = 44; // (MUTANT) Qwerty keyboard
	public static final int KEYBOARD_NUMERIC_OCTANT     = 45; // (OCTANT) Numeric keyboard
	public static final int KEYBOARD_NUMERIC_PM450      = 46; // (PM450) Numeric keyboard
	public static final int KEYBOARD_ALPHANUMERIC_PM450 = 47; // (PM450) Alpha-Numeric keyboard
	public static final int KEYBOARD_NAVIGATION_SEXTANT = 48; // (SEXTANT) Navigation keyboard
	public static final int KEYBOARD_NUMERIC_XM5        = 49; // (XM5) Numeric keyboard
	public static final int KEYBOARD_QWERTY_XM5         = 50; // (XM5) Qwerty keyboard
    public static final int KEYBOARD_NAVIGATION_PM80    = 51; // (PM80) Navigation keyboard
    public static final int KEYBOARD_NAVIGATION_PM70    = 52; // (PM70) Navigation keyboard
    public static final int KEYBOARD_NUMERIC_PM66       = 53; // (PM66) Numeric keyboard
    public static final int KEYBOARD_NUMERIC_PM550      = 54; // (PM550) Numeric keyboard
    public static final int KEYBOARD_NAVIGATION_PM45    = 55; // (PM45) Navigation keyboard
    public static final int KEYBOARD_ALPHANUMERIC_PM550 = 56; // (PM550) Alpha-numeric keyboard
    public static final int KEYBOARD_NUMERIC_DTX400     = 57; // (DTX400) Numeric keyboard
    public static final int KEYBOARD_NAVIGATION_PM85    = 58; // (PM85) Navigation keyboard
    public static final int KEYBOARD_NAVIGATION_XT200   = 59; // (XT200) Navigation keyboard
    public static final int KEYBOARD_NAVIGATION_PM90    = 60; // (PM90) Navigation keyboard
    public static final int KEYBOARD_NUMERIC_ITG600     = 61; // (ITG600) Numeric keyboard
    public static final int KEYBOARD_NAVIGATION_ITG650  = 62; // (ITG650) Navigation keyboard
    public static final int KEYBOARD_FUNCNUMERIC_PM451  = 63;
    public static final int KEYBOARD_ALPHANUMERIC_PM451 = 64;
    public static final int KEYBOARD_NUMERIC_PM451      = 65;
    public static final int KEYBOARD_ALDINUMERIC_PM451  = 66;
	public static final int KEYBOARD_NAVIGATION_PM500   = 67; // (PM500) Navigation keyboard

    /* Touch Type */
	public static final int TOUCH_REGISTIVE             = 1;
	public static final int TOUCH_CAPACITIVE_S3202      = 2;
	public static final int TOUCH_CAPACITIVE_S3508      = 3;
	public static final int TOUCH_CAPACITIVE_ILITEK     = 4;
	public static final int TOUCH_CAPACITIVE_S3528      = 5;
	public static final int TOUCH_CAPACITIVE_S3708      = 6;
    public static final int TOUCH_CAPACITIVE_FT8716U    = 7;
    public static final int TOUCH_RESISTIVE_BU21029     = 8;
    public static final int TOUCH_CAPACITIVE_TD4300     = 9;
    public static final int TOUCH_RESISTIVE_BU21023     = 10;
    public static final int TOUCH_CAPACITIVE_GT1151Q    = 11;

    /* Display Type */
	public static final int DISPLAY_VGA_TRULY	        = 103;
	public static final int DISPLAY_WVGA_TRULY	        = 105;
	public static final int DISPLAY_FWVGA_TRULY	        = 107;
	public static final int DISPLAY_HD_TNHD5040	        = 108;
	public static final int DISPLAY_TYPE_BYD	        = 109;
	public static final int DISPLAY_HX8394A01           = 110;
	public static final int DISPLAY_HX8379C             = 111;
	public static final int DISPLAY_ILI9881D            = 112;
	public static final int DISPLAY_HX8369B             = 113;
	public static final int DISPLAY_HX8369A             = 114;
    public static final int DISPLAY_FT8716U             = 115;
    public static final int DISPLAY_HOB050H1018         = 116;
	public static final int DISPLAY_TTDLM050064101A 	= 117;
	public static final int DISPLAY_HX8394F             = 118;
    public static final int DISPLAY_ST7703              = 119;
    public static final int DISPLAY_ST7701S             = 120;
    public static final int DISPLAY_OTM8019A            = 121;
    public static final int DISPLAY_TD4300              = 122;
    public static final int DISPLAY_JD9365DA            = 123;
    public static final int DISPLAY_XM91080             = 124;
    public static final int DISPLAY_HX8399C             = 125;
	
    /* LCD Resolution */
	public static final int LCD_RESOLUTION_QVGA         = 0;
	public static final int LCD_RESOLUTION_VGA          = 1;
	public static final int LCD_RESOLUTION_WVGA         = 2;
	public static final int LCD_RESOLUTION_HD           = 3;

    /* Bluetooth Type */
	public static final int BLUETOOTH_CSRBLUECORE4ROM   = 3; // CSR Bluetooth module
	public static final int BLUETOOTH_TI_1273L          = 5; // TI 1273 WLAN/BT module.
	public static final int BLUETOOTH_QC_WCN3660B       = 6; // QUALCOMM WLAN/BT module.
	public static final int BLUETOOTH_QC_WCN3680B       = 7; // QUALCOMM WLAN/BT module.
	public static final int BLUETOOTH_QC_WCN3990        = 8; // Qualcomm WLAN/BT module

    /* WIFI Type */
	public static final int WIFI_USI_SD8686_SDIO        = 3;  // USI SDIO 802.11g radio
	public static final int WIFI_TI_1273L               = 7;  // TI 1273 WLAN/BT a/b/g/n module.
	public static final int WIFI_SUMMIT                 = 20; // SUMMIT WLAN module.
	public static final int WIFI_QC_WCN3660B            = 21; // QUALCOMM WLAN/BT module.
	public static final int WIFI_QC_WCN3680B            = 22; // QUALCOMM WLAN/BT module.
	public static final int WIFI_QC_WCN3990             = 23; // Qualcomm WLAN/BT module

    /* Phone Type */
	public static final int PHONE_HC25                  = 1; // Cinterion HC25
	public static final int PHONE_PH8                   = 2; // Cinterion PH8
    public static final int PHONE_WTR4905               = 3; // Qualcomm MSM8916
    public static final int PHONE_WTR3925               = 4; // Qualcomm SDM450
	public static final int PHONE_SDR660                = 5; // Qualcomm SDM660
	public static final int PHONE_EG25                  = 6; // Queltel EG25
	public static final int PHONE_WAVECOM               = PHONE_HC25;
	public static final int PHONE_SIEMENS               = PHONE_PH8;
	public static final int PHONE_QUALCOMM              = PHONE_WTR3925;

    /* GPS Type */
	public static final int GPS_HC25                    = 1; // AGPS
	public static final int GPS_PH8                     = 2; // AGPS
	public static final int GPS_UBLOX7                  = 3; // U-BLOX 7
	public static final int GPS_OEM615                  = 4; // OEM615
	public static final int GPS_QC_WCN3660B             = 5; // OEM615
	public static final int GPS_UBLOX7P                 = 6; // U-BLOX 7P
	public static final int GPS_QC_WCN3680B             = 7; // OEM615
	public static final int GPS_QC_SDM660               = 8; // Qualcomm SDM660
	public static final int GPS_QC_SDA660               = 9; // Qualcomm SDA660
	public static final int GPS_EG25                    = 10; // EG25

    /* NAND Type */
	public static final int NAND_EMMC                   = 0x0001;
	public static final int NAND_K9F1G08                = ('K'<<8)+'9'; // Samsung K9F1G08, 128X8 NAND flash
	public static final int NAND_K9F2G08                = ('K'<<8)+'A'; // Samsung K9F2G08, 256X8 NAND flash
	public static final int NAND_NAND01GR3B2B           = 0x4E13;       // Numonyx NAND01GR3B2B, 128x8 NAND flash
	public static final int NAND_NAND02GR3B2C           = 0x4E23;       // Numonyx NAND02GR3B2C, 256x8 NAND flash
	public static final int NAND_NAND01GR4B2B           = 0x4E14;       // Numonyx NAND01GR4B2B, 128x16 NAND flash
	public static final int NAND_NAND02GR4B2C           = 0x4E24;       // Numonyx NAND02GR4B2C, 256x16 NAND flash
	public static final int NAND_NAND04GW3B2D           = 0x4E43;       // Numonyx NAND04GW3B2D, 512x8 NAND flash
	public static final int NAND_TOSHIBA2GX16           = 0x5424;       // Toshiba TC58DVM82F1XB00 256x16 NAND flash
	public static final int NAND_TC58NYG0S3EBAI4        = 0x5413;       // Toshiba TC58NYG0S3EBAI4 128x8 NAND flash
	public static final int NAND_TC58NYG1S3EBAI5        = 0x5423;       // Toshiba TC58NYG1S3EBAI5 256x8 NAND flash
	public static final int NAND_TC58NYG2S3EBAI5        = 0x5443;       // Toshiba TC58NYG2S3EBAI5 512x8 NAND flash
	public static final int NAND_TC58NVG2S3EBAI5        = 0x5433;       // Toshiba TC58NVG2S3EBAI5 512x8 NAND flash(3.3V)
	public static final int NAND_MT29F4G16              = ('M'<<8)+'I'; // MICRON 4Gb x16b SLC NAND Flash (MT29F4G16)
	public static final int NAND_MT29F8G16              = ('M'<<8)+'J'; // MICRON 8Gb x16b SLC NAND Flash (MT29F8G16)
	public static final int NAND_MICRON                 = NAND_MT29F4G16;
    public static final int NAND_KMQ7X000SA_B315        = 0x0002;       // SAMSUNG KMQ7X000SA-B315 / 1G RAM / 8G EMMC
    public static final int NAND_KMQ72000SM_B316        = 0x0003;       // SAMSUNG KMQ72000SM-B316 / 1G RAM / 8G EMMC
    public static final int NAND_MT29TZZZ5D6YKFAH_125_W96N  = 0x0004;   // MICRON MT29TZZZ5D6YKFAH_125_W96N / 2G RAM / 16G EMMC
    public static final int NAND_TYPE_KMQ820013M_B419       = 0x05;     // SAMSUNG KMQ820013M-B419 / 2G RAM / 16G EMMC
    public static final int NAND_TYPE_H9TQ17ABJTACUR_KUM    = 0x06;     // HYNIX H9TQ17ABJTACUR-KUM / 2G RAM / 16G EMMC
    public static final int NAND_KMFNX0012M_B214            = 0x07;     // SAMSUNG KMFNX0012M-B214 / 1G RAM / 8G EMMC
    public static final int NAND_MT29TZZZ5D6EKFRL_107_W96R  = 0x08;     // MICRON MT29TZZZ5D6EKFRL-107 W.96R / 2G RAM / 16G EMMC
	public static final int NAND_MT29TZZZ5D6DKFRL_107_W9A6  = 0x09;		// MICRON MT29TZZZ5D6EKFRL-107 W.9A6 / 2G RAM / 16G EMMC
    public static final int NAND_TYPE_H9TQ17ABJTBCUR_KUM    = 0x0A;     // HYNIX H9TQ17ABJTBCUR-KUM / 2G RAM / 16G EMMC
    public static final int NAND_TYPE_H9TQ17ABJTCCUR_KUM    = 0x0B;     // HYNIX H9TQ17ABJTCCUR-KUM / 2G RAM / 16G EMMC
    public static final int NAND_TYPE_H9TQ26ADFTBCUR_KUM    = 0x0C;     // HYNIX H9TQ26ADFTBCUR-KUM / 3G RAM / 32G EMMC
    public static final int NAND_TYPE_KMQE60013M_B318    = 0x0D;        // SAMSUNG KMQE60013M-B318  / 2G RAM / 16G EMMC
    public static final int NAND_TYPE_KMRX60014M_B614    = 0x0E;        // SAMSUNG KMRX60014M-B614  / 4G RAM / 32G EMMC
    public static final int NAND_TYPE_KMGX6001BM_B514    = 0x0F;        // SAMSUNG KMGX6001BM_B514  / 4G RAM / 32G EMMC
    public static final int NAND_TYPE_KMQE10013M_B318    = 0x10;        // SAMSUNG KMQE10013M-B318  / 2G RAM / 16G EMMC
    public static final int NAND_TYPE_KMGD6001BM_B421    = 0x11;        // SAMSUNG KMGD6001BM-B421  / 3G RAM / 32G EMMC
    public static final int NAND_TYPE_KMRH60014A_B614    = 0x12;        // SAMSUNG KMRH60014A-B614  / 4G RAM / 64G EMMC
    public static final int NAND_TYPE_KMDH6001DA_B422    = 0x13;        // SAMSUNG KMDH6001DA_B422  / 4G RAM / 64G EMMC
    public static final int NAND_TYPE_H9HP52ACPMMDAR_KMM = 0x14;        // HYNIX H9HP52ACPMMDAR-KMM / 4G RAM / 64G EMMC
    public static final int NAND_TYPE_KMRP60014M_B614    = 0x15;        // SAMSUNG KMRP60014M-B614  / 4G RAM / 64G EMMC
    public static final int NAND_TYPE_KMGX6001BA_B514    = 0x16;        // SAMSUNG KMGX6001BA_B514  / 3G RAM / 32G EMMC
    public static final int NAND_TYPE_MT29TZZZAD8DKKFB_107_W9N8 = 0x17;  // MICRON MT29TZZZAD8DKKFB-107 W.9N8 / 4G RAM / 64G EMMC

    /* Camera Type */
	public static final int CAMERA_OV3640               = 1;
	public static final int CAMERA_MT9T111              = 2;
	public static final int CAMERA_S5K4ECGX             = 3; // For PM60, MUTANT
	public static final int CAMERA_MT9E013              = 4; // APTINA(FROM OCTANT EVT)
	public static final int CAMERA_AR0833               = 5; // APTINA(FROM OCTANT DVT2)
    public static final int CAMERA_GC2355               = 6;
    public static final int CAMERA_S5KH5YA              = 7;
    public static final int CAMERA_HI1332               = 8;
    public static final int CAMERA_GC2375               = 9;
    public static final int CAMERA_HI843B               = 10;
    public static final int CAMERA_HI846                = 11;
    public static final int CAMERA_HI556                = 12;
    public static final int CAMERA_S5K3L8               = 13;
    public static final int CAMERA_GC5025               = 14;
    public static final int CAMERA_GC5035               = 15;
    public static final int CAMERA_OV13855              = 16;
    public static final int CAMERA_IMX258               = 17;
	public static final int CAMERA_GC8034   			= 18;
	public static final int CAMERA_GC2385   			= 19;
    public static final int CAMERA_OV13B10              = 20;
    public static final int CAMERA_OV13B10_1D            = 21;

    /* Scanner Type */
	public static final int SCANNER_IT4000              = 5;
	public static final int SCANNER_IT4100              = 6;
	public static final int SCANNER_IT4300              = 7;
	public static final int SCANNER_IT5100              = 8;  // With Honeywell
	public static final int SCANNER_IT5300              = 9;  // With Honeywell
	public static final int SCANNER_N5603               = 12; // With Honeywell
	public static final int SCANNER_N5600               = 13; // With Honeywell
	public static final int SCANNER_IS4813              = 14;
	public static final int SCANNER_HI704A              = 15; // With Honeywell
	public static final int SCANNER_N4313               = 16;
	public static final int SCANNER_N6603               = 17;
	public static final int SCANNER_EX25                = 18;
	public static final int SCANNER_EX30                = 19;
	public static final int SCANNER_SE955               = 20;
	public static final int SCANNER_SE4500              = 21;
	public static final int SCANNER_SE655               = 22;
	public static final int SCANNER_SE965               = 23;
	public static final int SCANNER_SE4710              = 24;
	public static final int SCANNER_UE966               = 25;
	public static final int SCANNER_CR8000              = 26; // With CODE
	public static final int SCANNER_SE4750              = 27;
	public static final int SCANNER_MDL1500             = 28;
	public static final int SCANNER_N6703               = 29;
	public static final int SCANNER_N3601               = 31;
	public static final int SCANNER_N3603               = 32;
	public static final int SCANNER_N2600               = 33;
	public static final int SCANNER_N4603               = 34;

    /* Scanner Class */
	public static final int SCANNER_CLASS_LASER         = 1;
	public static final int SCANNER_CLASS_IMAGER        = 2;

    /* RFID Type */
	public static final int RFID_MIPS_MTR_R900          = 49;
	public static final int RFID_MINERVA                = 50;
	public static final int RFID_ARCONTIA_ARC1300       = 51;
	public static final int RFID_NFC_PM663              = 52;
	public static final int RFID_NFC_PN547              = 53;
	public static final int RFID_NFC_PN5482D2EV         = 54;
	public static final int RFID_NFC_NQ210              = 55;
	public static final int RFID_NFC_NQ220              = 56;
	public static final int RFID_NFC_NQ310              = 57;
	public static final int RFID_NFC_NQ330              = 58;
	public static final int RFID_NFC_PN553              = 59;
	public static final int RFID_NFC_PN7150             = 60;	// 2019.01.07 phill.kim
	public static final int RFID_NFC_PN5180             = 61;

    /* Sensor Type */
	public static final int SENSOR_AK8963C              = 1;
	public static final int SENSOR_BMI055               = 2;
	public static final int SENSOR_APDS9900             = 3;
	public static final int SENSOR_BMP180               = 4;
	public static final int SENSOR_TMP102               = 5;
	public static final int SENSOR_APDS9930             = 6;
	public static final int SENSOR_BMA250               = 7;
	public static final int SENSOR_BMA223               = 8;
	public static final int SENSOR_STK3311              = 9;
	public static final int SENSOR_BMI160               = 10;
	public static final int SENSOR_LSM6DS3              = 11;
	public static final int SENSOR_ST480                = 12;
	public static final int SENSOR_AK09918              = 13;
	public static final int SENSOR_BMA253               = 14;
	public static final int SENSOR_MC3413               = 15;
	public static final int SENSOR_RPR0521              = 16;
	public static final int SENSOR_MN25713E             = 17;
	public static final int SENSOR_CM36283				= 18;
	public static final int SENSOR_LIS3DH				= 19;
	public static final int SENSOR_STK3332				= 20;
	public static final int SENSOR_STK33562				= 21;

    /* Flash Type */
	public static final int FLASH_AP2061                = 1;
	public static final int FLASH_LM3559                = 2;

    /* MSR Type */
    public static final int MSR_MMD1000                 = 1;
    public static final int MSR_PM1100                  = 2;
}
