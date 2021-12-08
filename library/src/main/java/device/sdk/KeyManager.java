package device.sdk;

import android.os.RemoteException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import device.common.HiJackData;
import device.common.HijackingKeys;

/**
 * KeyManager.java
 *
 */
public class KeyManager {
    private static final String TAG = KeyManager.class.getSimpleName();
    private static KeyManager mInstance = null;
    static { System.loadLibrary("jni_keymanager"); }

    public static final int KEYCODE_SOFTKEY_LOCK = 1008; //KeyEvent.KEYCODE_SOFTKEY_LOCK;

    public static final int KEYPAD_MODE_NORMAL = 0;
    public static final int KEYPAD_MODE_NUMBER = 1;
    public static final int KEYPAD_MODE_LOWERCASE = 2;
    public static final int KEYPAD_MODE_UPPERCASE = 3;
    public static final int KEYPAD_MODE_FUNCTION = 4;

    public static KeyManager getInstance() {
        if (mInstance == null) {
            mInstance = new KeyManager();
        }
        return mInstance;
    }
    public KeyManager() {}

    /* For Changing KeyCharacterMap File */
    private native int checkKCMapFile(String path);
    private static byte[] getBytesFromFile(String path) {
        try {
            File file = new File(path);
            InputStream is = new FileInputStream(file);
            long length = file.length();
            byte[] bytes = new byte[(int) length];

            if (length > Integer.MAX_VALUE) {
                bytes = null;
            } else {
                int offset = 0;
                int numRead = 0;
                while (offset < bytes.length && (numRead = is.read(bytes, offset, bytes.length - offset)) >= 0) {
                    offset += numRead;
                }
            }
            is.close();
            return bytes;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
    * This function reads current KCM file path.
    *
    * @return file path with String
    */
    public String getCurrentKCMapFile() throws RemoteException {
        return DeviceServer.getIHiJackService().getCurrentKCMapFile();
    }

    /**
    * This function changes key map with new KCM file.
    *
	* @param path new KCM file path with String.
    *
    * @return Zero indicates success; Nonzero indicates failure.
    */
    public int changeKCMapFile(String path) throws RemoteException {
        int result = checkKCMapFile(path);
        if (result == 0) {
            result = DeviceServer.getIHiJackService().changeKCMapFile(path, getBytesFromFile(path));
        }
        return result;
    }

    /**
    * This function removes a user changed KCM file and sets with default KCM file.
    *
    * @return true indicates success; false indicates failure
    */
    public boolean removeKCMapFile() throws RemoteException {
        return DeviceServer.getIHiJackService().removeKCMapFile();
    }

    /**
    * This function gets the key list to be able to re-map to.
    *
    * @return key list to be able to re-map to with KeyManagerKey array
    */
    public HijackingKeys[] getHijackingKeys()  throws RemoteException {
        return DeviceServer.getIHiJackService().getHijackingKeys();
    }

    /**
    * This function updates the key map DB with new KeyManagerData list.
    *
    * @param dataList new KeyManagerData array
    *
    * @return mapping count with int
    *
    * @see KeyManager#getAllHiJackData
    */
    public int setAllHiJackData(HiJackData[] dataList) throws RemoteException {
        return DeviceServer.getIHiJackService().setAllHiJackData(dataList);
    }

    /**
    * This function gets all probrammable key data from key map DB.
    *
    * @return all probrammable key data with KeyManagerData array
    *
    * @see KeyManager#setAllHiJackData
    */
    public HiJackData[] getAllHiJackData() throws RemoteException {
        return DeviceServer.getIHiJackService().getAllHiJackData();
    }

    /**
     * Sets whether or not to use the unified keycode.
     * Works only on Android versions 6 and below.
     * @param enabled {@code true} to enable, {@code false} to disable.
     * @see #isUsingUnifiedKeycode
     */
    public void useUnifiedKeycode(boolean enabled) throws RemoteException {
        DeviceServer.getIHiJackService().useUnifiedKeycode(enabled);
    }

    /**
     * Gets whether the unified keycode is used.
     * Works only on Android versions 6 and below.
     * @return {@code true} When the use of unified keycode is enabled
     * @see #useUnifiedKeycode
     */
    public boolean isUsingUnifiedKeycode() throws RemoteException {
        return DeviceServer.getIHiJackService().isUsingUnifiedKeycode();
    }

    /**
    * This function sets with default KCM file.
    *
    * @return true indicates success; false indicates failure
    */
    public boolean changeKCMapFileToDefault() throws RemoteException {
        return DeviceServer.getIHiJackService().changeKCMapFileToDefault();
    }

    /**
     * Gets whether the direct input style is.
     * @return {@code ture} When the direct input style is enabled
     */
    public boolean isDirectInputStyle() throws RemoteException {
        return DeviceServer.getIHiJackService().isDirectInputStyle();
    }

    /**
     * Sets whether the direct input style.
     * @return {@code ture} When the direct input style is enabled
     */
    public boolean setDirectInputStyle(boolean enable) throws RemoteException {
        return DeviceServer.getIHiJackService().setDirectInputStyle(enable);
    }

    /**
     * Gets whether the key control mode is.
     * @return {@code ture} When the key control mode is enabled
     */
    public boolean isKeyControlMode() throws RemoteException {
        return DeviceServer.getIHiJackService().isKeyControlMode();
    }

    /**
     * Sets whether the key control mode.
     * @return {@code ture} When the key control mode is enabled
     */
    public boolean setKeyControlMode(boolean enable) throws RemoteException {
        return DeviceServer.getIHiJackService().setKeyControlMode(enable);
    }

    /**
     * Gets the current keypad mode.
     * @return One of {@link #KEYPAD_MODE_NORMAL}, {@link #KEYPAD_MODE_NUMBER}, {@link #KEYPAD_MODE_LOWERCASE}, {@link #KEYPAD_MODE_UPPERCASE} or {@link #KEYPAD_MODE_FUNCTION}.
     */
    public int getKeypadMode() throws RemoteException {
        return DeviceServer.getIHiJackService().getKeypadMode();
    }

    /**
     * Sets the keypad mode directly.
     * @param mode One of {@link #KEYPAD_MODE_NORMAL}, {@link #KEYPAD_MODE_NUMBER}, {@link #KEYPAD_MODE_LOWERCASE}, {@link #KEYPAD_MODE_UPPERCASE} or {@link #KEYPAD_MODE_FUNCTION}.
     */
    public boolean setKeypadMode(int mode) throws RemoteException {
        return DeviceServer.getIHiJackService().setKeypadMode(mode);
    }
}

