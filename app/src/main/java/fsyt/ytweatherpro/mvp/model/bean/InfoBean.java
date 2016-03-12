package fsyt.ytweatherpro.mvp.model.bean;

import java.util.ArrayList;

/**
 * Created by KevinWu on 16-3-12.
 */
public class InfoBean {
    private ArrayList<String> day = new ArrayList<String>();//白天天气信息
    private ArrayList<String> night = new ArrayList<String>();//夜间天气信息

    public InfoBean(ArrayList<String> day, ArrayList<String> night) {
        this.day = day;
        this.night = night;
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


}
