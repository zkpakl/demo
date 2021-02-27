package com.example.demo.test20210226;

/**
 * @author zuokun
 * @description
 * @date 2021/2/26 21:17
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {9,3,1,4,6,7};
        quickSort(arr,0,arr.length-1);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void quickSort(int[] arr,int left,int right){
        // 首先保证right大于left
        if (left > right){
            return;
        }
        int i = left;
        int j = right;
        int base = arr[left];

        // 开始循环排序
        while (i != j){
            // 首先对右边的指针进行移动
            while (j >= base && j>i){
                j--;
            }
            // 接着对左边的指针进行移动
            while (i <= base && j>i){
                i++;
            }
            // 当跳出两次循环，两个指针静止的时候
            // 交换两个指针所在元素的位置
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        // 跳出循环后表示i和j相遇此时交换相遇位置元素和基准的位置
        int temp = arr[i];
        arr[i] = base;
        arr[left] = temp;

        // 递归调用左边排序
        quickSort(arr,left,i-1);
        // 递归调用右边排序
        quickSort(arr,i+1,right);
    }
}
