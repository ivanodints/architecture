package ru.geekbrains.abstract_factory_pattern.vehicle;

import ru.geekbrains.abstract_factory_pattern.VehicleFactory;
import ru.geekbrains.abstract_factory_pattern.engine.Engine;
import ru.geekbrains.abstract_factory_pattern.engine.SportEngine;
import ru.geekbrains.abstract_factory_pattern.wheel.Wheel;
import ru.geekbrains.abstract_factory_pattern.wheel.WorkWheel;

public class UniversalVehicle implements VehicleFactory {

    public Engine createEngine() {
        return new SportEngine();
    }

    public Wheel createWheel() {
        return new WorkWheel();
    }

    public void start(){
        System.out.println("Возможные свойства универсальной машины:");
        this.createEngine().drive();
        this.createWheel().doRotation();
        System.out.println("--------------------------");
    }
}
