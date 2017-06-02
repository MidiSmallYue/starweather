package com.example.zhangyue.starweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by zhangyue on 2017/6/2.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;
    private String weatherId;

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

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


    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
