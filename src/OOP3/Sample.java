package OOP3;

public class Sample {
    public static void main(String[] args) {

        Outer out = new Outer("Внешний класс.");
        System.out.println(out.name);

        System.out.println(out.inner.innerName); // out - внешний класс. inner - вложенный класс. innerName - свойство вложенного класса.
//        Outer.Inner in = new Outer.Inner("Внутренний.") // Так обратиться к вложенному классу НЕЛЬЗЯ!

        System.out.println(Outer.Inner.age); // вызов статической ПЕРЕМЕННОЙ из вложенного класса Inner.
        Outer.Inner.info(); // вызов статического МЕТОДА из вложенного класса Inner.

        out.inner.func(); // вызов НЕ СТАТИЧЕСКОГО МЕТОДА.
    }
}

class Outer {
    String name;
    Inner inner;

    public Outer(String name) {
        this.name = name;
        inner = new Inner("Вложенный класс."); // Обращение к вложенному классу. С созданием переменной  Inner inner;
    }

    class Inner {
        static int age; // статические методы и переменные можно вызывать из вложенных классов - System.out.println(Outer.Inner.age);
        String innerName;

        static {
            age = 18; // Это инициализатор.
        }

        public Inner(String innerName) {
            this.innerName = innerName;
        }

        public static void info() {
            System.out.println("Статический метод."); // статический метод вызывается по имени класса.
        }

        public void func() {
            System.out.println("Метод во вложенном классе."); // не статический метод вызывается через экземпляр класса.
        }
    }
}