package com.dhwang.design.factory.abstractfactory;

import com.dhwang.design.factory.Car;

public class AudiFactory implements CarFactory {
    @Override
    public Car motoCarCreate() {
        return new AudiMotoCar();
    }

    @Override
    public Car electricCarCreate() {
        return new AudiElectricCar();
    }

    @Override
    public Car commonCarCreate() {
        return new AudiCommonCar();
    }
}
