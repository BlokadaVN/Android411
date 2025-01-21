package OOP8.exception.dog;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog(" Кира");
        dog.putCollar();
        dog.putLeash();
        dog.putMuzzle();

        try {
            dog.walk();
        } catch (DogIsNotReadyException e) {
            System.out.println(e.getMessage());
            System.out.println("\nПроверяем снаряжение!\nОшейник надет. " + dog.isCollarPutOn + "\nПоводок надет. " + dog.isLeashPutOn + "\nНамордник надет. " + dog.isMuzzlePutOn);
        }
    }
}
