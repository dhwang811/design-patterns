package com.dhwang.design.factory.simple;

import com.dhwang.design.factory.AudiCar;
import com.dhwang.design.factory.Car;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car audiCar = carFactory.crateByClassName("com.dhwang.design.factory.AudiCar");
        System.out.println(audiCar.show());
        Car benzCar = carFactory.create("Benz");
        System.out.println(benzCar.show());
        Car audiCar1 = carFactory.createByClazz(AudiCar.class);
        System.out.println(audiCar1.show());
    }
}
