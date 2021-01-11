package com.example.demo.test01;

import org.mockito.Mockito;

public class MockTest {


    public static void main(String[] args) {

        // 使用mock模拟Statement接口行为，这里假设执行查询，返回的结果为test
        Statement imock = Mockito.mock (Statement.class);
        Mockito.when (imock.query ()).thenReturn ("test01");

        // 使用spy创建一个真实对象
        ResultSetHandler useMock = Mockito.spy (ResultSetHandler.class);
        useMock.handlerResultSets (imock);
    }
}
