package OOP3_1.Person;

public class Main {
    public static void main(String[] args) {
        Human human = new Human(16, "Даши", "Батодалаев");
        System.out.println(human);


        Student student1 = new Student(human, "Физика", "A - 23", 0, 0);
        System.out.println(student1);

        Teacher teacher = new Teacher(42, "Алена", "Петрова", "Экономика", 95);
        System.out.println(teacher);

        Graduate graduate = new Graduate(25, "Сергей", "Шугари", "Сети", "DS_11", 80, 20, "Защита персональных данных");
        System.out.println(graduate);

        Student student = new Student(32, "Линар", "Загидулин", "Математика", "MM_220", 90, 95);
        System.out.println(student);

        Graduate graduate1 = new Graduate(student,"Математические вычисления");
        System.out.println(graduate1);

Specialist specialist = new Specialist(graduate,5);
        System.out.println(specialist);
    }
}
