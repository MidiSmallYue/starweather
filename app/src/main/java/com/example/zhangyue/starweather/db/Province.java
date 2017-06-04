package com.example.zhangyue.starweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by zhangyue on 2017/6/2.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    private int provinceCode;

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
