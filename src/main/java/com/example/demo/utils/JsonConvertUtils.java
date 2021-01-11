package com.example.demo.utils;

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author zuokun
 * @date 2021/1/11 16:35
 */
public class JsonConvertUtils {

    /**
     * JSON转map
     * @param jsondata
     * @return
     */
    public static Map<String, Object> jsonToMap(String jsondata){
        // 把传来的字符串转成JSON对象
        JSONObject jsonObject = JSONObject.parseObject(jsondata);
        // 使用迭代器遍历把对应数据存入Map
        Iterator<Map.Entry<String, Object>> iterator = jsonObject.entrySet().iterator();
        Map<String,Object> stringObjectMap = new HashMap<>(16);
        while (iterator.hasNext()){
            Map.Entry<String, Object> entry = iterator.next();
            stringObjectMap.put(entry.getKey(),entry.getValue());
        }
        return stringObjectMap;
    }

    /**
     * Map转JSON字符串
     * @param map
     * @return
     */
    public static String mapToJson(Map<String,Object> map){

        String toJSONString = JSONObject.toJSONString(map);
        return toJSONString;
    }

}
