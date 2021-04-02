package com.company;

//В java нельзя создавать объект абстрактного класса
public abstract class Animal {
    // Animal -класс родитель для  Cat & Dog
    // если стоит public, то поле наследуется,
    // private - поле не наследуется
    // protecred -  поле неследуется и в классе -потомке становится public
    // defalt ( или не указан) поле наследуется, но только в рамках одного пакета
    public float size;
    public float weight;
    private String color;//  не наследуется
    protected String name;


    public abstract void say();
    // обязательно у абстрактного метода не должно быть тела ({})
    // абстрактный метод можно объявить только внутри абстрактного класса
    // в классах потомках  обязательно необходимо добавить реализацию (тело) для всех абстрактных методов
    // родительского класса

}
