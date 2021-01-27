package com.example.demo.test20210126;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author zuokun
 * @date 2021/1/26 11:25
 */
public class SoulDynamicProxyHandler implements InvocationHandler {
    private Female female;

    public SoulDynamicProxyHandler(Female female) {
        this.female = female;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("========调用之前==========");
        Object resultValue = method.invoke(female, args);
        System.out.println("========调用之后===========");
        return resultValue;
    }

    public String girl() {
        System.out.println("年轻美丽小姑娘");
        return "年轻美丽小姑娘";
    }

    public String women() {
        System.out.println("风韵依旧老阿姨");
        return "风韵依旧老阿姨";
    }
}
