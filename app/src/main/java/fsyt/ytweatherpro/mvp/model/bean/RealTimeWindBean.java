package fsyt.ytweatherpro.mvp.model.bean;

/**
 * Created by KevinWu on 16-3-12.
 */
public class RealTimeWindBean {
    public String getDirect() {
        return direct;
    }

    public void setDirect(String direct) {
        this.direct = direct;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public String getWindspeed() {
        return windspeed;
    }

    public void setWindspeed(String windspeed) {
        this.windspeed = windspeed;
    }

    private String direct;//风向
    private String power;//风力
    private String offset;//风向偏移量
    private String windspeed;//风速
}
