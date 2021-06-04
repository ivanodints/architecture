package ru.geekbrains.abstract_factory_pattern.vehicle;

import ru.geekbrains.abstract_factory_pattern.VehicleFactory;
import ru.geekbrains.abstract_factory_pattern.engine.Engine;
import ru.geekbrains.abstract_factory_pattern.engine.HardWorkEngine;
import ru.geekbrains.abstract_factory_pattern.wheel.Wheel;
import ru.geekbrains.abstract_factory_pattern.wheel.WorkWheel;

public class HardWorkVehicle implements VehicleFactory {

    public Engine createEngine() {
        return new HardWorkEngine();
    }

    public Wheel createWheel() {
        return new WorkWheel();
    }

    public void start(){
        System.out.println("Свойства грузовой машины:");
        this.createEngine().drive();
        this.createWheel().doRotation();
        System.out.println("--------------------------");
    }
}
