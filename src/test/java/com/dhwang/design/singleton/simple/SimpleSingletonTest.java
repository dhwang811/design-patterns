package com.dhwang.design.singleton.simple;

import java.lang.reflect.Constructor;

/**
 * @author : joe
 * create at:  2019-09-04  19:58
 */
public class SimpleSingletonTest {

    public static void main(String[] args) {

        try {
            Class<?> clazz = SimpleSingleton.class;
            Constructor<?> c = clazz.getDeclaredConstructor();
            c.setAccessible(true);
            SimpleSingleton simpleSingleton = (SimpleSingleton) c.newInstance();
            System.out.println(SimpleSingleton.getInstace() == simpleSingleton);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}