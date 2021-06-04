package ru.geekbrains.builder_pattern;

public class Human {
    String sex;
    String name;
    int age;
    int weight;

    public void info () {
        System.out.println("Sex: " + sex + "\nName: " + name + "\nAge: " + age + "\nWeight: " + weight);
    }
}
