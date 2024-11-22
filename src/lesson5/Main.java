package lesson5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int age;
//        System.out.print("Введите свой возраст: ");
//        age = input.nextInt();
//        System.out.println(age >= 18 ? "Смотрите на здоровье." : "Вам еще рано смотртеть это!");

//        int a = 20, b = 20;
//        System.out.println(a == b ? "a = b" : a > b ? "a > b" : "b > a");

//        int n = true ? (false ? 10 : 20) : 30; // 20
//        System.out.println(n);

//        int a = 10, b = 3;
//        System.out.println(b == 0 ? "на ноль делить нельзя!" : (float) a / b);

//        int n;
//        System.out.print("\tВыбор цвета светофора:\n1 (11) - красный, 2 (22) - желтый, 3 (33) - зеленый.");
//        n = input.nextInt();
//        switch (n) {
//            case 1:
//            case 11:
//                System.out.println("Стоять!");
//                break;
//            case 2:
//            case 22:
//                System.out.println("Готовься.");
//                break;
//            case 3:
//            case 33:
//                System.out.println("Можно идти!");
//                break;
//            default:
//                System.out.println("Такого цвета в светофоре нет.");

//        int g, n, od = 0;
//        System.out.print("\tВведите номер месяца:");
//        g = input.nextInt();
//        switch (g) {
//            case 1:
//            case 3:
//            case 5:
//            case 7:
//            case 8:
//            case 10:
//            case 12:
//                od = 31;
//                break;
//            case 4:
//            case 6:
//            case 9:
//            case 11:
//                od = 30;
//                break;
//            case 2:
//                System.out.print("\tВведите год:");
//                n = input.nextInt();
//                if (n % 4 == 0) {
//                    od = 29;
//                } else {
//                    od = 28;
//                }
//                break;
//            default:
//                System.out.println("Не правильно введено число!");
//                break;
//        }
//        if (g >= 1 && g <= 12) {
//            System.out.println("\tКолличество дней " + od);
//        }


//        int month;
//        System.out.print("Введите номер месяца: ");
//        month = input.nextInt();
//        switch (month) {
//            case 1:
//            case 2:
//            case 12:
//                System.out.println("Зима.");
//                break;
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Весна.");
//                break;
//            case 6:
//            case 7:
//            case 8:
//                System.out.println("Лето.");
//                break;
//            case 9:
//            case 10:
//            case 11:
//                System.out.println("Осень.");
//                break;
//            default:
//                    System.out.println("Такого месяца не существует!");
//                    break;
//                }


//        int month;
//        System.out.print("Введите номер месяца: ");
//        month = input.nextInt();
//        switch (month) {
//            case 1, 2, 12 -> System.out.println("Зима.");
//            case 3, 4, 5 -> System.out.println("Весна.");
//            case 6, 7, 8 -> System.out.println("Лето.");
//            case 9, 10, 11 -> System.out.println("Осень.");
//            default -> System.out.println("Такого месяца не существует!");
//        }


//        int month;
//        String s = "";
//        System.out.print("Введите номер месяца: ");
//        month = input.nextInt();
//        switch (month) {
//            case 1, 2, 12 -> s = ("Зима.");
//            case 3, 4, 5 -> s = ("Весна.");
//            case 6, 7, 8 -> s = ("Лето.");
//            case 9, 10, 11 -> s = ("Осень.");
//            default -> s = "Такого месяца не существует!";
//        }
//        System.out.println(s);


//        int month;
//
//        System.out.print("Введите номер месяца: ");
//        month = input.nextInt();
//        String s = switch (month) {
//            case 1, 2, 12 -> ("Зима.");
//            case 3, 4, 5 -> ("Весна.");
//            case 6, 7, 8 -> ("Лето.");
//            case 9, 10, 11 -> ("Осень.");
//            default -> "Такого месяца не существует!";
//        };
//        System.out.println(s);


//        System.out.print("Введите балл по 12-ти бальной системе оценивания: ");
//        int num = input.nextInt();
//        System.out.print("Ваш балл по 5-ти бальной шкале: ");
//        switch (num >= 1 && num <= 3 ? 2 :
//                num >= 4 && num <= 6 ? 3 :
//                num >= 7 && num <= 9 ? 4 :
//                num >= 10 && num <= 12 ? 5 : 0) {
//            case 2 -> System.out.println(2);
//            case 3 -> System.out.println(3);
//            case 4 -> System.out.println(4);
//            case 5 -> System.out.println(5);
//            case 0 -> System.out.println("Такого значения нет!");
//        }


        // ПРИМЕР НИЖЕ ИСПОЛЬЗОВАТЬ НЕЛЬЗЯ - НЕ РАБОТАЕТ !!!


//        System.out.print("Введите балл по 12-ти бальной системе оценивания: ");
//        int num = input.nextInt();
//        System.out.print("Ваш балл по 5-ти бальной шкале: ");
//        String point = switch
//       ((num >= 1 && num <= 3) ? 2 :
//        (num >= 4 && num <= 6 )? 3 :
//        (num >= 7 && num <= 9) ? 4 :
//        (num >= 10 && num <= 12) ? 5 : 0) {
//            case 2 -> "2";
//            case 3 -> "3";
//            case 4 -> "4";
//            case 5 -> "5";
//            case 0 -> "Такого значения нет!";
//        };
//        System.out.println(point);


        // ЦЫКЛЫ!!!!!!!!!!!  while - это цикл с предусловием (сначала проверяется условие!!!)
        //                   do...while - цикл с постусловием (сначала сделается одно действие, потом проверится цикл на условие)


//        int i = 0; // переменная счетчик
//        while (i < 5) {  // условие
//            System.out.println(i);
//            i++; // шаг цикла
//        }

//        int i = 5;
//        while (i > 0) {
//            System.out.println(i);
//            i--;
//        }


//        int i = 20;
//        while (i > 0) {
//            System.out.println(i);
////            i = i / 5;
////            i = i - 10;
//            i = i - 2;
//        }


//        int n, sum = 0;
//        System.out.print("Введите число: ");
//        while (input.hasNextInt()) {
//            System.out.print("Введите число: ");
//            n = input.nextInt();
//            sum += n; // sum = sum + n;
//        }
//        System.out.println("Сумма введеных чисел: " + sum);


//        int s, f, sum = 0;
//        System.out.print("Введите начало диапазона: ");
//        s = input.nextInt();
//        System.out.print("Введите конец диапазона: ");
//        f = input.nextInt();
//        while (s <= f) {
//            if (s % 2 != 0) // остаток от деления на неравные числа.
//                // System.out.print(s + " ");
//            sum += s; // s - объявлена как счетчик в while (s <= f)
//            s++;
//        }
//        System.out.println("Сумма не четных чисел: " + sum);


        // do...while

//        int i = 0;
//        do {
//            System.out.println("i = : " + i);
//            i++;
//        } while (i > 5);

    }
}


