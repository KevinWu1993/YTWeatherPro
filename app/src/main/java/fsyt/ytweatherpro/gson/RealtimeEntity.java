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
    public RealTimeWeatherEntity weather;//实时天气实体
    public RealtimeWindEntity wind;//风速风力信息实体






}

