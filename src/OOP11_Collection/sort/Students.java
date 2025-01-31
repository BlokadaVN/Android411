package OOP11_Collection.sort;

public class Students {
    public static void main(String[] args) {

        Person p1 = new Person("Иван", 27);
        Person p2 = new Person("Алена", 27);
        int res = p1.compareTo(p2);
        System.out.println(res);
        switch (res) {
            case -1:
                System.out.println(p2.getName() + " старше.");
                break;
            case 1:
                System.out.println(p1.getName() + " старше.");
                break;
            default:
                System.out.println("Эти люди одного возраста.");
        }
    }
}

// Лекция 31 2:35:00
class Person implements Comparable<Person> { // Comparable - интерфейс для сравнения двух объектов между собой по одному атрибуту.

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Person o) { // метод для сравнения двух объектов.
        if (this.age == o.age)
            return 0;
        else return this.age > o.age ? 1 : -1;
    }
}