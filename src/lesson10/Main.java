package lesson10;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Двумерные массивы

//        int n = 5;
//        char[][] graph = new char[n][n]; // 5 - кол-во столбцов. 4 - кол-во элементов в строке
//        for (int i = 0; i < graph.length; i++) {
//            System.out.println(Arrays.toString(graph[i]));
//        }


//        int n = 5;
//        char[][] graph = new char[n][n];
//
//        for (int i = 0; i < n /* эта n - вместо graph.length */; i++) {
//            for (int j = 0; j < graph.length; j++) { // заполняем массив - *
//                graph[i][j]= '*';
//            }
//        }
//        for (int i = 0; i < graph.length; i++) {
//            for (int j = 0; j < graph[i].length; j++) { // выводим массив в консоль заполненный *
//                System.out.print(graph[i][j] + "\t");
//            }
//            System.out.println();
//        }


//        // Заполнить массив рандомными цифрами от -20 до 10 и вывести в консоль все минусовые значения
//
//        int n = 4, m = 3, count = 0;
//        int[][] mas = new int[n][m];
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                mas[i][j] = (int) (Math.random() * 31) - 20;
//                if (mas[i][j] < 0) {
//                    count++;
//                }
//            }
//        }
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                System.out.print(mas[i][j] + "\t\t");
//            }
//            System.out.println();
//        }
//        System.out.println("\nКол-во отрицательных элементов: " + count);


//        // заполнить массив рандомом и высчитать наименьшую сумму в строке(!)
//
//        int n = 3, m = 5, pos = 0, sum = 0, minsum = Integer.MAX_VALUE;
//        int[][] mas = new int[n][m];
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                mas[i][j] = (int) (Math.random() * 100);
//                System.out.print(mas[i][j] + "\t\t");
//            }
//            System.out.println();
//        }
//        System.out.println();
//
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                sum += mas[i][j]; // заполняет строку (j) по порядку при каждой итерации (i)
//            }
//            if (minsum > sum) {
//                minsum = sum;
//                pos = i;
//            }
//            System.out.println("Сумма " + (i + 1) + " строки: " + sum);
//            sum = 0;
//        }
//        System.out.println("\nСтрока с наименьшей суммой " + minsum + " имеет номер: " + (pos + 1));


        // зубчатый массив

//        int[][] mas = new int[3][];
//        mas[0] = new int[2]; // это заполнение строк (вторые [])
//        mas[1] = new int[3]; // это заполнение строк (вторые [])
//        mas[2] = new int[4]; // это заполнение строк (вторые [])
//
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                System.out.print("Введите число: ");
//                mas[i][j] = input.nextInt();
//            }
//        }
//
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                System.out.print(mas[i][j] + "\t");
//            }
//            System.out.println();
//        }


        // второй вариант создания зубчатых массивов

//        int[][] mas = new int[3][];
//        mas[0] = new int[]{1, 2};          // длинный вариант
//        mas[1] = new int[]{3, 4, 5};
//        mas[2] = new int[]{6, 7, 8, 9};


////        int[][] mas = new int[][]{{1, 2}, {3, 4, 5}, {6, 7, 8, 9}}; // можно так
//        int[][] mas = {{1, 2}, {3, 4, 5}, {6, 7, 8, 9}}; // можно так
//
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                System.out.print(mas[i][j] + "\t");
//            }
//            System.out.println();
//        }


//        // КОД ЗАПОЛНЕНИЯ ИНДЕКСОВ МАССИВА !!!!!!
//        int[][] mas = new int[5][];
//        int a = 0;
////        mas[0] = new int[1];
////        mas[1] = new int[2];
////        mas[2] = new int[3];
////        mas[3] = new int[4];
////        mas[4] = new int[5];
//        for (int i = 0; i < mas.length; i++) { // КОД ЗАПОЛНЕНИЯ ИНДЕКСОВ МАССИВА !!!!!!
//            mas[i] = new int[i + 1];
//        }
//
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                mas[i][j] = a++;            // сначала к "а" мы приравниваем mas[i][j] через оператор = а потом                               увеличиваем через ++
//                System.out.print(mas[i][j] + "\t");
//            }
//            System.out.println();
//        }


        // создать зубчатый массив и заполнить его значениями от 10 до 25

//        int[][] mas = new int[5][];
//        int count = 10;
//
//        for (int i = 0; i < mas.length; i++) {
//            mas[i] = new int[mas.length - i];
//        }
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas[i].length; j++) {
//                mas[i][j] = count++;
//                System.out.print(mas[i][j] + "\t");
//            }
//            System.out.println();
//        }


//        // треугольник Паскаля
//
        int n = 18;
        int[][] tp = new int[n][];
        for (int i = 0; i < tp.length; i++) {
            tp[i] = new int[i + 1];
            tp[i][0] = 1; // присвоили первому столбику значение 1
            tp[i][i] = 1; // присвоили концу каждого столбика значение 1
            for (int j = 1; j < i; j++) {
                tp[i][j] = tp[i - 1][j - 1] + tp[i - 1][j]; // здесь мы записываем значения со строчки выше                                                (РАЗОБРАТЬСЯ ЛУЧШЕ!!!)
            }
        }
        for (int i = 0; i < tp.length; i++) {
            for (int j = 0; j < tp.length - i; j++) { // сдвигаем строки вправо
                System.out.print("  ");
            }
            for (int j = 0; j < tp[i].length; j++) {
                if (tp[i][j] > 9) {
                    System.out.print(tp[i][j] + "  ");
                } else {
                    System.out.print(tp[i][j] + "   ");
                }
            }
            System.out.println();
        }
    }
}