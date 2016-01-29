package fsyt.ytweatherpro.gson;

/**
 * 实时天气数据实体
 * Created by KevinWu on 2016/1/29.
 */
public class RealtimeEntity {
    public String city_code;//城市代码
    public String city_name;//城市名称
    public String date;//日期
    public String time;//更新时间
    public int week;//星期
    public String moon;//农历、
    public long dataUptime;//更新时间戳
    public WeatherEntity weatherEntity;//实时天气实体
    public Wind wind;//风速风力信息实体

    public RealtimeEntity(String city_code,String city_name,String date,String time
            ,int week,String moon,long dataUptime,WeatherEntity weatherEntity,Wind wind){
        super();
        this.city_code=city_code;
        this.city_name=city_name;
        this.date=date;
        this.time=time;
        this.week=week;
        this.moon=moon;
        this.dataUptime=dataUptime;
        this.weatherEntity=weatherEntity;
        this.wind=wind;
    }



    class WeatherEntity{
        public String tempertrue;//实时温度
        public String humidity;//湿度
        public String info;//天气信息
        public String img;//天气对应图片
        public WeatherEntity(String tempertrue,String humidity,String info,String img){
            super();
            this.tempertrue=tempertrue;
            this.humidity=humidity;
            this.info=info;
            this.img=img;
        }
    }
    class Wind{
        public String direct;//风向
        public String power;//风力
        public String offset;//风向偏移量
        public String windspeed;//风速
        public Wind(String direct,String power,String offset,String windspeed){
            super();
            this.direct=direct;
            this.power=power;
            this.offset=offset;
            this.windspeed=windspeed;
        }
    }
}

