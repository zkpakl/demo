package com.example.demo.algorithm;

import java.util.Arrays;
import java.util.Objects;

/**
 * @author zuokun
 *
 * @date 2021/1/27 17:27
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] num = {1, 21, 34, 665, 43, 21, 4, 12};
        selectionSort(num);
        System.out.println(Arrays.toString(num));

    }

    public static void selectionSort(int[] array) {
        if (Objects.isNull(array) || array.length <= 1) {
            return;
        }

        int length = array.length;
        // 外层循环控制循环的次数
        for (int i = 0; i < length - 1; i++) {
            int minIndex = i;
            for (int j = i+1; j < length; j++) {
                if (array[j]<array[minIndex]){
                    minIndex = j;
                }
            }
            // 交换元素位置
            if (i != minIndex) {
                swap(array, minIndex, i);
            }
        }

    }

    /**
     * Description: 交换元素位置
     *
     * @param array
     * @param a
     * @param b
     * @return void
     * @author zuokun
     * @date 2021/1/27 17:33
     */
    private static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
