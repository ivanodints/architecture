package ru.geekbrains.factory_method_pattern.engine;

public class ElectricEngine implements Engine{
    @Override
    public void doSpeed() {
        System.out.println("Двигатель развивает скорость потребляя электричество");
    }
}
