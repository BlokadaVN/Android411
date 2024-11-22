package Num;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int num = 4321;
//        int a, b, c, d, res;
//        System.out.println("Исходное число: " + num);
//        a = num % 10;
//        System.out.println("переменная а:" + a);
//        num = num / 10;
//        System.out.println("num:" + num);
//        b = num % 10;
//        System.out.println("переменная b:" + b);
//        num = num / 10;
//        System.out.println("num: " + num);
//        c = num % 10;
//        System.out.println("переменная с: " + c);
//        num = num / 10;
//        System.out.println("num: " + num);
//        d = num % 10;
//        System.out.println("переменная d: " + d);
//        res = a * 1000 + b * 100 + c * 10 + num;
//        System.out.println(res);

//        int a =5; ;
//        byte b = (byte) a;
//        System.out.println(b);
//        int a, b, c;
//        a = 5;
//        b = 3;
//        c = 7;
//        System.out.println("Сумма: "+ (a+b+c));
//        System.out.println("Произведение: " + (a*b*c));
//        System.out.println("Среднее число: " + (float)(a+b+c)/3);

//        Scanner input = new Scanner(System.in);
//        System.out.println("Ведите 4 числа: ");
//        System.out.print("1:");
//        int num1 = input.nextInt();
//        System.out.print("2:");
//        int num2 = input.nextInt();
//        System.out.print("3:");
//        int num3 = input.nextInt();
//        System.out.print("4:");
//        int num4 = input.nextInt();
//        System.out.printf("Результат : %.2f ", (float) (num1 + num2) / (num3 + num4));
//        input.close();
        Scanner input = new Scanner(System.in);
        System.out.print("Введите пятизначное число: ");
        int a, b, c, d, e;
        int num = input.nextInt();
        a = num % 10;
        num = num / 10;
        b = num % 10;
        num = num / 10;
        c = num % 10;
        num = num / 10;
        d = num % 10;
        num = num / 10;
        e = num % 10;
        num = num / 10;

        System.out.println("Введенное число: " + e + d + c + b + a);

        System.out.println("Произведение цифр числа: " + (a * b * c * d * e));
        System.out.printf("Среднее арифметическое числа: %.1f", (float) (a + b + c + d + e) / 5);
    }
}
