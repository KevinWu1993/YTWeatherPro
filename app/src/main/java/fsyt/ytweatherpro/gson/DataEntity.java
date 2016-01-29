package fsyt.ytweatherpro.gson;

/**
 * data字段数据实体
 * Created by KevinWu on 2016/1/29.
 */
public class DataEntity {
    public RealtimeEntity realtimeEntity;
    public LifeEntity lifeEntity;
    public SevendayWeatherEntity sevendayWeatherEntity;
    public int date;
    public int isForeign;
    public DataEntity(RealtimeEntity realtimeEntity,LifeEntity lifeEntity,SevendayWeatherEntity sevendayWeatherEntity,int date,int isForeign){
        super();
        this.realtimeEntity=realtimeEntity;
        this.lifeEntity=lifeEntity;
        this.sevendayWeatherEntity=sevendayWeatherEntity;
        this.date=date;
        this.isForeign=isForeign;
    }
}
