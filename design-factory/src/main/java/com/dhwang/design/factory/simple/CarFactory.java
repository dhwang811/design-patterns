package com.dhwang.design.factory.simple;

import com.dhwang.design.factory.AudiCar;
import com.dhwang.design.factory.BenzCar;
import com.dhwang.design.factory.Car;

public class CarFactory {

    /**
     * 简单工厂实现方式一
     *
     * @param name
     * @return
     */
    public Car create(String name)
    {
        if(null != name && !"".equals(name))
        {
            switch (name)
            {
                case "Benz":
                    return new BenzCar();
                case "Audi":
                    return new AudiCar();
                default:
                    break;
            }
        }
        return null;
    }




    /**
     * 简单工厂实现方式二
     *
     * @param clazz
     * @return
     */
    public Car createByClazz(Class clazz)
    {
        if(null != clazz)
        {
            try {
                return (Car) clazz.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /**
     * 简单工厂实现三
     *
     * @param className
     * @return
     */
    public Car crateByClassName(String className)
    {
        if(null != className && !"".equals(className))
        {
            try {
                return (Car) Class.forName(className).newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}
