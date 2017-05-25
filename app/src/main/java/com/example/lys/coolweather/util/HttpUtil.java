package com.example.lys.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**网络请求工具类
 * Created by lys on 2017/5/25.
 */

public class HttpUtil {

    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
