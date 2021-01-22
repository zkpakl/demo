package com.example.demo.test20210112;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author zuokun
 * @date 2021/1/12 9:56
 */
public class Test02 {

    /**
     * 字节输入流
     */
    @Test
    public void inputStream(){
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("test.txt");
            int len = 0;
            byte[] bytes = new byte[fis.available()];
            while ((len = fis.read(bytes)) != -1){
                System.out.println(new String(bytes,0,len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
