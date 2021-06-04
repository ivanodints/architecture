package ru.geekbrains.factory_method_pattern.vehicle;

import ru.geekbrains.factory_method_pattern.Vehicle;
import ru.geekbrains.factory_method_pattern.engine.Engine;
import ru.geekbrains.factory_method_pattern.engine.GasolineEngine;

public class DieselCar extends Vehicle {
    @Override
    public Engine createEngine() {
        return new GasolineEngine();
    }

}
