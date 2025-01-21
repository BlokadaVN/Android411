package OOP8.exception;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        String first = input.nextLine();

        System.out.print("Введите второе число: ");
        String second = input.nextLine();

        int a = 0;
        int b = 0;

        try {
            a = Integer.parseInt(first); // .parseInt - преобразование строки в инт из переменной (first).
            b = Integer.parseInt(second);
        } catch (NumberFormatException e) {
            System.out.println("Одно или оба значения не корректно.");
        }

        System.out.println("Результат: " + (a + b));
    }
}
