package fsyt.ytweatherpro.mvp.model.bean;

import java.util.ArrayList;

/**
 * Created by KevinWu on 16-3-12.
 */
public class ADayWeatherBean {
    private String date;//日期


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }



    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getNongli() {
        return nongli;
    }

    public void setNongli(String nongli) {
        this.nongli = nongli;
    }

    public InfoBean getInfoBean() {
        return info;
    }

    public void setInfoBean(InfoBean info) {
        this.info = info;
    }

    private InfoBean info;
    private String week;//这天是周几
    private String nongli;//这天的农历


}
