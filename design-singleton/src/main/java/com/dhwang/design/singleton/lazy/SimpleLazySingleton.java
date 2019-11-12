package com.dhwang.design.singleton.lazy;

/**
 * @author : joe
 * create at:  2019-09-05  09:42
 */
public class SimpleLazySingleton {

    private static SimpleLazySingleton singleton = null;

    private SimpleLazySingleton(){}

    public static SimpleLazySingleton getInstance()
    {
        if(null != singleton)
        {
            singleton = new SimpleLazySingleton();
        }
        return singleton;
    }

}