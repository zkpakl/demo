package com.example.demo.algorithm.test;

import java.util.Arrays;

/**
 * 数组中是否存在两数之和等于目标数
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] num = {1,2,3};
        System.out.println(Arrays.toString(twoSum(num,6)));
    }

    public static int[] twoSum(int[] num,int target){
        int[] ints = new int[2];
        for (int i=0; i <num.length-1 ; i++) {
            for (int j = 1; j <num.length ; j++) {
                if (i != j && num[i]+num[j] == target){
                        ints[0] = i;
                        ints[1] = j;
                }
            }
        }
        return ints;
    }
}
