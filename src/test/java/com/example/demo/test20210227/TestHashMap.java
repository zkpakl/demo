package com.example.demo.test20210227;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestHashMap {


    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap();
        map.put("1","2");
        map.put("1","3");
        Iterator it =map.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry entry=(Map.Entry) it.next();
            System.out.println("k="+entry.getKey()+"  ,  "+"v="+entry.getValue());
        }


        for (Map.Entry<String,String> entry : map.entrySet()
             ) {
            String mapKey = entry.getKey();
            String mapValue = entry.getValue();
            System.out.println(mapKey+":"+mapValue);
        }

        for (String key:map.keySet()
             ) {
            System.out.println(key);
        }
        for (String value:map.values()
             ) {
            System.out.println(value);
        }
        for (String key:map.keySet()
             ) {
            String value = map.get(key);
            System.out.println(key+":"+value);
        }

        map.forEach((k,v)-> System.out.println("k="+k+",v="+v));
        map.forEach((k,v)->{
            System.out.println("k="+k+",v="+v);
        });


    }
}
