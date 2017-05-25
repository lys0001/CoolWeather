package com.example.lys.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * 用于存放省的数据
 * Created by lys on 2017/5/25.
 */

public class Province extends DataSupport{
    /**主键*/
    private int id;
    /**省的名称*/
    private String provinceName;
    /**省的编码*/
    private  int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
