package com.example.demo.test20210121;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 多线程
 * @author zuokun
 * @date 2021/1/21 18:19
 */
public final class ThreadExecute {

    private static final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
            2, 4, 60,
            TimeUnit.SECONDS, new LinkedBlockingQueue<>());

    private ThreadExecute() {
    }

    public static ThreadPoolExecutor takeThreadExecute(){
        return threadPoolExecutor;
    }
}