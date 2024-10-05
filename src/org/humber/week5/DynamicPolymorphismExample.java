package org.humber.week5;


class LivingBeing {

    public void sleep() {
        System.out.println("Living being sleeps");
    }

}

class Animal extends LivingBeing {

    public void sound() {
        System.out.println("Animal makes a sound");
    }

    public void eat() {
        System.out.println("Animal eats");
    }

}

class Dog extends Animal {

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    public void play() {
        System.out.println("Dog plays");
    }
}

class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("Cat eats");
    }
}

class Camel extends Animal {

    @Override
    public void sound() {
        System.out.println("Camel grunts");
    }

    @Override
    public void eat() {
        System.out.println("Camel eats");
    }
}


public class DynamicPolymorphismExample {



    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Camel camel = new Camel();
        displayDetails(animal);
        displayDetails(dog);
        displayDetails(cat);
        displayDetails(camel);
    }

    private static void displayDetails(Animal animal) {
        animal.sound();
        animal.eat();
        animal.sleep();
    }
}
