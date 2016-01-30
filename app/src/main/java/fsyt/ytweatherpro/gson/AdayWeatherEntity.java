package fsyt.ytweatherpro.gson;

/**
 * 返回的七天天气中的一天的实体
 * Created by KevinWu on 2016/1/30.
 */
public class AdayWeatherEntity {
    public String date;//日期
    public AdayWeatherInfoEntity info;//一天中的天气信息
    public String week;//这天是周几
    public String nongli;//这天的农历
}
