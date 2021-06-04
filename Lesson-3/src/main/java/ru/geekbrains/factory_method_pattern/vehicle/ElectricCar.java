package ru.geekbrains.factory_method_pattern.vehicle;

import ru.geekbrains.factory_method_pattern.Vehicle;
import ru.geekbrains.factory_method_pattern.engine.ElectricEngine;
import ru.geekbrains.factory_method_pattern.engine.Engine;


public class ElectricCar extends Vehicle {
    @Override
    public Engine createEngine() {
        return new ElectricEngine();
    }
}
