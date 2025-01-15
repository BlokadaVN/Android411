package DZoop8_Nenashev;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество элементов числового массива: ");
        int n1 = input.nextInt();

        Integer num[] = new Integer[n1];
        for (int i = 0; i < num.length; i++) {
            System.out.print("-> ");
            num[i] = input.nextInt();
        }

        System.out.println();

        System.out.print("Введите количество элементов массива строк: ");
        int n2 = input.nextInt();

        String st[] = new String[n2];
        for (int i = 0; i < st.length; i++) {
            System.out.print("-> ");
            st[i] = input.next();
        }

        System.out.println();

        System.out.print("Массив: ");
        PrintArray.printArray(num);
        System.out.print("Массив: ");
        PrintArray.printArray(st);
    }

    class PrintArray {
        public static <T> void printArray(T[] inAr) {
            for (T element : inAr) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}