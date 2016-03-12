package fsyt.ytweatherpro.mvp.model.bean;

import fsyt.ytweatherpro.mvp.model.bean.ResultBean;

/**
 * Created by KevinWu on 16-3-11.
 */
public  class WeatherBean {
    private String reason;
    private ResultBean result;
    private int error_code;

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }




}