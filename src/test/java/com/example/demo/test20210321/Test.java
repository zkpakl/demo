package com.example.demo.test20210321;

public class Test {
 
    public static void main(String args[]) {
        String str1 = "Strings";
        String str2 = "Strings";
        String str3 = "Strings1234444";
        Integer str4 = 1;
        Integer str5 = 2;
 
        int result = str1.compareTo( str2 );
        System.out.println(result);
      
        result = str2.compareTo( str3 );
        System.out.println(result);
     
        result = str3.compareTo( str1 );
        System.out.println(result);

        result = str4.compareTo(str5);
        System.out.println(result);
    }
}