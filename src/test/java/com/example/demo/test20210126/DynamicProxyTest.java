package com.example.demo.test20210126;

import java.lang.reflect.Proxy;

/**
 * @author zuokun
 * @date 2021/1/26 11:30
 */
public class DynamicProxyTest {
    public static void main(String[] args) {
        Female female = new YoungMan();
        SoulDynamicProxyHandler soulDynamicProxyHandler = new SoulDynamicProxyHandler(female);
        Female proxyInstance = (Female) Proxy
                .newProxyInstance(YoungMan.class.getClassLoader(), YoungMan.class.getInterfaces(), soulDynamicProxyHandler);
        String instanceWife = proxyInstance.findWife("小姑娘");
        System.out.println(instanceWife);

    }
}
