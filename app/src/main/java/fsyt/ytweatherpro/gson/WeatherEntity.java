package fsyt.ytweatherpro.gson;

/**
 * 天气实体
 * Created by KevinWu on 2016/1/29.
 */
public class WeatherEntity {
    public String reason;
    public ResultEntity result=new ResultEntity();
    public int error_code;//错误码
}
