package com.example.demo.test20210111;

import java.io.*;

/**
 * @author zuokun
 * @date 2021/1/11 22:38
 */
public class CopyFile {
    public static void main(String[] args) throws IOException {
        Reader reader = null;
        Writer writer = null;

        reader = new FileReader("Demo01.txt");
        writer = new FileWriter("Demo1.txt");
        char[] chars = new char[1024];
        int len = 0;
        while ((len = reader.read(chars))!=-1){
            writer.write(new String(chars,0,len));
            writer.flush();
        }
        reader.close();
        writer.close();

    }
}
