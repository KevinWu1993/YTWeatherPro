package fsyt.ytweatherpro;

import android.app.Application;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * Created by KevinWu on 16-2-25.
 */
public class MyApplication extends Application {
    public static Context ApplicationContext;
    @Override
    public void onCreate() {
        super.onCreate();
        ApplicationContext=getApplicationContext();
        initApplication();
    }

    private void initApplication() {

    }
}
