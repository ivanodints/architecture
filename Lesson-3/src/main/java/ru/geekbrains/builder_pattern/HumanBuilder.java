package ru.geekbrains.builder_pattern;

public class HumanBuilder implements Builder {
    Human human = new Human();

    @Override
    public Builder setSex(String sex) {
        human.sex = sex;
        return this;
    }

    @Override
    public Builder setName(String name) {
        human.name = name;
        return this;
    }

    @Override
    public Builder setAge(int age) {
        human.age = age;
        return this;
    }

    @Override
    public Builder setWeight(int weight) {
        human.weight = weight;
        return this;
    }

    @Override
    public Human build() {
        return human;
    }

}
