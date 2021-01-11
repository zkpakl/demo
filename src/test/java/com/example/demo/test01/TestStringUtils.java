package com.example.demo.test01;

/**
 * @author zuokun
 * @date 2020/12/4 10:41
 */
public class TestStringUtils {

    String name;

    public String toString() {
        return name;
    }

    private void SetName(String name){
        this.name = name;
    }


    public static int add(){
        return 1;
    }



    public static void main(String[] args) {
        System.out.println(TestStringUtils.add());
        TestStringUtils utils = new TestStringUtils();
        utils.SetName("张三");
        System.out.println(utils.toString());
    }

}
