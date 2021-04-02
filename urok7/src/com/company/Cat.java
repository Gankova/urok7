package com.company;
// наследование java происходит с помощью ключевого слова extends
// класс в  java может наследовать только один родительский класс

public class Cat extends Animal{
    // переопределение метода say класса  Animal
    @Override
    public void say() {
        System.out.println("meow");
    }
}

