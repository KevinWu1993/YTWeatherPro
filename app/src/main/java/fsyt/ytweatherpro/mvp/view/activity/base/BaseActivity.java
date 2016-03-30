package fsyt.ytweatherpro.mvp.view.activity.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import fsyt.ytweatherpro.R;
import fsyt.ytweatherpro.mvp.model.EventModel;

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
        EventBus.getDefault().register(this);//注册EventBus
        
    }

    private void setCustomTheme() {

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    @Subscribe
    public void onEventMainThread(EventModel eventModel){

    }
}
