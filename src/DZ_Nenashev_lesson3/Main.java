package DZ_Nenashev_lesson3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
