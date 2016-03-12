package fsyt.ytweatherpro.mvp.model.bean;

import java.util.ArrayList;

/**
 * Created by KevinWu on 16-3-12.
 */
public class LifeBean {
    private String date;//日期
    private RealtimeLifeInfoBean info;//生活指数的信息

    /**
     *
     * @param date
     * @param chuangyi
     * @param ganmao
     * @param kongtiao
     * @param wuran
     * @param xiche
     * @param yundong
     * @param ziwaixian
     */
    public LifeBean(String date,ArrayList<String> chuangyi,
                    ArrayList<String> ganmao,
                    ArrayList<String> kongtiao,
                    ArrayList<String> wuran,
                    ArrayList<String> xiche,
                    ArrayList<String> yundong,
                    ArrayList<String> ziwaixian){
        this.date=date;
        this.info=new RealtimeLifeInfoBean(chuangyi,ganmao,kongtiao,wuran,xiche,yundong,ziwaixian);
    }

    /**
     *
     * @param date
     * @param info
     */
    public LifeBean(String date,RealtimeLifeInfoBean info){
        this.date=date;
        this.info=info;
    }
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


}
