package OOP10Lambda;

interface HumanFactory<P extends Human> {
    P create(String firstName, String lastName);
}

public class LambdaConstruktor {
    public static void main(String[] args) {

        HumanFactory<Human> humanHumanFactory = Human::new;
        Human human = humanHumanFactory.create("Иван","Петров");
        System.out.println(human);
    }
}

class Human {
    String firstName;
    String lastName;

    public Human(String firstName, String lastName) {  // Обычный конструктор.
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}