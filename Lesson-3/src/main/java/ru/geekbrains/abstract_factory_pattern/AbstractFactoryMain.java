package ru.geekbrains.abstract_factory_pattern;

import ru.geekbrains.abstract_factory_pattern.vehicle.HardWorkVehicle;
import ru.geekbrains.abstract_factory_pattern.vehicle.SportVehicle;
import ru.geekbrains.abstract_factory_pattern.vehicle.UniversalVehicle;

public class AbstractFactoryMain {

    public static void main(String[] args) {

        starAbstractFactoryPattern();

    }

    public static void starAbstractFactoryPattern(){
        System.out.println("---------------START ABSTRACT FACTORY PATTERN--------------");
        new HardWorkVehicle().start();
        new SportVehicle().start();
        new UniversalVehicle().start();
        System.out.println("---------------END ABSTRACT FACTORY PATTERN--------------");

    }

}
