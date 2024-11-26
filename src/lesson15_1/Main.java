package lesson15_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        try { // try - попытаться
//
//            System.out.print("Введите первое число: ");
//            int a = input.nextInt();
//            System.out.print("Введите второе число: ");
//            int b = input.nextInt();
//
//            System.out.println(a / b);
//        } catch (InputMismatchException e) { // catch - поймать
//            System.out.println("Вы ввели не целое число! " + e); // e - в данном случае это псевдоним InputMismatchException т.е. ОБЯЗАТЕЛЬНО нужно давать имя исключению InputMismatchException
//
//        } catch (
//                ArithmeticException e) { //  Псевдоним e - так  же псевдоним исключения, можно называть исключения одним и тем же названием. Имя исключения находится в области видимости catch
//            System.out.println("Делить на ноль нельзя!" + e);
//        }


        //  в одном catch обработка нескольких исключений

//        try {
//
//            System.out.print("Введите первое число: ");
//            int a = input.nextInt();
//            System.out.print("Введите второе число: ");
//            int b = input.nextInt();
//
//            System.out.println(a / b);
//        } catch (InputMismatchException | ArithmeticException e) {
//            System.out.println("Вы ввели не целое число! " + e);
//            System.out.println("Делить на ноль нельзя!" + e);
//        } finally {   // эта команда отработает в любом случае.
//            System.out.println("Конец программы.");
//        }


//        try {
//            int[] numbers = new int[3];
//            numbers[3] = 9;
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Введен некорректный индекс. " + e);
//        }


        // факториал числа 5! = 1 * 2 * 3 * 4 * 5 => 120

        int res = getFactorial(-5);
        System.out.println("Результат: " + res);
    }

    public static int getFactorial(int num) {
        int mul = 1;
        try {
            if (num < 0) {
                throw new Exception("Число меньше 1 указывать нельзя.");
            }
            for (int i = 1; i <= num; i++) {
                mul *= i;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());  // .getMessage() - вызывает какое либо сообщение.
            mul = num;
        }
        return mul;
    }
}
