package fsyt.ytweatherpro.gson;

/**
 * Pm2.5信息实体
 * Created by KevinWu on 2016/1/29.
 */
public class Pm25Entity {
    public String key;//城市拼音
    public int show_desc;//暂时也不知道是什么
    public Pm25 pm25;
    public String datetime;//pm25数据更新时间
    public String cityName;//城市名


    static class Pm25{
        public String curPm;
        public String pm25;
        public String pm10;
        public String level;//等级
        public String quality;//质量
        public String des;//描述
    }
}
