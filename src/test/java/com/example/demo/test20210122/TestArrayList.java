package com.example.demo.test20210122;

import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

/**
 * @author zuokun
 * @date 2021/1/22 17:35
 */
public class TestArrayList<E> extends AbstractList<E>
        implements List<E>, RandomAccess, Cloneable, java.io.Serializable {


    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
