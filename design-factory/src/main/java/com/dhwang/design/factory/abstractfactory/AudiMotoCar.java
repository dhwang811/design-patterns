package com.dhwang.design.factory.abstractfactory;

import com.dhwang.design.factory.Car;

public class AudiMotoCar implements Car {
    @Override
    public String show() {
        return "this is audi moto car";
    }
}
