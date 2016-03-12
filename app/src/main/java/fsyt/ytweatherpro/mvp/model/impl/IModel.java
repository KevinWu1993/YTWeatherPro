package fsyt.ytweatherpro.mvp.model.impl;

import java.util.List;

/**
 * Created by KevinWu on 16-3-12.
 */
public interface IModel<model extends IModel>{

    /**
     * 联网获取数据
     */
    void getFromNet();

    /**
     * 从数据库获取数据
     */
    void getFromDB();

    /**
     * 把该model存进数据库
     * @param m
     * @return
     */
    boolean putInDB(model m);

    /**
     * 从数据库中删除该model
     * @return
     */
    boolean clearDB();
}
