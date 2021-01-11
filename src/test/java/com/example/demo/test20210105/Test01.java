package com.example.demo.test20210105;

import org.apache.commons.lang3.StringUtils;

/**
 * @author zuokun
 * @date 2021/1/5 16:17
 */
public class Test01 {
    public static void main(String[] args) {
        // ""空白的效果
        String result = StringUtils.EMPTY;
        StringUtils.isNotBlank(result);
        System.out.println(result);
        System.out.println(StringUtils.isNotBlank(result));
        System.out.println(StringUtils.isNotEmpty(result));
        System.out.println(StringUtils.isBlank(result));
        System.out.println(StringUtils.isEmpty(result));
        String str = "aaab";
        System.out.println(str.replace("a","b"));

    }
}
