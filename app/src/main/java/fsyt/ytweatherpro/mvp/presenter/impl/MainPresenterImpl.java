package fsyt.ytweatherpro.mvp.presenter.impl;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toolbar;

import fsyt.ytweatherpro.mvp.model.impl.WeatherModel;
import fsyt.ytweatherpro.mvp.presenter.ActivityPresenter;
import fsyt.ytweatherpro.mvp.view.MainView;

/**
 * Created by KevinWu on 16-3-12.
 */
public class MainPresenterImpl implements ActivityPresenter{
    private static String TAG="MainPresenterImpl";
    private MainView mainView;
    private WeatherModel weatherModel;

    public MainPresenterImpl(MainView mainView){
        this.mainView=mainView;
    }

    @Override
    public void buildToolbar(Activity activity, Toolbar toolbar) {

    }
}
