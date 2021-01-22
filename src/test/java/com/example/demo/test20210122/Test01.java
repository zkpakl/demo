package com.example.demo.test20210122;

import com.alibaba.fastjson.JSONArray;
import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.*;

/**
 * @author zuokun
 * @date 2021/1/22 9:22
 */
public class Test01 {
    @Test
    public void testJsonArray() {
        JSONArray jsonArray = new JSONArray();
        jsonArray.add("addhiportslavetaskforom");
        jsonArray.add("//asd");
        System.out.println(jsonArray);
//        File file = new File("C:\\Users\\admin\\Desktop\\生活");


        File file = new File(FileUtils.getTempDirectory() + File.separator
                + System.currentTimeMillis() + File.separator + "SCHEDULE.TXT");

        System.out.println(file);
        System.out.println(file.getName());
        System.out.println(file.toPath());
    }

    public static void main(String[] args) {
        String str = "";
        long starTime = System.currentTimeMillis();
        //计算循环5000的时间
        for (int i = 0; i < 5000; i++) {
            try (Reader reader = new FileReader("Demo.txt");Writer writer = new FileWriter("Demo1.txt")) {
                char[] chars = new char[1024];
                int len = 0;
                while ((len = reader.read(chars)) != -1) {
                    writer.write(new String(chars, 0, len));
                    writer.flush();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        long endTime = System.currentTimeMillis();
        long Time = endTime - starTime;
        System.out.println(Time);


        starTime=System.currentTimeMillis();
        //计算循环100000的时间
        for(int i=0;i<100000;i++){
            str=str+i;
        }
        endTime=System.currentTimeMillis();
        Time=endTime-starTime;
        System.out.println(Time);

        StringBuilder bulider = new StringBuilder("");
        starTime = System.currentTimeMillis();
        for (int j = 0; j < 100000; j++) {
            bulider.append(j);
        }
        endTime = System.currentTimeMillis();
        Time = endTime - starTime;
        System.out.println(Time);

        StringBuffer buffer = new StringBuffer("");
        starTime = System.currentTimeMillis();
        for (int j = 0; j < 100000; j++) {
            buffer.append(j);
        }
        endTime = System.currentTimeMillis();
        Time = endTime - starTime;
        System.out.println(Time);
    }
}
