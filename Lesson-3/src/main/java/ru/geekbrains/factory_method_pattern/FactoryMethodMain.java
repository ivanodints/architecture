package ru.geekbrains.factory_method_pattern;

import ru.geekbrains.factory_method_pattern.vehicle.DieselCar;
import ru.geekbrains.factory_method_pattern.vehicle.ElectricCar;

public class FactoryMethodMain {
    public static void main(String[] args) {
        startFactoryMethod();
    }

    public static void startFactoryMethod(){
        System.out.println("---------------START ABSTRACT METHOD PATTERN--------------");
        new ElectricCar().drive();
        new DieselCar().drive();
        System.out.println("---------------END ABSTRACT METHOD PATTERN--------------");
    }
}
