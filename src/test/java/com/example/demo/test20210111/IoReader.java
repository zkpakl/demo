package com.example.demo.test20210111;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * @author zuokun
 * @date 2021/1/11 18:31
 */
public class IoReader {

    /**
     * 读取字符流
     *
     * @param args
     */
    public static void main(String[] args) throws IOException {
        Reader reader = null;
        try{
            reader = new FileReader("Demo01.txt");
            char[] arr = new char[5];
            int red = 0;
            while((red = reader.read(arr))!= -1 ){
                System.out.println(new String(arr,0,red));

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        reader.close();
    }
}
