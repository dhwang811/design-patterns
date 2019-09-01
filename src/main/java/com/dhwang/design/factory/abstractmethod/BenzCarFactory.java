package com.dhwang.design.factory.abstractmethod;

import com.dhwang.design.factory.BenzCar;
import com.dhwang.design.factory.Car;

public class BenzCarFactory implements CarFactory {
    @Override
    public Car create() {
        return new BenzCar();
    }
}
