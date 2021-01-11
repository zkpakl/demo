package com.example.demo.test01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;

/**
 * @author zuokun
 * @date 2020/11/5 10:23
 */
public class Test02 {
    public static void main(String[] args) throws ParseException {
        String string1 = "归属部门_证券代码_项目名称_审计标签";
        String[] strings = string1.split("_");
        System.out.println(Arrays.toString(strings));

        String bondCode = "163VJ001";
        String year = bondCode.substring(0,2);
        String toMonth = bondCode.substring(2,3);
        String toDay = bondCode.substring(3,4);
        HashMap<String,String> toDateMap = new HashMap<String,String>();
        toDateMap.put("1","1");toDateMap.put("2","2");toDateMap.put("3","3");toDateMap.put("4","4");toDateMap.put("5","5");toDateMap.put("6","6");toDateMap.put("7","7");toDateMap.put("8","8");
        toDateMap.put("9","9");toDateMap.put("A","10");toDateMap.put("B","11");toDateMap.put("C","12");toDateMap.put("D","13");toDateMap.put("E","14");toDateMap.put("F","15");toDateMap.put("G","16");
        toDateMap.put("H","17");toDateMap.put("I","18");toDateMap.put("J","19");toDateMap.put("K","20");toDateMap.put("L","21");toDateMap.put("M","22");toDateMap.put("N","23");toDateMap.put("O","24");
        toDateMap.put("P","25");toDateMap.put("Q","26");toDateMap.put("R","27");toDateMap.put("S","28");toDateMap.put("T","29");toDateMap.put("U","30");toDateMap.put("V","31");
        String month = toDateMap.get(toMonth);
        String day = toDateMap.get(toDay);
        String toBeginInterestTime = "20"+year+"-"+month+"-"+day;
        System.out.println(toBeginInterestTime);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");//注意月份是MM
        Date beginInterestTime = simpleDateFormat.parse(toBeginInterestTime);
        System.out.println(beginInterestTime);
        String toBondVarieties = bondCode.substring(4,5);
        HashMap<String,String> toBondVarietiesMap = new HashMap<>();
        toBondVarietiesMap.put("J","集合信托");
        toBondVarietiesMap.put("Z","债权投资");
        String bondVarieties = toBondVarietiesMap.get(toBondVarieties);

        System.out.println(bondVarieties);

    }

}
