package fsyt.ytweatherpro;

import com.google.gson.Gson;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import fsyt.ytweatherpro.mvp.model.bean.RealTimeWindBean;
import fsyt.ytweatherpro.mvp.model.bean.WeatherBean;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    /**
    *测试gson实体
    *@author KevinWu
    *create at 2016/1/29 22:15
    */
    @Test
    public void testEntity(){
        String jsonStr=importStr();//导入要测试的数据
        System.out.println(jsonStr);
        Gson gson=new Gson();
        WeatherBean w=gson.fromJson(jsonStr,WeatherBean.class);
        System.out.println(w.getResult().getData().getPm25().getPm25().getCurPm());
    }

    private String importStr(){
        String str="";
        File myFile=new File("./json_test.txt");
        try {
            FileReader myFileReader=new FileReader(myFile);
            BufferedReader myBufferedReader=new BufferedReader(myFileReader);
            String temp;
            while((temp=myBufferedReader.readLine())!=null){
                str=str+temp;
            }
            myBufferedReader.close();
            myFileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}