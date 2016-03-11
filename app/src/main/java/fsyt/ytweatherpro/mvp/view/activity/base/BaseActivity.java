package fsyt.ytweatherpro.mvp.view.activity.base;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

import org.greenrobot.eventbus.EventBus;

/**
 * Created by KevinWu on 16-2-26.
 */
public class BaseActivity extends AppCompatActivity{

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        setCustomTheme();//设置主题
        super.onCreate(savedInstanceState, persistentState);
        EventBus.getDefault().register(this);//注册EventBus
        
    }

    private void setCustomTheme() {
    }
}
