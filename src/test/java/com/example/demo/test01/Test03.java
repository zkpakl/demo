package com.example.demo.test01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author zuokun
 * @date 2020/11/7 21:22
 */
public class Test03 {
    public static void main(String[] args) {
        String str = "{\"isPassed\":\"通过\",\"one1\":\"a\"},{\"two2\":\"\",\"two3\":\"\",\"isPassed\":\"通过\",\"two1\":0},{\"three1\":0,\"isPassed\":\"通过\",\"three3\":\"\",\"three2\":\"\"},{\"isPassed\":\"通过\",\"four1\":1,\"four3\":1,\"four2\":0,\"four4\":\"\"},{\"five1\":1,\"isPassed\":\"通过\",\"five4\":\"\",\"five5\":\"\",\"five2\":0,\"five3\":\"\"},{\"isPassed\":\"通过\",\"six3\":1,\"six2\":1,\"six1\":1},{\"isPassed\":\"通过\",\"seven4\":1,\"seven3\":0,\"seven2\":\"\",\"seven1\":1,\"seven6\":1,\"seven5\":0},{\"eight2\":\"\",\"isPassed\":\"\",\"eight1\":1,\"eight4\":\"\",\"eight3\":\"\",\"eight6\":\"\",\"eight5\":\"\",\"eight8\":\"\",\"eight7\":\"\"},{\"nine1\":0,\"isPassed\":\"通过\",\"nine3\":\"\",\"nine2\":0}";
        int length = str.length();
        String str1=str.replace("通过","");
        System.out.println(str1.length());

        String[] strings = str.split(",");

        System.out.println(str);
        //str = str.replace(searchChar, "");
        System.out.println(strings.length);

        LocalDateTime today_start = LocalDateTime.of(LocalDate.now(), LocalTime.MIN);
        LocalDateTime today_end = LocalDateTime.of(LocalDate.now(), LocalTime.MAX);//当天零点
        System.out.println(today_start);
        System.out.println(today_end);


    }
}
