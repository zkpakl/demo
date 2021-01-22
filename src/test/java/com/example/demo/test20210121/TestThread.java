package com.example.demo.test20210121;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zuokun
 * @date 2021/1/21 18:38
 */
public class TestThread {
    private final Object lock = new Object();

    @Test
    public void Speed() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("张三", "1");
        jsonObject.put("李四", "2");
        jsonObject.put("王二", "3");
        jsonObject.put("麻子", "4");
        jsonObject.put("憨批", "5");
        List<JSONObject> jsonObjectList = new ArrayList<>();
        jsonObjectList.stream()
                .filter(objectList -> Integer.parseInt(objectList.getString("1")) < 2)
                .collect(Collectors.toList())
                .forEach(jsonObject1 -> ThreadExecute.takeThreadExecute().execute(() -> {
                            synchronized (lock) {
                                System.out.println(jsonObject1.toString());
                                //这可以写一个list保存数据存入另一个库
                            }
                        }
                ));

        jsonObjectList.stream()
                .filter(objectList -> Integer.parseInt(objectList.getString("1")) > 2 && Integer.parseInt(objectList.getString("1")) < 2)
                .collect(Collectors.toList())
                .forEach(jsonObject1 -> ThreadExecute.takeThreadExecute().execute(() -> {
                            synchronized (lock) {
                                System.out.println(jsonObject1.toString());
                            }
                        }
                ));


    }
}
