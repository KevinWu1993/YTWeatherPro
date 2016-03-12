package fsyt.ytweatherpro.mvp.model.impl;

import java.util.List;

import fsyt.ytweatherpro.mvp.model.IModel;
import fsyt.ytweatherpro.mvp.model.bean.ADayWeatherBean;
import fsyt.ytweatherpro.mvp.model.bean.LifeBean;
import fsyt.ytweatherpro.mvp.model.bean.Pm25Bean;
import fsyt.ytweatherpro.mvp.model.bean.RealTimeBean;
import fsyt.ytweatherpro.mvp.model.bean.WeatherBean;

/**
 * Created by KevinWu on 16-3-12.
 */
public class WeatherModel implements IModel<WeatherModel> {
    private WeatherBean weatherBean;
    private String cityCode;//城市代码，用于区分城市
    private String cityName;//城市名
    private RealTimeBean realTimeBean;//实时天气模块bean
    private LifeBean lifeBean;//生活指数bean
    private List<ADayWeatherBean> sevenDayWeatherList;//七天天气列表
    private Pm25Bean pm25Bean;//pm2.5bean

    public WeatherModel(String cityCode,String cityName,
                        RealTimeBean realTimeBean,LifeBean lifeBean,
                        List<ADayWeatherBean> sevenDayWeatherList,
                        Pm25Bean pm25Bean){
        this.cityCode=cityCode;
        this.cityName=cityName;
        this.realTimeBean=realTimeBean;
        this.lifeBean=lifeBean;
        this.sevenDayWeatherList=sevenDayWeatherList;
        this.pm25Bean=pm25Bean;
    }

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
