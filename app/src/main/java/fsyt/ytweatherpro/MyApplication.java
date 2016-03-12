package fsyt.ytweatherpro;

import android.app.Application;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by KevinWu on 16-2-25.
 */
public class MyApplication extends Application {
    private static String TAG="MyApplication";
    public static Context ApplicationContext;
    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG,"创建");
        ApplicationContext=getApplicationContext();
        initApplication();
    }

    private void initApplication() {

    }
}
