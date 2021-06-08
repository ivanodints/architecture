package ru.geekbrains.abstract_factory_pattern.vehicle;

import ru.geekbrains.abstract_factory_pattern.VehicleFactory;
import ru.geekbrains.abstract_factory_pattern.engine.SportEngine;
import ru.geekbrains.abstract_factory_pattern.engine.Engine;
import ru.geekbrains.abstract_factory_pattern.wheel.SportWheel;
import ru.geekbrains.abstract_factory_pattern.wheel.Wheel;

public class SportVehicle implements VehicleFactory {
    public Engine createEngine() {
        return new SportEngine();
    }

    public Wheel createWheel() {
        return new SportWheel();
    }

    public void start(){
        System.out.println("Свойства спортивной машины:");
        this.createEngine().drive();
        this.createWheel().doRotation();
        System.out.println("--------------------------");
    }
}
