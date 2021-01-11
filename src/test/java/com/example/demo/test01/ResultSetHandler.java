package com.example.demo.test01;

public class ResultSetHandler {

    public void handlerResultSets(Statement statement) {
        String queryStr = statement.query ();
        System.out.println (queryStr);
    }
}

