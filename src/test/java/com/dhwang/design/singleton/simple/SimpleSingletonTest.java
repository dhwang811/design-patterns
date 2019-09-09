package com.dhwang.design.singleton.simple;

import com.dhwang.design.singleton.util.ReflectUtils;

/**
 * @author : joe
 * create at:  2019-09-04  19:58
 */
public class SimpleSingletonTest {

    public static void main(String[] args) {

        try {
            SimpleSingleton simpleSingleton = ReflectUtils.getInstance(SimpleSingleton.class);
            System.out.println(SimpleSingleton.getInstance() == simpleSingleton);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}