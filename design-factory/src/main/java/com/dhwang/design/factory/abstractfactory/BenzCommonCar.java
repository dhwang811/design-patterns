package com.dhwang.design.factory.abstractfactory;

import com.dhwang.design.factory.Car;

public class BenzCommonCar implements Car {
    @Override
    public String show() {
        return "this is benz common car";
    }
}
