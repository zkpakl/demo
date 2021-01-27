package com.example.demo.algorithm;

import java.util.Arrays;

/**
 * @author zuokun
 * @date 2021/1/27 15:38
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] num = {1, 21, 34, 665, 43, 21, 4, 12};
        bubbleSort(num);
        System.out.println(Arrays.toString(num));

    }

    public static void bubbleSort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        int length = array.length;
        // 外层循环控制比较轮数i
        for (int i = 0; i < length; i++) {
            // 内层循环控制每一轮比较次数，每进行一轮排序都会找出一个较大值
            // (array.length - 1)防止索引越界，(array.length - 1 - i)减少比较次数
            for (int j = 0; j < length - 1 - i; j++) {
                // 前面的数大于后面的数就进行交换
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
