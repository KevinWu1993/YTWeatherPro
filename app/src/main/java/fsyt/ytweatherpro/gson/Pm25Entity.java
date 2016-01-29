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
    public Pm25Entity(String key,int show_desc,Pm25 pm25,String datetime,String cityName){
        super();
        this.key=key;
        this.show_desc=show_desc;
        this.pm25=pm25;
        this.datetime=datetime;
        this.cityName=cityName;
    }

    class Pm25{
        public String curPm;
        public String pm25;
        public String pm10;
        public String level;//等级
        public String quality;//质量
        public String des;//描述
        public Pm25(String curPm,String pm25,String pm10,String level,String quality,String des){
            super();
            this.curPm=curPm;
            this.pm25=pm25;
            this.pm10=pm10;
            this.level=level;
            this.quality=quality;
            this.des=des;
        }
    }
}
