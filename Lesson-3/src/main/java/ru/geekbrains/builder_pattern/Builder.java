package ru.geekbrains.builder_pattern;

public interface Builder {
    Builder setSex (String sex);
    Builder setName (String name);
    Builder setAge (int age);
    Builder setWeight (int weight);


    Human build();
}
