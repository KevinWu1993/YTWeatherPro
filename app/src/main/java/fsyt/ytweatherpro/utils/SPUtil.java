package fsyt.ytweatherpro.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * SharedPreferences数据操作工具类
 * Created by KevinWu on 16-2-29.
 */
public class SPUtil {


    /**
     * 往SharedPreferences文件里面写入信息的方法，根据参数类型决定写入的信息
     *
     * @param context
     * @param file
     * @param key
     * @param object
     */
    public static void put(Context context, String file, String key, Object object) {
        SharedPreferences sp = context.getSharedPreferences(file, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        if (object instanceof Integer) {
            editor.putInt(key, (int) object);
        } else if (object instanceof Float) {
            editor.putFloat(key, (float) object);
        } else if (object instanceof Boolean) {
            editor.putBoolean(key, (boolean) object);
        } else if (object instanceof Long) {
            editor.putLong(key, (long) object);
        } else if (object instanceof String) {
            editor.putString(key, (String) object);
        } else {
            editor.putString(key, object.toString());
        }
        editor.commit();
    }

    /**
     * 获取SharedPreferences文件里面的信息
     *
     * @param context
     * @param file
     * @param key
     * @return
     */
    public static Object get(Context context, String file, String key, Object defaultValue) {
        SharedPreferences sp = context.getSharedPreferences(file, Context.MODE_PRIVATE);
        if (defaultValue instanceof Integer) {
            return sp.getInt(key, (int) defaultValue);
        } else if (defaultValue instanceof Float) {
            return sp.getFloat(key, (float) defaultValue);
        } else if (defaultValue instanceof Boolean) {
            return sp.getBoolean(key, (boolean) defaultValue);
        } else if (defaultValue instanceof Long) {
            return sp.getLong(key, (long) defaultValue);
        } else if (defaultValue instanceof String) {
            return sp.getString(key, (String) defaultValue);
        }
        return null;
    }
}
