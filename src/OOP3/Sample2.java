package OOP3;

public class Sample2 {
    public static void main(String[] args) {

        Dog d1 = new Dog("Шарик ");
        d1.run();

        Dog d2 = new Dog("Найда ");
        d2.run();
    }
}

class Dog {
    private String name;
    private Foot foot;

    public Dog(String name) {
        this.name = name;
        foot = new Foot();
    }

    void run() {
        foot.run();
    }

    class Foot {
        void run() {
            String name = "Барбос "; // Если оставить эту строку, то так как эта строка во вложенном методе и мы вызываем его во внешний метод foot.run(); то вызов в main ( Dog d1 = new Dog("Шарик "); d1.run();Dog d2 = new Dog("Найда "); d2.run(); ) работать не будут, так как передается sout из вложенного метода.

            System.out.println("Собака " + name + "бежит.");

            System.out.println("Собака " + Dog.this.name + "бежит."); // через Dog.this.name мы обращаемся опять к переменным и методам внешнего класса.
        }
    }
}