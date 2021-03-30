package com.example.demo.algorithm_test.test20210329;

/**
 * 给出一个整数数组，请在数组中找出两个加起来等于目标值的数，
 * 你给出的函数twoSum 需要返回这两个数字的下标（index1，index2），需要满足 index1 小于index2.。注意：下标是从1开始的
 * 假设给出的数组中只存在唯一解
 */
public class Solution04 {
    public int[] twoSum (int[] numbers, int target) {
        // write code here
        int len = numbers.length;
        int[] result = new int[2];
        for(int i = 0; i < len; i++) {
            for(int j = i+1; j < len; j++) {
                if(numbers[i] + numbers[j] == target) {
                    result[0] = i + 1;
                    result[1] = j + 1;
                }
            }
        }
        return result;
    }
}
