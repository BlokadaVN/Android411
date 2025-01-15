package DZoop7_Nenashev;

public class Main {
    public static void main(String[] args) {

        System.out.println("Скорость " + Speed.AIRPLANE + " составляет " + Speed.AIRPLANE.getS() + " миль в час.");
        System.out.println();
        System.out.println("Скорости транспортных средств:");

        for (Speed s1 : Speed.values()) {
            System.out.println(s1 + " типичная скорость составляет " + s1.getS() + " миль в час.");
        }
    }
}
