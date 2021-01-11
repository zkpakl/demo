package com.example.demo.test20210111;




import javafx.util.Pair;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author zuokun
 * @date 2021/1/11 10:50
 */
public class Test01 {

    @Test
    public void listToMap(){
        List<Pair<String, Double>> pairArrayList = new ArrayList<>(3);
        pairArrayList.add(new Pair<>("version",12.10));
        pairArrayList.add(new Pair<>("version",12.19));
        pairArrayList.add(new Pair<>("version",6.28));
        Map<String, Double> map = pairArrayList.stream().collect(
                // 生成的 map 集合中只有一个键值对：{version=6.28}
                Collectors.toMap(Pair::getKey, Pair::getValue, (v1, v2) -> v2));

        map.forEach((key,value) ->{
            System.out.println(key + ""+value);
        });

        for (Map.Entry entry:map.entrySet()
             ) {
            System.out.println(entry.getKey()+""+entry.getValue());
        }

        Iterator<Map.Entry<String, Double>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Double> next = iterator.next();
            System.out.println(next.getKey()+""+next.getValue());
        }
    }

}
