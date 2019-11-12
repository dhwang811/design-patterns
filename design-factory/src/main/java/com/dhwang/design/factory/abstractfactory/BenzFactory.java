package com.dhwang.design.factory.abstractfactory;

import com.dhwang.design.factory.Car;

public class BenzFactory implements CarFactory {
    @Override
    public Car motoCarCreate() {
        return new BenzMotoCar();
    }

    @Override
    public Car electricCarCreate() {
        return new BenzElectricCar();
    }

    @Override
    public Car commonCarCreate() {
        return new BenzCommonCar();
    }
}
