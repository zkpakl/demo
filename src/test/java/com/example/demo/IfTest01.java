package com.example.demo;

import lombok.extern.slf4j.Slf4j;



@Slf4j
public class IfTest01 {
    public static void main(String[] args) {
        String status = "foolish";
        String foolish= status.equals("foolish")?"get a bad man":"get a good man";
        log.info(foolish);


    }
}
