package com.tyq.readprogress.net;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;
import com.loopj.android.http.RequestParams;

/**
 * Created by tyq on 2015/9/7.
 */

public class BaseAsyncHttp extends AsyncHttpClient {
    public static final String HOST = "http://api.douban.com/v2/movie/subject/";

    public static void getReq(String url,RequestParams params,JsonHttpResponseHandler handler){
        new AsyncHttpClient().get(url, params, handler);
    }
}
