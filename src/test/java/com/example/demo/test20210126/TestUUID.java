package com.example.demo.test20210126;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.util.UUID;

/**
 * @author zuokun
 * @date 2021/1/26 9:45
 */
public class TestUUID {


    @Test
    public void testUUID(){
        String str1 = UUID.randomUUID().toString().replace("-", StringUtils.EMPTY);
        String str2 = UUID.randomUUID().toString();
        System.out.println(str1);
        System.out.println(str2);
    }
}
