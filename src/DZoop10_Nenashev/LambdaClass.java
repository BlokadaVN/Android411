package DZoop10_Nenashev;

interface Animal1 {
    StringBuilder animal1();
}

class LambdaClass {
    public static void main(String[] args) {

        System.out.println("Самое короткое слово: " + animal.animal1());
    }

    static Animal1 animal = () -> {

        StringBuilder d = new StringBuilder("Герда");
        StringBuilder c = new StringBuilder("Том");

        System.out.println("Первое слово: " + d);
        System.out.println("Второе слово: " + c);

        if (d.length() > c.length()) {
            return c;
        } else {
            return d;
        }
    };
}

