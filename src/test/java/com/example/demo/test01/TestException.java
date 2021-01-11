package com.example.demo.test01;

/**
 * @author zuokun
 * @date 2020/12/25 10:20
 */
public class TestException {
    public static void main(String[] args) {
        double d = 13.4;
        long l = (long)d;
        System.out.println(l);
        int in = 5;
        //boolean b = (boolean)in;//编译出错
        Object obj = "hello";
        String str = (String)obj;//运行通过
        System.out.println(str);
        Object objPri = new Integer(5);
        String s = (String)objPri;//引发ClassCastException异常

    }
}
