package fsyt.ytweatherpro.mvp.model.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by KevinWu on 16-3-12.
 */
public class DataBean {
    private RealTimeBean realtime;
    private LifeBean life;
    private List<ADayWeatherBean> weather=new ArrayList<>();

    public void setDate(int date) {
        this.date = date;
    }

    public void setIsForeign(int isForeign) {
        this.isForeign = isForeign;
    }

    public void setWeather(List<ADayWeatherBean> weather) {
        this.weather = weather;
    }

    public void setLife(LifeBean life) {
        this.life = life;
    }

    public void setRealtime(RealTimeBean realtime) {
        this.realtime = realtime;
    }

    private int date;

    public int getIsForeign() {
        return isForeign;
    }

    public int getDate() {
        return date;
    }

    public List<ADayWeatherBean> getWeather() {
        return weather;
    }

    public LifeBean getLife() {
        return life;
    }

    public RealTimeBean getRealtime() {
        return realtime;
    }

    private int isForeign;
}
