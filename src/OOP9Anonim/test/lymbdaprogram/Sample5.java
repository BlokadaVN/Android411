package OOP9Anonim.test.lymbdaprogram;

import java.util.ArrayList;
import java.util.Arrays;

interface Bias {
    boolean test(Person p);
}

enum PetPreference {
    DOG, CAT, SNAKE;
}

public class Sample5 {
    public static void main(String[] args) {

        Person p1 = new Person("Роман", 35, true, PetPreference.CAT, new ArrayList<>(Arrays.asList("рыбалка", "мотоциклы")));
        Person p2 = new Person("Анна", 35, false, PetPreference.SNAKE, new ArrayList<>(Arrays.asList("туризм", "вязание")));
        Person p3 = new Person("Вадим", 16, true, PetPreference.DOG, new ArrayList<>(Arrays.asList("компьютер", "футбол")));
        Person p4 = new Person("Глеб", 25, true, PetPreference.DOG, new ArrayList<>(Arrays.asList("пиво", "рыба", "водка")));
        Person p5 = new Person("Инга", 20, false, PetPreference.CAT, new ArrayList<>(Arrays.asList("чтение", "кино", "вышивание")));

        ArrayList<Person> people = new ArrayList<>(Arrays.asList(p1, p2, p3, p4, p5));
        System.out.println(people + "\n");

        System.out.println(filter(people, p -> p.isExtravert()) + "\n");
        System.out.println(filter(people, p -> p.getPetPreference() == PetPreference.SNAKE ? true : false));
    }

    public static ArrayList<Person> filter(ArrayList<Person> people, Bias bias) {
        ArrayList<Person> filterPeople = new ArrayList<>();
        for (Person pr : people) {
            if (bias.test(pr))
                filterPeople.add(pr);
        }
        return filterPeople;
    }
}

class Person {
    private String name;
    private int age;
    private boolean extravert;
    private PetPreference petPreference;
    private ArrayList<String> hobbies;

    public Person(String name, int age, boolean extravert, PetPreference petPreference, ArrayList<String> hobbies) {
        this.name = name;
        this.age = age;
        this.extravert = extravert;
        this.petPreference = petPreference;
        this.hobbies = hobbies;
    }

    public boolean isExtravert() { // Геттер для булевых переменных начинается с is.
        return extravert;
    }

    public PetPreference getPetPreference() {
        return petPreference;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", extravert=" + extravert +
                ", petPreference=" + petPreference +
                ", hobbies=" + hobbies +
                '}';
    }
}