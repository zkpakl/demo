package com.example.demo.algorithm;

import java.util.Arrays;

/**
 * @author zuokun
 * @date 2021/1/27 18:04
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] array = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        // 只需要修改成对应的方法名就可以了
        quickSort(array);

        System.out.println(Arrays.toString(array));
    }


    public static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }


    private static void quickSort(int[] array, int left, int right) {
        if (array == null || left >= right || array.length <= 1) {
            return;
        }
        int mid = partition(array, left, right);
        quickSort(array, left, mid);
        quickSort(array, mid + 1, right);
    }


    private static int partition(int[] array, int left, int right) {
        int temp = array[left];
        // int[] array = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        // 第一次排序{2, 3, 38, 5, 47, 15, 36, 26, 27, 44, 46, 4, 19, 50, 48}
        // 第二次排序{2, 3, 19, 5, 15, 36, 26, 27, 4, 38, 46, 47, 44, 50, 48}
        //
        // 第三次排序{2, 3, 4, 5, 15, 19, 26, 27, 36, 38, 46, 47, 44, 50, 48}
        // 第四次排序{2, 3, 4, 5, 36, 26, 27, 15, 19, 38, 46, 44, 47, 50, 48}
        // 第五次排序{2, 3, 4, 5, 36, 26, 27, 15, 19, 38, 46, 44, 47, 50, 48}

        while (right > left) {
            // 先判断基准数和后面的数依次比较
            while (temp <= array[right] && left < right) {
                --right;
            }
            // 当基准数大于了 arr[left]，则填坑
            if (left < right) {
                array[left] = array[right];
                ++left;
            }
            // 现在是 arr[right] 需要填坑了
            while (temp >= array[left] && left < right) {
                ++left;
            }
            if (left < right) {
                array[right] = array[left];
                --right;
            }
        }
        array[left] = temp;
        return left;
    }
}
