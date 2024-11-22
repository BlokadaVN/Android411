package lesson12;

import java.util.Scanner;

public class Recursia {
    public static void main(String[] args) {
        // Рекурсия - это функция, которая вызывает сама себя.

        Scanner input = new Scanner(System.in);

        System.out.print("На каком вы этаже: ");
        int n1 = input.nextInt();
        elevator(n1);
    }

    public static void elevator(int n) {
        if (n == 0) {
            System.out.println("Вы в подвале.");
            return;
        }
        System.out.println("-> " + n);
        elevator(n - 1);
        System.out.print(n + " ");
    }
}
