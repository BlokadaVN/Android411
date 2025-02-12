package OOP11_Collection.cities;

public class Main {
    public static void main(String[] args) {
        SetCity cities = new SetCity();
        cities.addCity("Москва", 495);
        cities.addCity("Санкт - Петербург", 812);
        cities.addCity("Омск", 183);
        cities.addCity("Томск", 712);
        cities.addCity("Пенза", 312);
        cities.addCity("Новосибирск", 955);
        cities.addCity("Новгород", 554);

        System.out.println("Общее кол-во городов: " + cities.size() + "\n");
        System.out.println(cities);
        System.out.println("*******************************");
        cities.removeCity(0, 5);
        System.out.println("Общее кол-во городов: " + cities.size() + "\n");
        System.out.println(cities);
        System.out.println("*******************************");
        System.out.println("Печать городов в порядке убывания:");
        cities.printReversCity();
    }
}
