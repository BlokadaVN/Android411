package DZoop10_Nenashev;

interface Animal {
    StringBuilder animal();
}

public class AnonimClass {
    public static void main(String[] args) {

        System.out.println("Самое короткое слово: " + animal.animal());
    }


    static Animal animal = new Animal() {
        @Override
        public StringBuilder animal() {

            StringBuilder d = new StringBuilder("Герда");
            StringBuilder c = new StringBuilder("Том");

            System.out.println("Первое слово: " + d);
            System.out.println("Второе слово: " + c);

            if (d.length() > c.length()) {
                return c;
            } else {
                return d;
            }
        }
    };
}