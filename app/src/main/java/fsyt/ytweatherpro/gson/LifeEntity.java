package fsyt.ytweatherpro.gson;

/**
 * 生活指数实体
 * Created by KevinWu on 2016/1/29.
 */
public class LifeEntity {
    public String date;//日期
    public Info info;//生活指数内容
    public LifeEntity(String date,Info info){
        super();
        this.date=date;
        this.info=info;
    }



    class Info{
        public String [] chuanyi=new String[2];//穿衣指数数组
        public String [] ganmao=new String[2];//感冒指数数组
        public String [] kongtiao=new String [2];//空调指数
        public String []wuran=new String [2];//污染指数
        public String []xiche=new String [2];//洗车指数
        public String []yundong=new String[2];//运动指数
        public String [] ziwaixian=new String[2];//紫外线
        public Info(String[] chuanyi,String [] ganmao,String[] kongtiao,String [] wuran,String []xiche,String [] yundong,String []ziwaixian){
            super();
            this.chuanyi=chuanyi;
            this.ganmao=ganmao;
            this.kongtiao=kongtiao;
            this.wuran=wuran;
            this.xiche=xiche;
            this.yundong=yundong;
            this.ziwaixian=ziwaixian;
        }

    }
}
