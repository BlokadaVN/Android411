package DZoop1_Nenashev;

public class Main {
    public static void main(String[] args) {

        // Здравствуйте! Надеюсь я правильно понял задание и выполнил его.

        Auto a = new Auto("X7 M50i", 2021, "BMV", "530 л.с.", "blue", 15005000);

        a.printInfo();
        a.setColor("white");
        a.setPrice(10790000);
        System.out.println(a.getColor() + " " + a.getPrice());
    }
}
