package ru.geekbrains.abstract_factory_pattern;

import ru.geekbrains.abstract_factory_pattern.engine.Engine;
import ru.geekbrains.abstract_factory_pattern.wheel.Wheel;

public interface VehicleFactory {

    Engine createEngine();
    Wheel createWheel();
    void start();

}
