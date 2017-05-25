package com.example.lys.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * 用于存放县的数据
 * Created by lys on 2017/5/25.
 */

public class County extends DataSupport{

    private int id;
    /**县的名字*/
    private String countyName;
    /**县对应天气的ID*/
    private String weatherId;
    /**当前县所属市的ID*/
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
