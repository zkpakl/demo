package com.example.demo.test20210126;

import org.apache.commons.lang3.StringUtils;

/**
 * @author zuokun
 * @date 2021/1/26 10:18
 */
public class SoulStaticProxy implements Female {
    private Female female;

    public SoulStaticProxy(Female female) {
        this.female = female;
    }

    @Override
    public String findWife(String s) {
        this.female.findWife(s);
        if (StringUtils.equals(s, "阿姨")) {
            return women();
        }
        return girl();
    }

    @Override
    public String man() {
        return null;
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
