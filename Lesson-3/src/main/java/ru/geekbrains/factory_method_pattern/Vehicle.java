package ru.geekbrains.factory_method_pattern;

import ru.geekbrains.factory_method_pattern.engine.Engine;

public abstract class Vehicle {
    public void drive(){
        Engine engine = createEngine();
        engine.doSpeed();
    }
    public abstract Engine createEngine();
}
