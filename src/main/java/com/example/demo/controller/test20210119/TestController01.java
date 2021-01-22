package com.example.demo.controller.test20210119;

import com.example.demo.entities.test.CommonResult;
import com.example.demo.entities.test20210119.TestUser01;
import com.example.demo.service.test20210119.TestService01;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

/**
 * @author zuokun
 * @date 2021/1/19 13:48
 */
@Slf4j
@RestController
public class TestController01 {

    @Autowired
    private TestService01 testService01;
    @Value("${server.port}")
    private String serverPort;


    @GetMapping(value = "/test/select/{id}")
    public CommonResult create(@PathVariable String id){
        List<TestUser01> testUser01 = testService01.Select(id);
        log.info("******查询结果："+testUser01.toString());
        if (Objects.nonNull(testUser01)){
            return new CommonResult(200,"查询数据成功,serverPort："+serverPort,testUser01.toString());
        }else {
            return new CommonResult(444,"插入数据失败",null);
        }
    }

}
