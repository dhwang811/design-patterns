package com.dhwang.design.singleton.lazy;

import java.lang.reflect.Constructor;

/**
 * @author : joe
 * create at:  2019-09-04  20:18
 */
public class InnerClassSingletonTest {

    public static void main(String[] args) {
        InnerClassSingleton singleton = InnerClassSingleton.getInstance();
        System.out.println(singleton);
        try {
            Class<?> clazz = InnerClassSingleton.class;
            Constructor<?> constructor = clazz.getDeclaredConstructor();
            constructor.setAccessible(true);
            InnerClassSingleton innerClassSingleton = (InnerClassSingleton) constructor.newInstance();
            System.out.println(innerClassSingleton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}