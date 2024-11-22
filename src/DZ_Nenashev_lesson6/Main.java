package DZ_Nenashev_lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num, a;
        String st;
        System.out.print(" Введите количество символов: ");
        num = input.nextInt();
        System.out.print(" Тип символа: ");
        st = input.next();
        System.out.print(" 0 - горизонтальная\n 1 - вертикальная \n Ориентация линии: ");
        a = input.nextInt();
        for (int i = 0; i < num; i++) {
            if (a < 0 || a > 1) {
                System.out.println(" Не правильно введено число ориентации!");
                break;
            }
            if (a == 0) {
                System.out.print(st + " ");
            } else {
                System.out.println(st);
            }
        }
    }
}


