package fsyt.ytweatherpro.gson;

import java.util.ArrayList;

/**
 * 实时天气中的生活指数信息实体
 * Created by KevinWu on 2016/1/30.
 */
public class RealtimeLifeInfoEntity {
    public ArrayList<String> chuanyi=new ArrayList<String>();//穿衣指数数组
    public ArrayList<String> ganmao=new ArrayList<String>();//感冒指数数组
    public ArrayList<String> kongtiao=new ArrayList<String>();//空调指数
    public ArrayList<String> wuran=new ArrayList<String>();//污染指数
    public ArrayList<String>xiche=new ArrayList<String>();//洗车指数
    public ArrayList<String>yundong=new ArrayList<String>();//运动指数
    public ArrayList<String> ziwaixian=new ArrayList<String>();//紫外线
}
