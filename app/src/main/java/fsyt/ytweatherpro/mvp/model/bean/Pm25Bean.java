package fsyt.ytweatherpro.mvp.model.bean;

/**
 * Created by KevinWu on 16-3-12.
 */
public class Pm25Bean {
    private String key;//城市拼音
    private int show_desc;//暂时也不知道是什么

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public OnePm25Bean getPm25() {
        return pm25;
    }

    public void setPm25(OnePm25Bean pm25) {
        this.pm25 = pm25;
    }

    public int getShow_desc() {
        return show_desc;
    }

    public void setShow_desc(int show_desc) {
        this.show_desc = show_desc;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    private OnePm25Bean pm25;
    private String datetime;//pm25数据更新时间
    private String cityName;//城市名


}
