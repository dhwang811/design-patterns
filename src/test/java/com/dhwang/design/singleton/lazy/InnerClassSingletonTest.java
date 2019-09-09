package com.dhwang.design.singleton.lazy;

import com.dhwang.design.singleton.util.ReflectUtils;

/**
 * @author : joe
 * create at:  2019-09-04  20:18
 */
public class InnerClassSingletonTest {

    public static void main(String[] args) {
        InnerClassSingleton singleton = InnerClassSingleton.getInstance();
        System.out.println(singleton);
        try {
            InnerClassSingleton innerClassSingleton = ReflectUtils.getInstance(InnerClassSingleton.class);
            System.out.println(innerClassSingleton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}