package com.dhwang.design.factory.abstractfactory;

public class AbstractFactoryTest {

    public static void main(String[] args) {
        AudiFactory audiFactory = new AudiFactory();
        BenzFactory benzFactory = new BenzFactory();

        System.out.println(audiFactory.commonCarCreate().show());
        System.out.println(audiFactory.electricCarCreate().show());
        System.out.println(audiFactory.motoCarCreate().show());

        System.out.println(benzFactory.commonCarCreate().show());
        System.out.println(benzFactory.electricCarCreate().show());
        System.out.println(benzFactory.motoCarCreate().show());
    }


}
