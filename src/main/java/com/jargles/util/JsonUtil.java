package com.jargles.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class JsonUtil {

    public static JSONObject getErrorResult(int status, String message) {
        JSONObject jsonObject = new JSONObject();
        JSONObject result = new JSONObject();
        result.put("code", status);
        result.put("message", message);
        jsonObject.put("result", result);
        jsonObject.put("data", new JSONObject());
        jsonObject.put("array", new JSONArray());
        return jsonObject;
    }

    public static JSONObject getJsonResult(int status, String message, Object data, Object arrayList) {
        JSONObject jsonObject = new JSONObject();
        JSONObject result = new JSONObject();
        result.put("code", status);
        result.put("message", message);
        jsonObject.put("result", result);
        jsonObject.put("data", data);
        jsonObject.put("array", arrayList);
        return jsonObject;
    }
}
