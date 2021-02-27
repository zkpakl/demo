package com.example.demo.test20210209;

import lombok.extern.slf4j.Slf4j;
import org.junit.platform.commons.util.StringUtils;

/**
 * @author zuokun
 * @description
 * @date 2021/2/9 10:41
 */
@Slf4j
public class Test01 {
    public static void main(String[] args) {
        switchTest("蔡鸡美");
        ifelseTest("蔡萝莉");
    }

    private static void ifelseTest(String str) {
        if (StringUtils.isNotBlank(str)) {
            if (str.equals("蔡萝莉")) {
                System.out.println(str + "会嘤嘤嘤");
            } else {
                System.out.println(str + "会唱跳rap打篮球");
            }
        }
    }

    public static void switchTest(String str) {
        String value = null;
        if (StringUtils.isNotBlank(str)) {
            switch (str) {
                case "蔡萝莉":
                    value = "嘤嘤嘤";
                    break;
                case "蔡鸡美":
                    value = "唱跳rap打篮球";
                    break;
                default:
                    log.info("{}：没找到你说的人！", str);
            }
        }
        System.out.println(str + "会" + value);
    }
}
