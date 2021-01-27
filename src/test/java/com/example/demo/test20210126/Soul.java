package com.example.demo.test20210126;

import org.apache.commons.lang3.StringUtils;

/**
 * @author zuokun
 * @date 2021/1/26 10:18
 */
public class Soul implements Female {
    private Female female;

    public Soul(Female female) {
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

    public String girl() {
        System.out.println("年轻美丽小姑娘");
        return "年轻美丽小姑娘";
    }

    public String women() {
        System.out.println("风韵依旧老阿姨");
        return "风韵依旧老阿姨";
    }

}
