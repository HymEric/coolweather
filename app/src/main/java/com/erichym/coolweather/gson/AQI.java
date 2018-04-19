package com.erichym.coolweather.gson;

/**
 * Created by Administrator on 2018/3/31 0031.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
