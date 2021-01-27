package com.example.demo.test20210126;

import org.apache.commons.lang3.StringUtils;

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

    /**
     *
     * @param proxy:代理类代理的真实代理对象com.sun.proxy.$Proxy0
     * @param method:我们所要调用某个对象真实的方法的Method对象
     * @param args:指代理对象方法传递的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println(female.toString());
        System.out.println("========欢迎光临==========");
        System.out.println("需要的服务项目为："+method.getName());
        String resultValue = (String) method.invoke(female, args);
        System.out.println("========付款之后===========");
        if (StringUtils.equals(resultValue, "阿姨")) {
            return women();
        }
        if (StringUtils.equals(resultValue, "小姑娘")) {
            return girl();
        }
        return "";

    }

    public String girl() {
        System.out.println("您要的年轻美丽小姑娘来了");
        return "您要的年轻美丽小姑娘来了";
    }

    public String women() {
        System.out.println("您要的知性风韵老阿姨来了");
        return "您要的知性风韵老阿姨来了";
    }
}
