package lesson4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int a = 5;
//        a+=10;
//        a-=2;
//        System.out.println(a);

//        Scanner input = new Scanner(System.in);
//        int a, b, c, sum;
//        System.out.print("Введите первое число: ");
//        a = input.nextInt();
//        System.out.print("Введите второе число: ");
//        b = input.nextInt();
//        System.out.print("Введите третье число: ");
//        c = input.nextInt();
//        sum = a+b+c;
//        System.out.println("Сумма: " + sum);

//        int  sum;
//        System.out.print("Введите первое число: ");
//        sum = input.nextInt();
//        System.out.print("Введите второе число: ");
//        sum += input.nextInt();
//        System.out.print("Введите третье число: ");
//        sum += input.nextInt();
//        System.out.println("Сумма: " + sum);

//        int a = 5;
//        int b = 3;
//        System.out.println(a == b);
//        System.out.println(a != b);
//        System.out.println(a > b);
//        System.out.println(a >= b);
//        System.out.println(a < b);
//        System.out.println(a <= b);

//        boolean a1 = 5 > 6  || 4 < 6 && 20 > 15 + 6;
//        System.out.println(a1);
//        boolean a2 = 5 > 3;
//        System.out.println(!a2);

        /*
          if (условия){
                 команда 1
          }
          else {
                 команда 2
          }
        */

//        int age;
//        System.out.print("Введите свой возраст: ");
//        age = input.nextInt();
//        if (age >= 18) {
//            System.out.println("Доступ разрешен!");
//            System.out.println("Добро пожаловать!");
//        } else {
//            System.out.println("Доступ запрещен!");
//            System.out.println("Вход разрешен с 18 лет!");
//        }

//        int num1 = 17;
//        int num2 = 5;
//        if (num1 > num2){
//            System.out.println("Первое число больше второго.");
//        }if (num1 < num2){
//            System.out.println("Первое число меньше второго.");
//        }else {
//            System.out.println("Числа равны.");
//        }

//        int num1 = 5;
//        int num2 = 5;
//        if (num1 > num2) {
//            System.out.println("Первое число больше второго.");
//        } else if (num1 < num2) {
//            System.out.println("Первое число меньше второго.");
//        } else {
//            System.out.println("Числа равны.");
//        }

//        int age = 25;
//        boolean isYoung = age >= 18;
//        boolean isOld = age > 65;
//        if (isYoung || isOld) {
//            System.out.println("Вы можете работать ");
//        } else {
//            System.out.println("Работать нельзя.");
//        }

//        int age = 75;
//        if (age < 18 || age > 65) {
//            System.out.println("Работать нельзя. ");
//        } else {
//            System.out.println("Можно работать.");
//        }
        Scanner input = new Scanner(System.in);
//        int a, b, c;
//        System.out.print("Введите первую сторону: ");
//        int num = input.nextInt();
//        a = num;
//        System.out.print("Введите вторую сторону: ");
//        int num1 = input.nextInt();
//        b = num1;
//        System.out.print("Введите третью сторону: ");
//        int num2 = input.nextInt();
//        c = num2;
//        if (a == b && b == c && c==a) {
//            System.out.println("Треугольник равносторонний.");
//        } else if (a == b || b == c || c == a) {
//            System.out.println("Треугольник равнобедренный.");
//        } else System.out.println("Треугольник разносторонний");
//
//        int day, time;
//        System.out.print("Введите день недели цифрами: ");
//        day = input.nextInt();
//        if (day >= 1 && day <= 5) {
//            System.out.print("Рабочий день.\nВведите время: ");
//           time = input.nextInt();
//           if (time >=9 && time <=18){
//            System.out.println("Открыто.");}
//            else{
//                System.out.println("Закрыто! Откроется в 9:00");
//            }
//        } else if (day == 6 || day == 7) {
//            System.out.println("Не рабочий день.");
//        } else {
//            System.out.println("Такого дня не существует!");
//        }

        int n;
        System.out.print("Введите количество ворон: ");
        n = input.nextInt();
        if (n >= 0 && n <= 9) {
       //     System.out.print(" На ветке ");
//            if (n == 1) {
//                System.out.println(n + " ворона.");
//            } else if (n >= 2 && n <= 4) {
//                System.out.println(n + " вороны.");
//            } else
//            else if (n >= 5 && n <= 9 || n == 0)
//            {
//                System.out.println(n + " ворон.");
//            }
        } else {
            System.out.print("Ошибка ввода данных!");
        }
//        int n;
//        n = input.nextInt();
//        System.out.println(n % 10);

//        int d;
//        System.out.print("Введите день недели (цифрами): ");
//        d = input.nextInt();
//        if (d >= 1 && d <= 5) {
//            System.out.println("Рабочий день.");
//            if (d==1) System.out.println("понедельник.");
//            if (d==2) System.out.println("вторник.");
//            if (d==3) System.out.println("среда.");
//            if (d==4) System.out.println("четверг.");
//            if (d==5) System.out.println("пятница.");
//
//        } else if (d >= 6 && d <= 7) {
//            System.out.println("Выходной.");
//            if (d==6) System.out.println("суббота.");
//            if (d==7) System.out.println("воскресенье.");
//        } else {
//            System.out.println("Ошибка ввода.");
//        }

//        int number, res;
//        number = -10;
//        res = number <= 0 ? number : -number;
//        System.out.println(res);


//        int age;
//        System.out.print("Введите свой возраст: ");
//        age = input.nextInt();
//        System.out.println(age >= 18 ?"Смотрите на здоровье.": "Вам еще рано смотртеть это!");

    }

}
