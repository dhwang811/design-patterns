package com.dhwang.design.singleton.util;

import java.lang.reflect.Constructor;

/**
 * @author : joe
 * create at:  2019-09-05  09:45
 */
public class ReflectUtils {

    public static <T> T getInstance(Class<T> clazz) throws Exception
    {
        Constructor<T> c = clazz.getDeclaredConstructor();
        c.setAccessible(true);
        return c.newInstance();
    }

}