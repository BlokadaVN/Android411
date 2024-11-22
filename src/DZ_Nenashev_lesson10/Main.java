package DZ_Nenashev_lesson10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c, r, num;
        float p, s;
        System.out.print("Вычисление площади фигур.\nВыбор фигуры:\n1 - треугольник\n2 - прямоугольник\n3 - круг\n:");
        num = input.nextInt();

        for (int i = num; i <= 3; i++) {
            if (i == 1) {
                System.out.print("Введите сторону a: ");
                a = input.nextInt();
                System.out.print("Введите сторону b: ");
                b = input.nextInt();
                System.out.print("Введите сторону c: ");
                c = input.nextInt();
                p = (float) (a + b + c) / 2;
                s = p * (p - a) * (p - b) * (p - c);
                System.out.printf("%.2f", Math.sqrt(s));
            }
            if (i == 2) {
                System.out.print("Введите сторону a: ");
                a = input.nextInt();
                System.out.print("Введите сторону b: ");
                b = input.nextInt();
                s = a * b;
                System.out.println((int) s);
            }
            if (i == 3) {
                System.out.print("Введите радиус: ");
                r = input.nextInt();
                System.out.printf("%.1f", (Math.pow(r, 2) * (Math.PI)));
            }
        }
        if (num > 3 || num < 1) {
            System.out.println("Введено не правильное число.");
        }
    }
}
