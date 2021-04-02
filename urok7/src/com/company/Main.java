package com.company;

public class Main {

    public static void main(String[] args) {
        // Наследование и полиморфизм
        Cat cat = new Cat();
        Dog dog = new Dog ();
        cat.size = 122;
        cat.weight = 64;
        cat.say();
        cat.name = "Tom";


        dog.size = 12;
        dog.weight = 28;
        dog.say();
        dog.name = "Bim";
        dog.age = 3;

        //явное преобразование объекта dog  в объкт типа Animal.
        Animal a = dog;
        a.name = "bobik";
        System.out.println(dog.name);
        // вызов метода посчитать средний вес животных
        float res =avgWeight(dog,cat);
        System.out.println(res);

        //побитовые операции
        // побитовые операторы:
        //& - битовый "И"
        // | - битовоый "ИЛИ"
        // << - побитовый сдвиг влево
        // >> - побитовый сдвиг вправо
        // побитовые операции возможны только целых чисел
        System.out.println(3 & 13);// = 1
        System.out.println(3 | 13);// = 15
        int v =349;
        System.out.println(v >> 2);// = 87
        System.out.println(v << 3);// = 2792


    }
    // посчитать средний вес всех животных
    public static float avgWeight(Animal ...animals){
        float w= 0;
        for (Animal a : animals){
            w += a.weight;

        }
        return w / animals.length;

    }
}
