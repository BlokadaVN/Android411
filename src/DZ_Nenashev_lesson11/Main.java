package DZ_Nenashev_lesson11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int f;
        System.out.print("Нахождение площади фигур.\n1 - прямоугольник\t2 - треугольник\t3 - круг: ");
        f = input.nextInt();
        if (f < 1 || f > 3) {
            System.out.println("Неправильно введено число!");
        }
        if (f == 1) {
            int a, b;
            System.out.print("Основание: ");
            a = input.nextInt();
            System.out.print("Высота: ");
            b = input.nextInt();
            System.out.println("Площадь прямоугольника: " + rec(a, b));
        }
        if (f == 2) {
            trian();
        }
        if (f == 3) {
            double a;
            System.out.print("Введите радиус: ");
            a = input.nextInt();
            cir(a);
        }

    }

    public static int rec(int n1, int n2) {
        int sum;
        sum = n1 * n2;
        return sum;
    }

    public static void trian() {
        int a, b, sum;
        Scanner input = new Scanner(System.in);
        System.out.print("Основание: ");
        a = input.nextInt();
        System.out.print("Высота: ");
        b = input.nextInt();
        sum = (a * b) / 2;
        System.out.printf("Площадь треугольника: %.2f", (float) sum);
    }

    public static void cir(double c) {
        double s = (Math.pow(c, 2) * (Math.PI));
        System.out.printf("Площадь круга: %.2f", s);
    }
}
