package com.example.demo.test20210111;

import java.io.*;

/**
 * @author zuokun
 * @date 2021/1/11 23:08
 */
public class EfficentCopyFile {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("Demo01.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("Dem0.txt"));
        String str;
        while ((str = br.readLine()) != null){
            bw.write(str);
            // 自动根据操作系统选择对应的换行符
            bw.newLine();
            bw.flush();
        }
        br.close();
        bw.close();
    }
}
