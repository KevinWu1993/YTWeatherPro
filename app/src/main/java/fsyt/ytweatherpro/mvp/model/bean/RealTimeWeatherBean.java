package fsyt.ytweatherpro.mvp.model.bean;

/**
 * Created by KevinWu on 16-3-12.
 */
public class RealTimeWeatherBean {
    private String tempertrue;//实时温度
    private String humidity;//湿度

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getTempertrue() {
        return tempertrue;
    }

    public void setTempertrue(String tempertrue) {
        this.tempertrue = tempertrue;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    private String info;//天气信息
    private String img;//天气对应图片
}
