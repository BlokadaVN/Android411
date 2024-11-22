package DZ_Nenashev_lesson5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        //        int num;
//        Scanner input = new Scanner(System.in);
//        System.out.print("Введите количество часов: ");
//        num = input.nextInt();
//        String t = switch (num) {
//            case 0, 1, 2, 3, 4, 5 -> ("Доброй ночи.");
//            case 6, 7, 8, 9, 10, 11, 12 -> ("Доброе утро.");
//            case 13, 14, 15, 16 -> ("Добрый день!");
//            case 17, 18, 19, 20, 21, 22, 23 -> ("Добрый вечер.");
//            default -> ("Неправильно введено время!");
//        };
//        System.out.println(t);


        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("\tВведите количество часов: ");
        num = input.nextInt();
        switch (num >= 0 && num < 5 ? 1 :
                num >= 6 && num <= 12 ? 2 :
                num >= 13 && num <= 16 ? 3 :
                num >= 17 && num <= 23 ? 4 :
                num < 0 || num > 23 ? 0 : 0) {
            case 1 -> System.out.println("Доброй ночи.");
            case 2 -> System.out.println("Доброе утро.");
            case 3 -> System.out.println("Добрый день.");
            case 4 -> System.out.println("Добрый вечер.");
            case 0 -> System.out.println("Не правильно введено время!");
        }
    }
}
