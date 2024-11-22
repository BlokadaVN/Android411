package lesson11;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Создание и вызов методов.

//        symbolDraw(9, '+', '-');
//        symbolDraw(7, 'X', '0');

//        int a = 30;
//        int b = 45;
//        System.out.println("Перед вызовом метода:\na = " + a + "\nb = " + b);
//        swapFunc(a, b);
//        System.out.println("После вызова метода:\na = " + a + "\nb = " + b);

//        int a = 11;
//        int b = 6;
//        int c = min(a, b);
//        System.out.println("Минимальное значение: " + c);


//        int a, b;
//        System.out.print("a = ");
//        a = input.nextInt();
//        System.out.print("b = ");
//        b = input.nextInt();
//        sum(a,b);


        // вызов метода в цикле куб числа

//        for (int i = 1; i < 11; i++) {
//            System.out.println(i + " в кубе = " + cub(i));
//        }


        // треугольник из чисел в методе

//        int n = 5;
//        for (int i = 0; i <= n; i++) {
//            printLine(1, i);
//        }
//        for (int i = n - 1; i > 0; i--) {
//            printLine(1, i);
//        }


//        sum1(1, 2, 3);
//        sum1(1, 2, 3, 4, 5);
//        sum1();


//        sum_str("Сумма двух чисел: ", 20, 10);
//        sum_str("Сумма трех чисел: ", 20, 10, 3);
//        sum_str("Сумма: ");


//        findName(2, 7, 0, 3, 1, 5, -13);
//        findName(2, 7, 0, 3, 1, 5, -13, 13);
//        findName(26);
//        findName(99, 99, 100, 34, -39);
//        findName(99, 39, 99, 100, 34);
//        int a;


//        System.out.println(ch(1, 2, 3, 4, 5, 6, 7, 8, 9));
//        System.out.println(ch(3, 6, 1, 9, 5));
    }

    public static ArrayList ch(int... args) {          // находим среднее арифметическое
        ArrayList<Integer> mas = new ArrayList<>();
        float sum = 0;
        int count = 0;
        float average;
        for (int i : args) {
            sum += i;   // сумма всех чисел
            count++;    // кол-во чисел
        }
        average = sum / count;
        System.out.print("Среднее арифметическое: " + average);
        System.out.println();
        for (int i : args) {
            if (i < average) {
                mas.add(i);
            }
        }
        return mas;
    }

    public static void findName(int... num) {
        int a = 0;
//        for (int j : num) {
//            if (j % 13 == 0 && j > 0 && a < j) {  // фор ич
//                a = j;
//            }
//        }

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 13 == 0 && num[i] > 0 && a < num[i]) {    // фор
                a = num[i];
            }
        }
        System.out.print(a == 0 ? "Число не найдено. " : a);
        System.out.println();
    }

    public static void sum_str(String message, int... num) {
        int res = 0;
        for (int i = 0; i < num.length; i++) {
            res += num[i];
        }
        System.out.print(message);
        System.out.println(res);
    }

    public static void sum1(int... num) {            // int...num это что бы передавать несколько параметров сразу
        int res = 0;
//        for (int n : num)
//            res += n;
        for (int i = 0; i < num.length; i++) {
            res += num[i];
        }
        System.out.println(res);
    }

    public static void printLine(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int cub(int a) {
        return a * a * a;
    }

    public static void sum(int a, int b) {
//        int d;
//        if (a > b) {
//            d = a - b; // это то что делал я, ниже код короче и правильнее.
//        } else {
//            d = a + b;
//        }
        System.out.println("Результат: " + (a > b ? a - b : a + b));
    }

    public static int min(int n1, int n2) {
        int minCh;
        if (n1 > n2) {
            minCh = n2;
        } else {
            minCh = n1;
        }
        System.out.println("Hello!");
        return minCh;
    }

    public static void swapFunc(int a, int b) {
        System.out.println("До замены :\na = " + a + "\nb = " + b);
        int c = a;
        a = b;
        b = c;
        System.out.println("После замены :\na = " + a + "\nb = " + b);
    }

    public static void symbolDraw(int count, char a, char b) {
//        System.out.println(count);
//        System.out.println(a);
//        System.out.println(b);

        for (int i = 0; i < count; i++) {
            if (i % 2 == 0)
                System.out.print(a);
            else
                System.out.print(b);
        }
        System.out.println();
    }
}
