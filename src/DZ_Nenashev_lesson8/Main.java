package DZ_Nenashev_lesson8;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b;
        System.out.print("Введите начало диапазона: ");
        a = input.nextInt();
        System.out.print("Введите конец диапазона: ");
        b = input.nextInt();
        if (a > b) {
            int temp = a;  // перемена значений a и b.
            a = b;
            b = temp;
        }
        int[] a1 = new int[b - a + 1];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = a++;
            System.out.print(a1[i] + " ");
        }
        System.out.println("\n" + Arrays.toString(a1));
    }
}



