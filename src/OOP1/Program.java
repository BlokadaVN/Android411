package OOP1;

public class Program {
    public static void main(String[] args) {
//        Person p1 = new Person(); // Обращение к классу Person.
//        p1.name = "Irina";
//        p1.age = 28;
//        System.out.println(p1.name);
//        p1.displayInfo();
//
//        Person p2 = new Person("Валентин");
//        p2.displayInfo();

        Person p3 = new Person("Юля", 225);
//        p3.setName("Валерий");
//        p3.age = 20; // Работать не будет так как он вне зоны видимости (private).
//        System.out.println(p3.getName());
//        p3.setAge(28);
//        p3.setAge(248);
        p3.displayInfo();
    }
}

class Person {
    private String name;// в данном случае это не переменные, а свойства этого класса.
    private int age;

    {
        name = "неизвестно";   // Инициализатор.
        age = 18;
    }

    public Person() {    // это конструктор класса Person p1.
//        this("Неизвестно", 18);
    }

    public Person(String n) {    // это конструктор класса Person p2.
//        this(n, 18);
        this.name = n; // Имя попало из this.name = n; а возраст из инициализатора.
    }

    public Person(String name, int age) {    // это конструктор класса Person p3.
//        this.name = n;
//        this.age = a;
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 100)
            this.age = age;
    }

    void displayInfo() {  // А это уже метод.
        System.out.printf("Name: %s%nAge: %d%n", name, age);
    }
}