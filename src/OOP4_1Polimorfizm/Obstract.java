package OOP4_1Polimorfizm;

public class Obstract {
    public static void main(String[] args) {

//        Dog dog = new Dog("Барбос");
//        dog.makeSound();
//        dog.sleep();
//
//        Cat cat = new Cat("Мурка");
//        cat.makeSound();
//        cat.sleep();

        Animal animal[] =new Animal[2];
        animal[0] = new Dog("Шарик");
        animal[1] = new Cat("Люська");

        for (Animal an:animal) {
            an.makeSound();
            an.sleep();
        }
    }
}

abstract class Animal {   // Абстрактный класс.
    private String name;

    public Animal(String name) { // Конструктор.
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sleep() {
        System.out.println(name + " спит.");
    }

    public abstract void makeSound();  // Абстрактный метод.
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " гавкает.");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " мяукает.");
    }
}