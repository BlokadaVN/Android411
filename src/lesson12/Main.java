package lesson12;

public class Main {
    public static void main(String[] args) {

//        // Как передать массив в метод!
//
//        int[] num1 = {3, 8, 9, 4, 1, 2, 5};
//        int[] num2 = {1, 2, 5};
//        System.out.println(max(num1));
//        System.out.println(max(num2));


        // Перегрузка методов (методы могут быть с одинаковым названием, но параметры могут отличаться)!


//        int a = 7;
//        int b = 3;
//        double c = 5.1;
//        double d = 7.2;
//        int res1 = min(a, b);        // где min - название метода
//        double res2 = min(c, d);
//        System.out.println(res1);
//        System.out.println(res2);


//        int num = 4;                   // вывод строки и цифры
//        String str = "2 * 2 = ";
//        print(str);
//        print(num);
//        print(str, num);


//        int a = 7;
//        int b = 3;
//        int c = 5;
//        int res1 = sum(a, b);
//        int res2 = sum(a, b, c);
//        System.out.println("Сумма двух чисел: " + res1);
//        System.out.println("Сумма трех чисел: " + res2);







    }

    public static int sum(int n1, int n2) {
        return n1 + n2;
    }

    public static int sum(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public static void print(String text) {
        System.out.print(text);
    }

    public static void print(int number) {
        System.out.println(number);
    }

    public static void print(String text, int number) {
        System.out.println(text + number);
    }

    public static int min(int n1, int n2) {
        int min;
        if (n1 > n2) {
            min = n2;
        } else {
            min = n1;
        }
        return min;
    }

    public static double min(double n1, double n2) {
        double min;
        if (n1 > n2) {
            min = n2;
        } else {
            min = n1;
        }
        return min;
    }

    public static int max(int[] mas) {            // где mas - придуманное название массива
        int ms = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (ms < mas[i]) {
                ms = mas[i];
            }
        }
        return ms;
    }
}
