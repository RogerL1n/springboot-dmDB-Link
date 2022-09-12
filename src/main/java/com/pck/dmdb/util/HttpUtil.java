package com.pck.dmdb.util;


import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: dmdb
 * @description:
 * @author: Pck
 * @create: 2022-08-23 16:49
 **/

public class HttpUtil {

    public static JSONObject post(String url, String jsonObject) {
        JSONObject jsonResult;
        HttpResponse response = HttpRequest.post(url)
                .body(jsonObject).execute();
        Map<String, Object> map = new HashMap<>();
        if (response.getStatus() == 200) {
            map.put("static", response.getStatus());
            map.put("message", "success");
            map.put("re", response.body());
        } else {
            map.put("static", response.getStatus());
            map.put("message", "fail");
            map.put("re", null);
        }
        jsonResult = new JSONObject(map);
        return jsonResult;
    }
}
