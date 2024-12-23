package OOP3;

public class Main {
    public static void main(String[] args) {

        Calculation obj = new Calculation();

        // 1. Перегрузка методов по количеству параметров.
        obj.calculate(1, 2); // obj - обращение к ЭКЗЕМПЛЯРУ КЛАССА! calculate - МЕТОД!
        obj.calculate(1, 2, 3);

        // 2. Перегрузка по типу параметров.
        obj.calculate(2.5, 3.4);

        // 3. По порядку указания параметров.
        obj.calculate(2.5, 3);
        obj.calculate(2, 2.5);
    }
}

class Calculation {
    public void calculate(int a, int b) {
        System.out.println("Сумма двух целых чисел: " + (a + b)); // 1
    }

    public void calculate(int a, int b, int c) {
        System.out.println("Сумма трех целых чисел: " + (a + b + c)); // 1
    }

    public void calculate(double a, double b) {
        System.out.println("Сумма двух дробных чисел: " + (a + b)); // 2
    }

    public void calculate(double a, int b) {
        System.out.println("Сумма двух смешенных чисел: " + (a + b)); // 3
    }

    public void calculate(int a, double b) {
        System.out.println("В результате целое число: " + (int) (a + b)); // 3
    }
}