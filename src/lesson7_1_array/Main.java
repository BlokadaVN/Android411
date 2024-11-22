package lesson7_1_array;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//   Массивы!
//        int mas[] = new int[4];
//        int[] mas2 = new int[5];   // можно объявлять массив так.

//        int mas3[];
//        mas3 = new int[4];         // можно объявлять массив так.

//        int mas[] = new int[]{2, 7, 5, 3};
//        int mas[] = {2, 7, 5, 3};


//        int mas[] = new int[4];
//        mas[0] = 5;
//        mas[1] = 5 + 7;
//        mas[2] = mas[0] + mas[1];
//        mas[3] = 5 / 2;
//
//        for (int i = 0; i < mas.length; i++) {
//            System.out.println(mas[i]);
//        }


//        System.out.println(mas[0]);
//        System.out.println(mas[1]);
//        System.out.println(mas[2]);
//        System.out.println(mas[3]);
//        System.out.println("Длинна массива: " + mas.length); // длинна массива

//        int last = mas[mas.length -1]; // найти ПОСЛЕДНЮЮ ячейку массива!!!
//        System.out.println(last);

//        int n = 10;
////        int[] mas = new int[n * 2 + 3]; // можно добавлять значения
//        int[] mas = new int[n];
//        System.out.println(mas.length);
//        mas[n - 1] = 2; // mas[9] = 2
//        mas[n - 2] = 3; // mas[8] = 3
//        mas[1] = 6;
//        mas[n / 5] = mas[n - 1] + mas[n - 2]; // mas[2] = mas[9] + mas[8] =>5
//        for (int i = 0; i < mas.length; i++) {
//            System.out.print(mas[i] + " ");
//        }


//        int[] array = new int[4];
//        System.out.print("-> ");
//        array[0] = input.nextInt();
//        System.out.print("-> ");
//        array[1] = input.nextInt();
//        System.out.print("-> ");
//        array[2] = input.nextInt();
//        System.out.print("-> ");
//        array[3] = input.nextInt();

//
//        int[] array = new int[4];
//        for (int i = 0; i < array.length; i++) {
//            System.out.print("-> ");
//            array[i] = input.nextInt();
//
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }


//        int n;
//        System.out.print("Количество элементов массива: ");
//        n = input.nextInt();
//        int[] array;
//        if (n < 5) {
//            array = new int[n];
//            for (int i = 0; i < array.length; i++) {
//                System.out.print("-> ");
//                array[i] = input.nextInt();
//            }
//        } else {
//            array = new int[n];
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }


        // Массив в обратном порядке.

//        int[] array = new int[4];
//        for (int i = 0; i < array.length; i++) {
//            System.out.print("-> ");
//            array[i] = input.nextInt();
//        }
//        for (int i = array.length - 1; i >= 0; i--) {
//            System.out.print(array[i] + " ");
//        }

        // вывод значения массива через библиотеку import java.util.Arrays;

//        int[] array = {1,2,3,4,5};
//        System.out.println(Arrays.toString(array));


        // Вывести сумму отрицательных чисел из массива

//        int n, sum = 0;
//        System.out.print("n -> ");
//        n = input.nextInt();
//        int[] array = new int[n];
//        for (int i = 0; i < array.length; i++) {
//            System.out.print("-> ");
//            array[i] = input.nextInt();
//
//        }
//        System.out.println(Arrays.toString(array));
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] < 0) {
//                sum += array[i];
//            }
//        }
//        System.out.println("Сумма отрицательных чисел массива: " + sum);


//        int min;
//        int[] array = new int[5];
//        for (int i = 0; i < array.length; i++) {
//            System.out.print("-> ");
//            array[i] = input.nextInt();
//        }
//        System.out.println(Arrays.toString(array));
//        min = array[0];
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] < min) {
//                min = array[i];
//            }
//        }
//        System.out.println("Минимальное число в массиве: " + min);


        // Вывести элемент массива, если он больше чем предыдущее число в массиве

//        int n, count;
//        System.out.print("Введите элементы массива:\nn-> ");
//        n = input.nextInt();
//        int[] array = new int[n];
//        for (int i = 0; i < array.length; i++) {
//            System.out.print("-> ");
//            array[i] = input.nextInt();
//        }
//        System.out.println(Arrays.toString(array) + "\n");
//        for (int i = 0; i < array.length - 1; i++) {  // вариант 1.
//            if (array[i] < array[i + 1]) {
//                count = array[i + 1];
//                System.out.print(count + " ");
//            }

//        for (int i = 1; i < array.length; i++) {   // вариант 2
//            if (array[i] > array[i - 1]) {
//                count = array[i - 1];
//                System.out.print(count + " ");
//            }


//        // копирование одного массива в другой
//
//        int[] a1 = {1, 2, 3, 4};
//        int[] a2 = new int[a1.length +5];
//        for (int i = 0; i < a1.length; i++) {
//            a2[i] = a1[i];
//        }
//        for (int i = 0; i < a2.length; i++) {
//            System.out.print(a2[i] + " ");
//        }


        // ГСЧ!!!!!!!!!!!
        // формула сдвига от 0 до 1 (Math.random() * (max-min) + min

//        double a = Math.random(); // генерирует дробное число от 0 до 1 (не включая в себя 1)
//        System.out.println(a);


//        double a = Math.random() * 3; // [0;3)  [ - скобка, где число будет в рандоме. ) -  нет.
//        System.out.println(a);

//        double a = 2 + Math.random() * 5; // [2;7)
//        System.out.println(a);
//
//        double b = Math.random() * 5 + 2; // [2;7)
//        System.out.println(b);

//        double b = Math.random() * 10 - 5; // [-5;5)
//        System.out.println(b);

//        int a = (int) (Math.random() * 5);
//        System.out.println(a);

//        int a = 3 + (int) (Math.random() * 2);  // [3;5)  3 + 2
//        System.out.println(a);


//        int a = (int) (Math.random() * (10 + 1)) - 5; // [-5;5]
//        System.out.println(a);


//        (Math.random() * (max-min) + min
        // Math.random() (5 - (-2)) + (-2) => Math.random() * 7 -2
//        int a = (int) (Math.random() * 7) - 2; // [-2;5)
//        System.out.println(a);


        // заполнение массива рандомом
//        int[] array = new int[10];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 10);
//        }
//        System.out.println(Arrays.toString(array));


//        int[] array = new int[10];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 12 + 2); // [2;14)
//        }
//        System.out.println(Arrays.toString(array));


//        int[] array = new int[30];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 31 - 15); // [-15;16)
//        }
//        System.out.println(Arrays.toString(array));


//        int[] array = new int[20];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 40 + 10);
//        }
//        System.out.println(Arrays.toString(array));
//        int sum = 0, count = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 == 0) {
//                count++;
//            } else {
//                sum += array[i];
//            }
//        }
//        System.out.println("Количество четных элементов: " + count);
//        System.out.println("Сумма не четных элементов: " + sum);


        // for (объявление переменной : выражение)
//        {
//           в теле лежат операторы
//        }

//        int[] num = {10, 20, 30, 40, 50};
//        for (int i = 0; i < num.length; i++) {
//            System.out.print(num[i] + " ");
//        }
//        System.out.println();
//        for (int x : num) {
//            System.out.print(x + " ");
//        }


//        String[] names = {"Олег", "Иван", "Дима", "Юля"};
//        for (String name : names) {
//            System.out.print(name + "\t");
//        }
    }
}
