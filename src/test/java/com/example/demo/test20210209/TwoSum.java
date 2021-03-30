package com.example.demo.test20210209;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(twoSum(arr,6)));
    }

    public static int[] twoSum(int[] num,int target){
        int len = num.length;
        int[] result = new int[2];
        //map里面放 键为target-每个数的结果 值为下标
        //每次放入的时候看是否包含 当前值
        //有的话说明当前值和已包含的值下标的那个元素为需要的结果
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<len;i++){
            if(map.containsKey(num[i])){
                result[0] = map.get(num[i])+1;
                result[1] = i+1;
                break;
            }
            else{
                map.put(target - num[i], i);
            }
        }
        return result;
    }
}
