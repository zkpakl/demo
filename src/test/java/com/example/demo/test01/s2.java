package com.example.demo.test01;
 
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
 
public class s2 {
	public static void main(String[] args) throws IOException {
		List<String> list =new ArrayList<String>();
		list.add("1,2,3,4,5");
		list.add("李四");
		list.add("王五");
		System.out.println(list);
		File file = new File("D:\\userinf1.txt");
		Boolean flag =file.exists();
		System.out.println(flag);
		//将list写入文件
		Writer out = new FileWriter(file);
		BufferedWriter bw= new BufferedWriter(out);
		for(String s:list) {
			bw.write(s);
			bw.newLine();
			bw.flush();	
		}
		bw.close();	
	}
 
}