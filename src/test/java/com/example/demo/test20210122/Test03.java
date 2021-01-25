package com.example.demo.test20210122;

import java.util.function.Consumer;

/**
 * @author zuokun
 * @date 2021/1/22 17:49
 */
public class Test03 {

    public static void method(String name, Consumer<String> consumer) {
        consumer.accept(name);
    }

    public static void main(String[] args) {
        method("憨憨", (String name) -> {
                    String reName = new StringBuffer(name+name).toString();
            System.out.println(reName);
                }

        );
    }
}
