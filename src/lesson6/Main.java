package lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int num, sum = 0, count = 0;
//        float average;
//        do {
//            System.out.print("Введите число: ");
//            num = input.nextInt();
//            if (num < 0) {
//                sum += num; // sum = sum + num
//                count++; // count + 1
//            }
//        }
//        while (num != 0);
//        System.out.println("sum:" + sum);
//        System.out.println("count:" + count);
//        average = (float) sum / count;
//        System.out.printf("Среднее арифметическое отрицательных чисел: %.2f ", average);


//        int num, sum = 0, count = 0;
//        float average;
//        System.out.print("Введите число: ");
//        num = input.nextInt();
//        if (num < 0) {
//            sum += num; // sum = sum + num
//            count++; // count + 1
//        }
//        while (num != 0) {
//            System.out.print("Введите число: ");
//            num = input.nextInt();
//            if (num < 0) {
//                sum += num; // sum = sum + num
//                count++; // count + 1
//            }
//        }
//        ;
//        System.out.println("sum:" + sum);
//        System.out.println("count:" + count);
//        average = (float) sum / count;
//        System.out.printf("Среднее арифметическое отрицательных чисел: %.2f ", average);


//        int number, reverse_number = 0, copy;
//        System.out.print("Введите число: ");
//        number = input.nextInt();
//        copy = number; // 321
////        System.out.println("number: " + number);
////        System.out.print("copy: " + copy);
//        do {
////            System.out.println(copy);
//
//            reverse_number *= 10; // 0. 10
//            reverse_number += copy % 10;  // 1 //  КОД РАЗВОРОТА ЧИСЛА В ОБРАТНУЮ СТОРОНУ !!!!
//            copy /= 10; // 32
//
//        } while (copy > 0);
//        System.out.println("Число: " + number + (number == reverse_number ? " " : " не ") + "палиндром.");


//        int i = 0;
//        while (i < 10) {
//            if (i == 3) {
//                i++; // когда доходит проверка, отправляет в условие  while (i < 10)
//                continue;
//            }
//            System.out.println(i);
//            if (i == 5) {
//                break;
//            }
//            i++;
//        }
//        System.out.println("Цикл завершен.");


//        int i = 0;
//        while (true) {
//            System.out.println(i);
//            if (i == 5) {
//                break;
//            }
//            i++;
//        }


//        int n;
//        while (true) {
//            System.out.print("Введите положительное число: ");
//            n = input.nextInt();
//            if (n < 0) {
//                break;
//            }

//        int num, s = 0;
//        while (true) {
//            System.out.print("Введите число: ");
//            num = input.nextInt();
//            if (num == 0)
//                break;
//            if (s == 0) {
//                s++;
//            }
//            s *= num;
//        }
//        System.out.println("Произведение чисел: " + s);
//        input.close();


//        int i = 1;
//        while (i < 5) {
//            System.out.println("Внешний цикл: i = " + i);
//            int j = 1;
//            while (j < 4) {
//                System.out.println("\tВнутренний цикл: j = " + j);
//                j++;
//            }
//            i++;
//        }

//
//        int i = 1; // строки
//        while (i < 10) {
//            int j = 1; // столбцы
//            while (j < 10) {
//                System.out.print(i + " * " + j + " = " + i * j + "\t\t ");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }


//        int i = 0;
//        while (i < 3) {
//            int j = 0;
//            while (j < 6) {
//                System.out.print("^");
//                j++;
//            }
//            System.out.println("");
//            i++;
//        }


//        int i = 0;
//        while (i < 5) {
//            int j = 0;
//            while (j < 16) {
//                if (i % 2 == 0) {
//                    System.out.print("+");
//                } else System.out.print("-");
//
//                j++;
//            }
//            System.out.println("");
//            i++;
//        }

//
//        int i = 0;
//        while (i < 5) {
//            int j = 0;
//            while (j < 16) {
//                System.out.print(i % 2 == 0 ? "+" : "-");
//                j++;
//            }
//            System.out.println("");
//            i++;
//        }

//        int i = 0;
//        while (i < 5) {
//            int j = 0;
//            while (j < 5) {
//                System.out.print(i == j ? "*" : " ");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }


        // ЦИКЛ for
        // for(инициализация_переменной; условие; шаг цикла;){   тело цикла   }

//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//        }

//        int i = 0;
//        for (; ; ) {
//
//            System.out.println(i);
//            if (i == 4) {
//                break;
//            }
//            i++;
//        }



//        int count = 0;
//        for (int i = 0; i < 6; i++) {
//            System.out.print("-> ");
//            if (input.hasNextInt()) {
//                count++;
//            }
//            input.nextLine();
//        }
//        System.out.println("Вы ввели " + count + " чисел.");


        int num;
        System.out.print("Введите число: ");
        num = input.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
    }
}
