package fsyt.ytweatherpro.mvp.model.bean;

import java.util.ArrayList;

/**
 * Created by KevinWu on 16-3-12.
 */
public class ADayWeatherBean {
    private String date;//日期
    private ArrayList<String> day=new ArrayList<String>();//白天天气信息

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ArrayList<String> getDay() {
        return day;
    }

    public void setDay(ArrayList<String> day) {
        this.day = day;
    }

    public ArrayList<String> getNight() {
        return night;
    }

    public void setNight(ArrayList<String> night) {
        this.night = night;
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

    private ArrayList<String> night=new ArrayList<String>();//夜间天气信息
    private String week;//这天是周几
    private String nongli;//这天的农历

}
