package fsyt.ytweatherpro.gson;

import java.util.ArrayList;

/**
 * data字段数据实体
 * Created by KevinWu on 2016/1/29.
 */
public class DataEntity {
    public RealtimeEntity realtime;
    public LifeEntity life;
    public ArrayList<AdayWeatherEntity> weather=new ArrayList<AdayWeatherEntity>();
    public int date;
    public int isForeign;
}
