package fsyt.ytweatherpro.mvp.view.activity.base;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

/**
 * Created by KevinWu on 16-2-26.
 */
public class BaseActivity extends AppCompatActivity{
    private static String TAG="BaseActivity";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        setCustomTheme();//设置主题
        Log.d(TAG,"onCreate");
        super.onCreate(savedInstanceState);
//        EventBus.getDefault().register(this);//注册EventBus
        
    }

    private void setCustomTheme() {

    }

    @Subscribe
    public void onEventMainThread(){

    }
}
