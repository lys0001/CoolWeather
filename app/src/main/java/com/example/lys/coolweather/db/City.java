package com.example.lys.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * 用于存放市的数据
 * Created by lys on 2017/5/25.
 */

public class City extends DataSupport{

    private int id;
    /**市的名字*/
    private String cityName;
    /**市的代号*/
    private int cityCode;
    /**当前市所属省的ID*/
    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
