package ru.geekbrains.builder_pattern;

public class BuilderPatterMain {
    public static void main(String[] args) {
        startBuilderPatter();
    }
    public static void startBuilderPatter(){
        System.out.println("---------------START BUILDER PATTERN--------------");
        Human human = new HumanBuilder()
                .setSex("female")
                .setName("Alice")
                .setWeight(56)
                .setAge(27)
                .build();
        human.info();
        System.out.println("---------------END BUILDER PATTERN--------------");
    }
}
