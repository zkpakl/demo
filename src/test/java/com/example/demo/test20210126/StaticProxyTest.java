package com.example.demo.test20210126;

/**
 * @author zuokun
 * @date 2021/1/26 10:27
 */
public class StaticProxyTest {

    public static void main(String[] args) {
        Female youngMan = new YoungMan();
        SoulStaticProxy soulStaticProxy = new SoulStaticProxy(youngMan);
        soulStaticProxy.findWife("小姑娘");
    }
}
