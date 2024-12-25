package OOP4;

public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal();
//        animal.voice(); // Вызов метода voice из класса Animal.

        Cat animal1 = new Cat();
//        Animal animal1 = new Cat("Мурзик");
        animal1.voice();
        animal1.voice("Мурзик ");


        Animal animal2 = new Dog();
        animal2.voice();
    }
}
