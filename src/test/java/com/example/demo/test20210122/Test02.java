package com.example.demo.test20210122;

import com.example.demo.utils.ThreadExecuteUtils;

/**
 * @author zuokun
 * @date 2021/1/22 16:38
 */
public class Test02 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            ThreadExecuteUtils.takeThreadExecute().execute(
                    () -> System.out.println("11")
            );
        }
        ThreadExecuteUtils.takeThreadExecute().shutdown();
    }
}
