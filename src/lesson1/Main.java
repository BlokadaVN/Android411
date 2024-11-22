package lesson1;

public class Main {
    public static void main(String[] args) {
//       System.out.println("Hello world!");
//        System.out.println();
//        System.out.println("Привет");
//        System.out.print("Hello");
//        System.out.print("World");
//  int a;  // объявление переменной
//  a = 10; // присвоение значения
//        System.out.println(a);
//        int b = 20; // инициализация переменной
//        System.out.println(b);
//        int c,d;
//        c = 5;
//        d = 6;
//        System.out.println(c + d);
//        System.out.println(c);
//        System.out.println(d);
//        int a =10;
//       System.out.println(a);
//       a = 20;
//        System.out.println(a);
//        final int WEEK;
//        WEEK =7;
//        System.out.println(WEEK);
//        boolean flag = true;
//        System.out.println(flag);
//        char ch = '*';
//        System.out.println(ch);
//        char ch1 = 64;
//        System.out.println(ch1);
//        System.out.println(Character.SIZE);
//        System.out.println(Character.BYTES);*/
//      byte a = 127;
//        System.out.println(a);
//        System.out.println("Переменная типа int занимает " + Integer.BYTES + " Байта памяти (" + Integer.SIZE + " бит памяти)," + " и принимает значения в диапазоне от " + Integer.MIN_VALUE + " до " + Integer.MAX_VALUE);
//
//                                                   УРОК 2
//
//  long a = 5;
//        float a = 8.5f;
//  double b = 8.5;
//        System.out.println(a);
//        System.out.println(b);
//        int a = 1;
//        int b = 2;
//        int c ;
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//        c = a; // c = 1
//        a = b; // a = 2
//        b = c; // b = 1

//        a = a + b; // a = 1 + 2 = 3
//        b = a - b; // b =
//        System.out.println("a = " + a);
//      System.out.println("b = " + b);
//        int a = 512;
//        System.out.println(a);
//        System.out.println();
//        int num16 = 0x12; // шестнадцатеричная система исчисления
//        int num8 = 022; // восмеричная система исчисления
//        int num2 = 0b10010; // двоичная  система исчисления
//        System.out.println(num16);
//        System.out.println(num8);
//        System.out.println(num2);
//        num8 = num16 + num2;
//        System.out.println(num8);

//        int x = 123_456;
//        int y = 567_123__456;
//        double z = 234_567.789__102;
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(z);

//        double d1 = 0.512;
//        double d2 = .512;
//        double d3 = 512.;
//        float f1 = 0.512f;
//        System.out.println(d1);
//        System.out.println(d2);
//        System.out.println(d3);
//        System.out.println(f1);
//        char ch1 = '+';
//        char ch2 = 43;
//        System.out.println("ch1");
//        System.out.println("ch2");
//
//        System.out.println(((Object)'+').getClass().getSimpleName()); // определить тип данных

//        String text = "H e l lo world!" ;
//        System.out.println(text);
//        System.out.println("Hello world!".getClass().getSimpleName());
//
//        String text1 = """
//                Привет
//                       Мир!!!
//                """;
//        System.out.println( text1); // текст в тройных ковычках можно пробелом редактировать


//        var $_number_1$ = '+'; // var - ПопАп подсказка какой тип данных (навести на $_number_1$)
//        int numberOne = 5;
//        System.out.println(numberOne);
//        System.out.println($_number_1$); // пример вывода переменной, допустимые знаки

//
//        System.out.println("Hello \nworld!");   // \n  - это перенос
//        System.out.println("Hello \n\"world!\"");   // \ - вывод текста в кавычках "" (смотри пример)
//        System.out.println( "путь к катологу c:\\folder\\file.txt"); // чтоб отразить путь к папке например, приминяем обратный слеш - \
//      System.out.println( "\tпуть к катологу c:\\folder\\file.txt"); //  \t - табуляция

//        System.out.print("2 + 2 = 5");
//        System.out.print("\b"); // \b - удаляет один символ (5)
//        System.out.print("4");

//        System.out.print("Hello world");
//        System.out.print("\r"); // затирает все значения в строке ( System.out.print)
//        System.out.print("Hello ");
//
//        System.out.print("5 +3 = ");
//        System.out.println(5 + 3);
//
//        double a = 5;
//        int b = 3;
//        System.out.printf("a = %f; b =%d", a, b); // %d - это используется для целночисленных значений. %f - для дробных чисел %с - для char %s - для string
//

//String name = "Ирина";
//int age = 25;
//float height = 1.7f;
//        System.out.printf("Меня зовут %s. Мне %d лет. Мой рост %.1f%n", name, age,height); // %n - перенос на другую строку (ТОЛЬКО В printf) %f - %1f  - 1 (один) это количество символов после точки
//        System.out.printf("%8d%n", 123); // %8 - отступ _____123, где _____ и 123 в общей сумме 8
//        System.out.printf("%4d%5d%n", 123, 456); // %4   _123, %5 __456
//        System.out.printf("%4d%n", 123456789); //  если число вывода больше чем в % будет игнорировать
//        System.out.printf("%6.2f%n", 123.56); //
//        System.out.printf("%-6s%5d%n","number =", 123); // если перед цифрой стоит минус, то будет выравнивание влево
//
//        String f = "Floating";
//        String i = "Integral";
//        System.out.printf("--------------------------------%n");
//        System.out.printf("      JAVA PRIMITIVE TYPES%n");
//        System.out.printf("--------------------------------%n");
//        System.out.printf("| %-10s | %-8s | %4s |%n", "CATEGORY", "NAME", "BITS");
//        System.out.printf("--------------------------------%n");
//        System.out.printf("| %-10s | %-8s | %04d |%n", f, "double", 64);
//        System.out.printf("--------------------------------%n");
//        System.out.printf("| %-10s | %-8s | %04d |%n", f, "float", 32);
//        System.out.printf("--------------------------------%n");
//        System.out.printf("| %-10s | %-8s | %04d |%n", i, "long", 64);
//        System.out.printf("--------------------------------%n");
//        System.out.printf("| %-10s | %-8s | %04d |%n", i, "short", 16);
//        System.out.printf("--------------------------------%n");
//        System.out.printf("| %-10s | %-8s | %04d |%n", i, "byte", 8);
//        System.out.printf("--------------------------------%n");
//        System.out.printf("| %-10s | %-8s | %04d |%n", i, "char", 16);
//        System.out.printf("--------------------------------%n");
//        System.out.printf("| %-10s | %-8s | %04d |%n", "boolean", "boolean", 1);
//        System.out.printf("--------------------------------%n");


//                                  УРОК 3

//        System.out.println("сумма: " + (5 + 2));
//        System.out.println("разности: " + 5 - 2); // ошибка, потому что минус не в скобках
//        System.out.println( " Произведение" + 5 * 2);
//        System.out.println( " частное" + 5 / 2);
//        System.out.println( " частное" + 5 / 2.);  дробное деление
//
//        int a = 5;
//        int b = 2;
//        double c;
//        c = a / b;
//        System.out.println(c);

//        System.out.println( 5 % 2); // остаток от деления

//        int num = 4321;
//        int a,b,c,d,res;
//        System.out.println( "Исходное число:" + num);
//        a = num % 10;
//        System.out.println("переменная а:" + a);
//        num = num / 10;
//        System.out.println( "num:" + num);
//        b = num % 10;
//        System.out.println("переменная b:" + b);
//        num = num / 10;
//        System.out.println("переменная c:" + c);
//        num = num / 10;
//        System.out.println("переменная d:" + d);
//
//        res = a * 10 + b;

        // унарные операторы

        // ++ (инкремент) -- (декремент)

        // префиксная форма ++а
        // постфиксная форма а++
//        int a = 8;
//        a++;
//        System.out.println(a);
//
//        int b = 8;
//        ++b;
//        System.out.println(b);

//        int a = 8;
//        int b = a++;
//        System.out.println(a); // 9
//        System.out.println(b); //8

//        int a = 8;
//        int b = ++a;
//        System.out.println(a); // 9
//        System.out.println(b); // 9

//        int a = 1;
//        int b = 1;
//        int c = a++ + 3; // c = 4
//        int d = ++b + 3; // d = 5
//        System.out.println(a); // 2
//        System.out.println(b); // 2
//        System.out.println(c); // 4
//        System.out.println(d); // 5

//        int a = 2;
//        int b = a++;
//        int c = b +3 +a;
//        System.out.println(c);


//        int a = 2;
//        int b = ++a;
//        int c = b +3 +a;
//        System.out.println(c);

//        int a = 1;
//        int b = 2;
//        int c = a + 5 * ++b;
//        System.out.println(c);
//
//        int a = 1;
//        int b = 2;
//        int c = (a + 5) * ++b;
//        System.out.println(c);
//
//        int a = 1;
//        int b = 2;
//        int c = (a + 5) * b++;
//        System.out.println(c);

        // преобразование базовых типов данных

//        int x =5;
//        byte y =(byte)x;
//        System.out.println(y);

//        byte x =5;
//        int y = x;
//        System.out.println(y);

//        int x= 1651651;
//        float y =x;
//        System.out.println(y);
//
//        int x =  258;
//        byte y =(byte) x;
//        System.out.println(y);

//        long x =5;
//        int y = (int) x;
//        System.out.println(y);

//        double x = 18.9845;
//        int y = (int) x;
//        System.out.println(y); // результат 18

//        double x = 18.9845;
//        int y = (int)Math.round(x) ; // Math - уровнять дробное число
//        System.out.println(y); // результат 19


//
//        int a = 5;
//        double b = 4.7;
//        double c = a + b;
//        System.out.println(c);

//        int d = 'a' +3;
//        System.out.println(d);


    }


}
