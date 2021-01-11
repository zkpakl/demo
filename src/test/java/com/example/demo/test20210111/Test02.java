package com.example.demo.test20210111;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author zuokun
 * @date 2021/1/11 13:18
 */
public class Test02 {
    public static void main(String[] args) {
        String s = testReturn();
        System.out.println(s);
    }

    @Test
    public void listToArray(){
        List<String> list = new ArrayList<>(2);
        list.add("a");
        list.add("b");
        String[] array = list.toArray(new String[0]);
        System.out.println(array);
        for (String s : array) {
            System.out.println(s);
        }
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }
    }

    @Test
    public void listRemove(){
        List<String> list = new ArrayList<>(2);
        list.add("1");
        list.add("2");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            if (iterator.next()=="1"){
                iterator.remove();
            }
        }
        System.out.println(list);
        /*list.forEach(list1 ->{
            if ("1".equals(list1)){
                list.remove(list1);
            }
        });*/
        System.out.println(list);
    }

    public static String testReturn(){
        return "a";
    }
}
