package fsyt.ytweatherpro.mvp.view.activity.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import fsyt.ytweatherpro.mvp.model.EventModel;
import fsyt.ytweatherpro.mvp.view.WeatherInfoView;

/**
 * 天气Fragment
 * Created by KevinWu on 16-3-30.
 */
public class WeatherFragment extends Fragment implements WeatherInfoView{
    private View parentView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EventBus.getDefault().register(this);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        parentView=View.inflate(getContext(),getLayoutID(),null);
        init();//初始化
        loadConfig();//导入设置内容
        return parentView;
    }


    /**
     * 导入设置内容
     */
    private void loadConfig() {

    }

    /**
     * 初始化
     */
    private void init() {
    }

    private int getLayoutID() {
        return 0;
    }

    @Override
    public void onDestroy() {
        EventBus.getDefault().unregister(this);
        super.onDestroy();
    }

    @Subscribe
    public void onEventMainThread(EventModel event){
        switch (event.getEventCode()){
            default:
                break;
        }
    }

    @Override
    public void onDataRefresh() {

    }

    @Override
    public void setAdapter() {

    }
}
