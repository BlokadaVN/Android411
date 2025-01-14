package OOP3_1.Person;

public class Human {
    private String lastName;
    private String firstName;
    private int age;

    public Human(int age, String firstName, String lastName) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Human Constructor\t" + Integer.toHexString(hashCode())); // шестнадцатеричное представление хеш - кода объекта.
    }

    // Конструктор копирования.

    public Human(Human other) {
        this.age = other.age;
        this.firstName = other.firstName;
        this.lastName = other.lastName;
        System.out.println("Human CopyConstructor\t" + Integer.toHexString(hashCode()));
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", age=" + age +
                '}';
    }
}
