package fsyt.ytweatherpro.mvp.view.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import fsyt.ytweatherpro.R;
import fsyt.ytweatherpro.mvp.view.activity.base.BaseActivity;
import fsyt.ytweatherpro.mvp.view.impl.MainView;

/**
 * Created by KevinWu on 16-2-26.
 */
public class MainActivity extends BaseActivity implements MainView{
    private static String TAG="MainActivity";
    private Toolbar toolbar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"onCreate");
        setContentView(R.layout.activity_main);
        setToolbar();
        setTitle("test");
    }

    @Override
    public void setToolbar() {
        toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public void setTitle(String title) {
        getSupportActionBar().setTitle(title);
    }

    @Override
    public void setMenu() {

    }
}
