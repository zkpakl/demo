package com.example.demo.test20210112;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author zuokun
 * @date 2021/1/12 9:30
 */
public class Test01 {
    /**
     * 字节输出流
     *  这是把IDEA上的数据写入进指定位置
     * @param args
     */
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("test.txt");
            fos.write("看plmm让人开心!".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 最后按照声明对象的逆顺序关闭流对象
        finally {
            if (fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
