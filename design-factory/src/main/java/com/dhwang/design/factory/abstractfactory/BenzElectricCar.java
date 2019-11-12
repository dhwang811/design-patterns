package com.dhwang.design.factory.abstractfactory;

import com.dhwang.design.factory.Car;

public class BenzElectricCar implements Car {
    @Override
    public String show() {
        return "this is benz electric car";
    }
}
