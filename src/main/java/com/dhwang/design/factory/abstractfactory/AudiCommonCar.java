package com.dhwang.design.factory.abstractfactory;

import com.dhwang.design.factory.Car;

public class AudiCommonCar implements Car {
    @Override
    public String show() {
        return "this is audi common car";
    }
}
