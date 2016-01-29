package fsyt.ytweatherpro.gson;

/**
 * 未来三天天气实体
 * Created by KevinWu on 2016/1/29.
 */
public class ThreedayWeatherEntity {
    public AdayWeather[] weathers=new AdayWeather[7];



    /**
    *一天的天气
    *@author KevinWu
    *create at 2016/1/29 20:48
    */
    class AdayWeather{
        public String date;//日期
        public Info info;//一天中的天气信息
        public String week;//这天是周几
        public String nongli;//这天的农历

        public AdayWeather(String date,Info info,String week,String nongli){
            super();
            this.date=date;
            this.info=info;
            this.week=week;
            this.nongli=nongli;
        }



        /**
        *一天中天气信息
        *@author KevinWu
        *create at 2016/1/29 20:48
        */
        class Info{
            public String[] day=new String[5];//白天天气信息
            public String[] night=new String[5];//夜间天气信息
            public Info(String [] day,String []night){
                super();
                this.day=day;
                this.night=night;
            }
        }
    }
}
