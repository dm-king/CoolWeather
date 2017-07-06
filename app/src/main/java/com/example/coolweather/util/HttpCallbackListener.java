package com.example.coolweather.util;

/**
 * Created by 98234 on 2017/7/6.
 */

public interface HttpCallbackListener {
    void onFinish(String response);// TODO: 2017/7/6
    void onError(Exception e);// TODO: 2017/7/6
}
