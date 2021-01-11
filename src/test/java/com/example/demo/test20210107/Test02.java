package com.example.demo.test20210107;

import org.junit.Test;

import java.util.*;

/**
 * @author zuokun
 * @date 2021/1/7 15:50
 */
public class Test02 {
    @Test
    public void test02() {
        List<CompanyVO> companyVOList = new ArrayList<>();
        List<LinkedHashMap<Object,Object>> orgVos = new ArrayList<>();
        LinkedHashMap<Object,Object> map1 = new LinkedHashMap<>();
        LinkedHashMap<Object,Object> map2 = new LinkedHashMap<>();
        map1.put("id","1");
        map1.put("orgName","2");
        map1.put("age",14);
        orgVos.add(map1);
        map2.put("id","3");
        map2.put("orgName","4");
        map2.put("age",14);
        orgVos.add(map2);


        orgVos.forEach(orgVo ->{
            CompanyVO companyVO = new CompanyVO();
            companyVO.setId(orgVo.get("id").toString());
            companyVO.setName(orgVo.get("orgName").toString());
            companyVO.setAge(Integer.parseInt(orgVo.get("age").toString()));
            companyVOList.add(companyVO);
        });

//        orgVos.forEach(orgVo ->{
//            for (Map.Entry entry:orgVo.entrySet()){
//                System.out.println(entry.getKey()+""+entry.getValue());
//            }
//        });
//
//        orgVos.forEach(orgVo ->{
//            for (Map.Entry entry:orgVo.entrySet()){
//                System.out.println(entry.getKey()+""+entry.getValue());
//            }
//        });
        
        orgVos.forEach(orgVo ->{
            Iterator<Map.Entry<Object, Object>> iterator = orgVo.entrySet().iterator();
            while (iterator.hasNext()){
                Map.Entry<Object, Object> entry = iterator.next();
                System.out.println("key=" + entry.getKey() + ",value=" + entry.getValue());
            }
        });

    }


    @Test
    public void equalsArray(){
        String[] a = null;
        String[] b = null;
        System.out.println(Arrays.equals(a,b));
        Set set = new HashSet();
    }

}
