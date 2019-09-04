package com.dhwang.design.singleton.simple;

/**
 * @author : joe
 * create at:  2019-09-04  19:58
 */
public class SimpleSingleton {

    private final static SimpleSingleton INSTANCE = new SimpleSingleton();

    private SimpleSingleton(){
        if(null != INSTANCE)
        {
            throw new RuntimeException("不能创建多个实例");
        }
    }

    public static SimpleSingleton getInstace()
    {
        return INSTANCE;
    }
}