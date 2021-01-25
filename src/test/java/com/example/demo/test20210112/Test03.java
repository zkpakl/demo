package com.example.demo.test20210112;

import org.springframework.util.FileCopyUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

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
            FileCopyUtils.copy(fis,fos);
            File file = new File("test.txt");
            byte[] buffer = FileCopyUtils.copyToByteArray(file);
            String encode = Base64.getEncoder().encodeToString(buffer);
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
