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

    public RealtimeWindBean getWind() {
        return wind;
    }

    public void setWind(RealtimeWindBean wind) {
        this.wind = wind;
    }

    private String moon;//农历、
    private long dataUptime;//更新时间戳
    private RealTimeWeatherBean weather;
    private RealtimeWindBean wind;

    static class RealtimeWindBean {
        public String direct;//风向
        public String power;//风力
        public String offset;//风向偏移量
        public String windspeed;//风速
    }

    static class RealTimeWeatherBean {
        public String tempertrue;//实时温度
        public String humidity;//湿度
        public String info;//天气信息
        public String img;//天气对应图片
    }

}
