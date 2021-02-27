package com.example.demo.test20210205;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test001 {
    public static void main(String[] args) {
        //1.创建可缓存的线程池，可重复利用
        ExecutorService newExecutorService = Executors.newCachedThreadPool();
        //创建了10个线程
        for (int i = 0; i < 10; i++) {
            int temp = i;
            newExecutorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("threadName;"+Thread.currentThread().getName()+",i"+temp);
                }
            });
        }

    }
}