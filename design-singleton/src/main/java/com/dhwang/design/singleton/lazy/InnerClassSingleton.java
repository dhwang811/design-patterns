package com.dhwang.design.singleton.lazy;

/**
 * @author : joe
 * create at:  2019-09-04  20:18
 */
public class InnerClassSingleton {

    private InnerClassSingleton(){

        if(null != Lazy.INSTANCE)
        {
            throw new RuntimeException("不允许创建多个实例");
        }

    }

    public static InnerClassSingleton getInstance()
    {
        return Lazy.INSTANCE;
    }

    private static class Lazy{
        private final static InnerClassSingleton INSTANCE = new InnerClassSingleton();
    }

}