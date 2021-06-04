package ru.geekbrains;

import ru.geekbrains.abstract_factory_pattern.AbstractFactoryMain;
import ru.geekbrains.builder_pattern.BuilderPatterMain;
import ru.geekbrains.factory_method_pattern.FactoryMethodMain;

public class Main {
    public static void main(String[] args) {

        new AbstractFactoryMain().starAbstractFactoryPattern();
        new FactoryMethodMain().startFactoryMethod();
        new BuilderPatterMain().startBuilderPatter();

    }
}
