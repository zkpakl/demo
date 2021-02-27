package com.example.demo.test20210225;

/**
 * @author zuokun
 * @description
 * @date 2021/2/25 21:03
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {6,3,1,2,7,8,4};
        quickSort(arr,0,arr.length-1);
        for (int i = 0 ; i<=arr.length-1 ; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void quickSort(int[] arr,int left,int right){
        // 进行判断，如果左边索引比右边索引大，不合法直接return结束
        if (left > right){
            return;
        }
        // 定义变量保存基准数,已最左边的数为基准
        int base = arr[left];
        // 定义左边的变量
        int i = left;
        // 定义右边的变量
        int j = right;
        // 当i和j不相遇的时候一直进行检索
        while (i != j){
            // j从右往左检索
            while (arr[j] >= base && i<j){
                j--;
            }
            // i从左往右检索
            while (arr[i] <= base && i<j){
                i++;
            }
            // 代码停在这里，交换i和j的位置
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        // 跳出最外层while循环时i和j相遇此时交换相遇位置的元素和基准数字
        arr[left] = arr[i];
        arr[i] = base;
        // 此时第一次排序结束，接着进行递归调用
        // 排左边
        quickSort(arr,left,i-1);
        // 排右边
        quickSort(arr,j+1,right);
    }
}
