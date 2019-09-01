package com.dhwang.design.factory.abstractmethod;

import com.dhwang.design.factory.AudiCar;
import com.dhwang.design.factory.Car;

public class AudiCarFactory implements CarFactory {
    @Override
    public Car create() {
        return new AudiCar();
    }
}
