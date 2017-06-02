package com.example.zhangyue.starweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by zhangyue on 2017/6/2.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceNmae;
    private int provinceCode;

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public void setProvinceNmae(String provinceNmae) {
        this.provinceNmae = provinceNmae;
    }

    public String getProvinceNmae() {
        return provinceNmae;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
