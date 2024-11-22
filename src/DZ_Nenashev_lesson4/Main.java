package DZ_Nenashev_lesson4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число от 1 до 99: ");
        int od;
        int num = input.nextInt();
        od = num % 10;
        if (num >= 1 && num <= 99) {
            if (num >= 11 && num <= 14) {
                System.out.println(num + " копеек.");
            } else if (od == 1) {
                System.out.println(num + " копейка.");
            } else if (od >= 2 && od <= 4) {
                System.out.println(num + " копейки.");
            } else if (od >= 5 && od <= 9 || od == 0) {
                System.out.println(num + " копеек.");
            }

        } else {
            System.out.println("Введено не правильное число.");
        }
    }


}