package com.firstline.android.coolweather.util;

/**
 * Created by mabelxue on 2017/3/29.
 */

public interface HttpCallbackListener {

    void onFinish(String response);

    void onError(Exception e);
}
