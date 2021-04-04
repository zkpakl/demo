package com.example.demo.test20210401;

import java.util.Arrays;

/**
 * @author ZuoKun on 2021/4/1
 */
public class Test {
    public static void main(String[] args) {
        String str = "asd";
        System.out.println(toUpCase(str));
        System.out.println(JumpFloor(7));
    }

    public static int JumpFloor(int target){
        if (target == 1){
            return 1;
        }
        if (target == 2){
            return 2;
        }
        else {
            return JumpFloor(target-1)+JumpFloor(target-2);
        }
    }

    public static String toUpCase(String str){
        char[] a = str.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (a[i]>='a' && a[i]<='z'){
                a[i]-=32;
            }
        }
        String ss = Arrays.toString(a);
        return ss;
    }
}
