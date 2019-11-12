package com.dhwang.design.factory.abstractfactory;

import com.dhwang.design.factory.Car;

public class AudiElectricCar implements Car {
    @Override
    public String show() {
        return "this is audi electric car";
    }
}
