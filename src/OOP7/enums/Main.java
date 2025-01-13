package OOP7.enums;

enum Seasons {

    WINTER("Зима"),
    SUMMER("Лето"),
    SPRING("Весна"),
    AUTUMN("Осень");

    private String title;


    Seasons(String title) {
        this.title = title;


    }

    @Override
    public String toString() {
        return "Seasons{" +
                "title='" + title + '\'' +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
////        System.out.println(Seasons.WINTER);
//        for (Seasons s : Seasons.values()) { // Для прохождения в цикле .values() проходит по каждому индексу.
//            System.out.println(s);
//        }

        for (Seasons s : Seasons.values()) {
            System.out.println(s);
        }

        for (Seasons s : Seasons.values()) {
            System.out.println(s.name());
        }

        int ind = Seasons.SUMMER.ordinal();
        System.out.println(ind);  // Индекс как в массиве константы в enum .ordinal


//        Seasons arg = Seasons.SPRING;
//
//        switch (arg) {
//
//            case WINTER:
//                System.out.println("Зима.");
//                break;
//
//            case SUMMER:
//                System.out.println("Лето.");
//                break;
//            case SPRING:
//                System.out.println("Весна.");
//                break;
//            case AUTUMN:
//                System.out.println("Осень.");
//                break;
//        }
    }
}
