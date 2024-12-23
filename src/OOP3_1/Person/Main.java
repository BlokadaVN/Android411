package OOP3_1.Person;

public class Main {
    public static void main(String[] args) {
        Human human = new Human(16, "Даши", "Батодалаев");
        System.out.println(human);

        Student student = new Student(32, "Линар", "Загидулин", "Математика", "MM_220", 90, 95);
        System.out.println(student);

        Teacher teacher = new Teacher(42, "Алена", "Петрова", "Экономика", 95);
        System.out.println(teacher);
    }
}
