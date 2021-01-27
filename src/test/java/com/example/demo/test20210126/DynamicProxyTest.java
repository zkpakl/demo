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

        /**
         * 通过Proxy类的newProxyInstance方法创建代理对象，我们来看下方法中的参数
         * 第一个参数：YoungMan.class.getClassLoader()，使用female对象的classloader对象来加载我们的代理对象
         * 第二个参数：YoungMan.class.getInterfaces()，这里为代理类提供的接口是真实对象实现的接口，这样代理对象就能像真实对象一样调用接口中的所有方法
         * 第三个参数：soulDynamicProxyHandler，我们将代理对象关联到上面的InvocationHandler对象上
         *
         */
        Female proxyInstance = (Female) Proxy
                .newProxyInstance(YoungMan.class.getClassLoader(), YoungMan.class.getInterfaces(), soulDynamicProxyHandler);
        proxyInstance.findWife("小姑娘");

    }
}
