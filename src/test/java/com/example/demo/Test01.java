package com.example.demo;

import org.apache.commons.collections.map.HashedMap;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zuokun
 * @description
 * @date 2021/3/26 19:07
 */
public class Test01 {

    public static void main(String[] args) {
        boolean[] persons = OraginPeo(10);
        for (int i = 0; i < persons.length; i++) {
            if (persons[i]) {
                System.out.println("最后留下的是："+(i+1)+"号。");
            }
        }
    }
    public static boolean[] OraginPeo(int person) {
        boolean[] persons = new boolean[person];
        int number = person, key = 0;
        for (int i = 0; i < person; i++)
            persons[i] = true;
        while (number != 1) {
            for (int i = 0; i < person; i++) {
                if (!persons[i]) {
                    continue;
                } else {
                    key++;
                    if (key % 3 == 0) {
                        System.out.println("编号为："+(i+1)+"的人退出。");
                        persons[i] = false;
                        key = 0;
                    }
                }
            }
            number = 0;
            for (int i = 0; i < person; i++) {
                if (persons[i]) {
                    number++;
                }
            }
        }
        return persons;
    }
}
