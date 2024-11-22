package lesson13;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Menu {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int size;
        System.out.print("Введите размер массива: ");
        size = input.nextInt();
        int[] list = new int[size];

        int option;
        do {
            System.out.println("\nМеню:");
            System.out.println("1 - ввод элементов массива: ");
            System.out.println("2 - отображение массива: ");
            System.out.println("3 - поиск элементов в массиве: ");
            System.out.println("4 - сортировка массива: ");
            System.out.println("5 - выход.");
            System.out.print("Сделайте свой выбор: ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    inputArray(list);
                    break;
                case 2:
                    displayArray(list);
                    break;
                case 3:
                    System.out.println("Введите номер элемента: ");
                    int item = input.nextInt();
                    int index = searchArray(list, item);
                    if (index == -1) {
                        System.out.print("Элемент не найден!\n");
                    } else {
                        System.out.print("Элемент найден " + (index + 1) + "\n");
                    }
                    break;
                case 4:
                    System.out.println("Отсортированный массив");
                    sortArray(list);
                    displayArray(list);
                    break;
            }
        } while (option != 5);
    }

    static public void inputArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("-> ");
            array[i] = input.nextInt();
        }
    }

    static public void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static public int searchArray(int[] array, int data) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == data) {
                return i;
            }
        }
        return -1;
    }

    public static void sortArray(int[] array) {            // пузырьковый способ сортировки массива
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];   // перемена чисел местами в массиве
                    array[j + 1] = temp;
                }
            }
        }
    }
}
