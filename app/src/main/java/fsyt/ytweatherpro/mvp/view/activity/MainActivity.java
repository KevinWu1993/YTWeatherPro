package fsyt.ytweatherpro.mvp.view.activity;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import fsyt.ytweatherpro.R;
import fsyt.ytweatherpro.mvp.presenter.impl.MainPresenterImpl;
import fsyt.ytweatherpro.mvp.view.activity.base.BaseActivity;
import fsyt.ytweatherpro.mvp.view.MainView;

/**
 * Created by KevinWu on 16-2-26.
 */
public class MainActivity extends BaseActivity implements MainView{
    private static String TAG="MainActivity";
    private Toolbar toolbar;
    private MainPresenterImpl mainPresenter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"onCreate");
        setContentView(R.layout.activity_main);
        setToolbar();
        mainPresenter=new MainPresenterImpl(this);
        mainPresenter.buildToolbar(this,toolbar);
    }

    @Override
    public void setToolbar() {
        toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //仅测试用
        getSupportActionBar().setTitle("南昌");
    }

    @Override
    public void setTitle(String title) {
        getSupportActionBar().setTitle(title);
    }


    @Override
    public void setFragment() {

    }
}
