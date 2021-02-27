package com.example.demo.test20210205;

import com.example.demo.ManyThread.ThreadExecute;
import com.google.common.collect.Lists;

import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * @author zuokun
 * @description
 * @date 2021/2/5 14:39
 */
public class BatchInsertMethod {

    public void batchInsert() {
        List<String> bigList = Lists.newArrayList();
        int size = 1099;
        for (int i = 0; i < size; i++) {
            bigList.add("蔡鸡美-" + i);
        }
        // 集合拆分注意小集合size和线程池的参数设置
        List<List<String>> partitionList = Lists.partition(bigList, 100);
        // 记录单个任务的执行次数
        CountDownLatch countDownLatch = new CountDownLatch(partitionList.size());
        // 对拆分的集合进行批量处理, 先拆分的集合, 再多线程执行
        for (List<String> singleList : partitionList) {
            // 线程池执行
            ThreadExecute.takeThreadExecute().execute(() -> {
                // todo
                for (;;) {
                    // 将每一个对象进行数据封装, 添加到一个用于存储更新数据的list
                    // 任务个数 - 1, 直至为0时唤醒await()
                    countDownLatch.countDown();
                }
            });
        }
        // 让当前线程处于阻塞状态
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}



