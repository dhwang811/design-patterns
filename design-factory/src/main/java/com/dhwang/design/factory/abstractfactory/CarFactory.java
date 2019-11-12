package com.dhwang.design.factory.abstractfactory;

import com.dhwang.design.factory.Car;

public interface CarFactory {

    Car motoCarCreate();

    Car electricCarCreate();

    Car commonCarCreate();

}
