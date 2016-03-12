package fsyt.ytweatherpro.mvp.model;

import java.util.List;

import fsyt.ytweatherpro.mvp.model.bean.ADayWeatherBean;
import fsyt.ytweatherpro.mvp.model.bean.LifeBean;
import fsyt.ytweatherpro.mvp.model.bean.Pm25Bean;
import fsyt.ytweatherpro.mvp.model.bean.RealTimeBean;
import fsyt.ytweatherpro.mvp.model.bean.WeatherBean;
import fsyt.ytweatherpro.mvp.model.impl.IModel;

/**
 * Created by KevinWu on 16-3-12.
 */
public class WeatherModel implements IModel<WeatherModel>{
    private WeatherBean weatherBean;
    private String cityCode;//城市代码，用于区分城市
    private String cityName;//城市名
    private RealTimeBean realTimeBean;//实时天气模块bean
    private LifeBean lifeBean;//生活指数bean
    private List<ADayWeatherBean> sevenDayWeatherList;//七天天气列表
    private Pm25Bean pm25Bean;//pm2.5bean


    @Override
    public void getFromNet() {

    }

    @Override
    public void getFromDB() {

    }

    @Override
    public boolean putInDB(WeatherModel m) {
        return false;
    }

    @Override
    public boolean clearDB() {
        return false;
    }
}
