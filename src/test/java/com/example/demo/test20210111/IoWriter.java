package com.example.demo.test20210111;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * @author zuokun
 * @date 2021/1/11 17:23
 */
public class IoWriter {

    /**
     * Write 写入字符流
     * @param args
     */
    public static void main(String[] args) {
        try(Writer writer = new FileWriter("Demo.txt");BufferedWriter bw = new BufferedWriter(writer)) {
            // BufferedWriter将文本写入字符输出流，缓冲各个字符，从而提供单个字符、数组和字符串的高效写入；
            bw.write("狗男人，误终身!");
            // 清空缓存区，把数据强制输出
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
