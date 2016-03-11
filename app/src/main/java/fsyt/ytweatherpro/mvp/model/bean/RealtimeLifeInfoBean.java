package fsyt.ytweatherpro.mvp.model.bean;

import java.util.ArrayList;

/**
 * Created by KevinWu on 16-3-12.
 */
public class RealtimeLifeInfoBean {
    public ArrayList<String> getChuanyi() {
        return chuanyi;
    }

    public void setChuanyi(ArrayList<String> chuanyi) {
        this.chuanyi = chuanyi;
    }

    public ArrayList<String> getGanmao() {
        return ganmao;
    }

    public void setGanmao(ArrayList<String> ganmao) {
        this.ganmao = ganmao;
    }

    public ArrayList<String> getKongtiao() {
        return kongtiao;
    }

    public void setKongtiao(ArrayList<String> kongtiao) {
        this.kongtiao = kongtiao;
    }

    public ArrayList<String> getWuran() {
        return wuran;
    }

    public void setWuran(ArrayList<String> wuran) {
        this.wuran = wuran;
    }

    public ArrayList<String> getXiche() {
        return xiche;
    }

    public void setXiche(ArrayList<String> xiche) {
        this.xiche = xiche;
    }

    public ArrayList<String> getYundong() {
        return yundong;
    }

    public void setYundong(ArrayList<String> yundong) {
        this.yundong = yundong;
    }

    public ArrayList<String> getZiwaixian() {
        return ziwaixian;
    }

    public void setZiwaixian(ArrayList<String> ziwaixian) {
        this.ziwaixian = ziwaixian;
    }

    private ArrayList<String> chuanyi=new ArrayList<String>();//穿衣指数数组
    private ArrayList<String> ganmao=new ArrayList<String>();//感冒指数数组
    private ArrayList<String> kongtiao=new ArrayList<String>();//空调指数
    private ArrayList<String> wuran=new ArrayList<String>();//污染指数
    private ArrayList<String>xiche=new ArrayList<String>();//洗车指数
    private ArrayList<String>yundong=new ArrayList<String>();//运动指数
    private ArrayList<String> ziwaixian=new ArrayList<String>();//紫外线

}
