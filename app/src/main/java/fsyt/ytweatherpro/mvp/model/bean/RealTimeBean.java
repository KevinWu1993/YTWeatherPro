package fsyt.ytweatherpro.mvp.model.bean;

/**
 * Created by KevinWu on 16-3-12.
 */
public class RealTimeBean {
    private String city_code;//城市代码
    private String city_name;//城市名称
    private String date;//日期
    private String time;//更新时间
    private int week;//星期
    private String moon;//农历、
    private long dataUptime;//更新时间戳
    private RealTimeWeatherBean weather;
    private RealTimeWindBean wind;

    /**
     * 构造时同时完成相关bean的构造
     * @param city_code
     * @param city_name
     * @param date
     * @param time
     * @param week
     * @param moon
     * @param dataUptime
     * @param tempertrue
     * @param humidity
     * @param info
     * @param img
     * @param direct
     * @param power
     * @param offset
     * @param windspeed
     */
    public RealTimeBean(String city_code,
                        String city_name,
                        String date,
                        String time,
                        int week,
                        String moon,
                        long dataUptime,
                        String tempertrue,
                        String humidity,
                        String info,
                        String img,
                        String direct,
                        String power,
                        String offset,
                        String windspeed) {
        this.city_code = city_code;
        this.city_name = city_name;
        this.date = date;
        this.time = time;
        this.week = week;
        this.moon = moon;
        this.dataUptime = dataUptime;
        this.weather = new RealTimeWeatherBean(tempertrue, humidity, info, img);
        this.wind = new RealTimeWindBean(direct, power, offset, windspeed);
    }

    public String getCity_code() {
        return city_code;
    }

    public void setCity_code(String city_code) {
        this.city_code = city_code;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public String getMoon() {
        return moon;
    }

    public void setMoon(String moon) {
        this.moon = moon;
    }

    public long getDataUptime() {
        return dataUptime;
    }

    public void setDataUptime(long dataUptime) {
        this.dataUptime = dataUptime;
    }

    public RealTimeWeatherBean getWeather() {
        return weather;
    }

    public void setWeather(RealTimeWeatherBean weather) {
        this.weather = weather;
    }

    public RealTimeWindBean getWind() {
        return wind;
    }

    public void setWind(RealTimeWindBean wind) {
        this.wind = wind;
    }


}
