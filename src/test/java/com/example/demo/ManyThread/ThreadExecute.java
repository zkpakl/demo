package com.example.demo.ManyThread;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class ThreadExecute {

    /**
     * keepAliveTime（必填）: 线程空闲时长。如果超过该时长，非核心线程就会被回收。
     * unit（必填）：指定keepAliveTime的时间单位。常用的有：TimeUnit.MILLISECONDS（毫秒）、TimeUnit.SECONDS（秒）、TimeUnit.MINUTES（分）
     * workQueue（必填）：任务队列。通过线程池的execute()方法提交的Runnable对象将存储在该队列中。
     * threadFactory（可选）：线程工厂。一般就用默认的。
     * handler（可选）：拒绝策略。当线程数达到最大线程数时就要执行饱和策略。
     */
    private static final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
            2, 4, 60,
            TimeUnit.SECONDS, new LinkedBlockingQueue<>());

    private ThreadExecute() {
    }

    public static ThreadPoolExecutor takeThreadExecute(){
        return threadPoolExecutor;
    }


}