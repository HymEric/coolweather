package com.erichym.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Administrator on 2018/3/26 0026.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback)
    {
        //创建一个OkHttpClient实例
        OkHttpClient client=new OkHttpClient();
        //创建一个Request对象用于发送请求
        Request request=new Request.Builder().url(address).build();
        //调用的是call.enqueue，将call加入调度队列，然后等待任务执行完成，我们在Callback中即可得到结果。
        client.newCall(request).enqueue(callback);
    }
}
