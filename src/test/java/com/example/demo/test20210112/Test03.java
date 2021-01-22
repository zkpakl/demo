package com.example.demo.test20210112;

import java.io.*;

/**
 * @author zuokun
 * @date 2021/1/22 15:37
 */
public class Test03 {
    public static void main(String[] args){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("test.txt");
            fos = new FileOutputStream("test1.txt");
            int len = 0;
            byte[] bytes = new byte[fis.available()];
            while ( (len = fis.read(bytes)) != -1){
                fos.write(bytes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fis.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
