package com.example.demo.utils;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 多线程
 * @author zuokun
 * @date 2021/1/21 18:19
 */
public final class ThreadExecuteUtils {

    private static final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
            5, 6, 60,
            TimeUnit.SECONDS, new LinkedBlockingQueue<>());

    private ThreadExecuteUtils() {
    }

    public static ThreadPoolExecutor takeThreadExecute(){
        return threadPoolExecutor;
    }
}