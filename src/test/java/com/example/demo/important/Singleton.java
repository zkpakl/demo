package com.example.demo.important;

/**
 * @author zuokun
 * @date 2021/1/25 17:42
 */
public class Singleton {

    // 此处定义类变量实例并直接实例化，在类加载的时候就完成了实例化并保存在类中
    private static Singleton instance = new Singleton();
    // 定义无参构造器，用于单例实例
    private Singleton (){}
    // 定义公开方法，返回已创建的单例
    public static Singleton getInstance() {

        return instance;
    }
}
