package fsyt.ytweatherpro.mvp.model.bean;

/**
 * Created by KevinWu on 16-3-12.
 */
public class LifeBean {
    private String date;//日期

    public RealtimeLifeInfoBean getInfo() {
        return info;
    }

    public void setInfo(RealtimeLifeInfoBean info) {
        this.info = info;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    private RealtimeLifeInfoBean info;//生活指数的信息
}
