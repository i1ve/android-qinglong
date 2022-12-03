package auto.qinglong.utils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.provider.Settings;

public class DeviceUnit {
    public static final String TAG = "DeviceUnit";

    @SuppressLint("HardwareIds")
    public static String getAndroidID(Activity activity) {
        String id = Settings.Secure.getString(activity.getContentResolver(), Settings.Secure.ANDROID_ID);
        return id == null ? "" : id;
    }
}