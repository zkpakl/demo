package com.example.demo.entities.test20210119;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author zuokun
 * @date 2021/1/19 13:43
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestUser01 implements Serializable {

        private String id;
        private String serial;

}
