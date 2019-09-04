package com.dhwang.design.factory.abstractmethod;

import com.dhwang.design.factory.Car;

public class MethodFactoryTest {

    public static void main(String[] args) {

        AudiCarFactory audiCarFactory = new AudiCarFactory();
        Car audiCar = audiCarFactory.create();

        BenzCarFactory benzCarFactory = new BenzCarFactory();
        Car benzCar = benzCarFactory.create();

        System.out.println(audiCar.show());
        System.out.println(benzCar.show());


    }

}
