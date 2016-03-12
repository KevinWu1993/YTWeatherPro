package fsyt.ytweatherpro.mvp.model.bean;

/**
 * Created by KevinWu on 16-3-12.
 */
public class Pm25Bean {
    private String key;//城市拼音
    private int show_desc;//暂时也不知道是什么
    private OnePm25Bean pm25;
    private String datetime;//pm25数据更新时间
    private String cityName;//城市名


    /**
     *
     * @param key
     * @param show_desc
     * @param curPm
     * @param pm25
     * @param pm10
     * @param level
     * @param quality
     * @param des
     * @param datetime
     * @param cityName
     */
    public Pm25Bean(String key, int show_desc, String curPm, String pm25,
                    String pm10, String level, String quality, String des,
                    String datetime, String cityName) {
        this.key = key;
        this.show_desc=show_desc;
        this.pm25=new OnePm25Bean(curPm,pm25,pm10,level,quality,des);
        this.cityName=cityName;
        this.datetime=datetime;
    }

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


}
