package fsyt.ytweatherpro.gson;

/**
 * 天气实体
 * Created by KevinWu on 2016/1/29.
 */
public class WeatherEntity {
    public ReasonEntity reasonEntity;
    public ResultEntity resultEntity;
    public Error_codeEntity error_codeEntity;
    public WeatherEntity(ReasonEntity reasonEntity,ResultEntity resultEntity,Error_codeEntity error_codeEntity){
        super();
        this.reasonEntity=reasonEntity;
        this.resultEntity=resultEntity;
        this.error_codeEntity=error_codeEntity;
    }
}
