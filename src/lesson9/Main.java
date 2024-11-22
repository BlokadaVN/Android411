package lesson9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Массивы типа String

//        String[] sities = new String[4];
//        System.out.println(Arrays.toString(sities));


//        String[] sities = {"Барнаул", "Иркутск", "Рим", "Анапа"};
//        String[] sities2 = new String[sities.length + 1];
//        for (int i = 0; i < sities.length; i++) {
//            sities2[i] = sities[i];
//        }
//        sities2[sities.length] = "Красноярск";
//        System.out.println(Arrays.toString(sities2));


//        // ArrayList

//        ArrayList<String> cities = new ArrayList<>();
//        cities.add("Барнаул");
//        cities.add("Иркутск");
//        cities.add("Рим");
//        cities.add("Анапа");
//        cities.add(1, "Красноярск");
//        System.out.println(cities);
//        System.out.println("\t" + cities.get(2)); // Обращение к индексу массива
//        System.out.println();
//        cities.set(2, "Курск");  // set - присвоить к индексу (в данном случае 2) - новое значение
//        System.out.println(cities.size());
//        cities.remove(1);  //  .remove - удаляет выбранный индекс.
//        cities.remove("Рим"); // .remove - удаляет выбранное значение


//        // цикл foreach
//        for (String city : cities) {
//            System.out.print(city + "\t");
//        }
//
//        System.out.println("\n" + cities.indexOf("Барнаул")); // .indexOf - выводит индекс по названию элемента.
//        System.out.println("\n" + cities.indexOf("Барнаул7")); // .indexOf - выведет -1. Если такого элемента нет.
//        System.out.println("\n" + cities.contains("Курск")); // .contains - ищет true оли false
//
//        if(cities.contains("Курск")){
//            System.out.println("ArrayList содержит город Курск");

//                    //  в цикле for
//        ArrayList<String> cities = new ArrayList<>();
//        cities.add("Барнаул");
//        cities.add("Иркутск");
//        cities.add("Рим");
//        cities.add("Анапа");
//        cities.add(1, "Красноярск");
//
//        for (int i = 0; i < cities.size(); i++) {
//            System.out.print(cities.get(i) + "\t");
//        }


//        int n, k;
//        ArrayList<Integer> mas = new ArrayList<>();
//        System.out.println("Введите элементы списка: ");
//        while ((n = input.nextInt()) > 0) {
//            mas.add(n);
//
//        }
//        System.out.println(mas);
//        System.out.print("Введите индекс: ");
//        k = input.nextInt();
//        mas.remove(k);
//        System.out.println(mas);


//        int max, ind;
//        ArrayList<Integer> mas = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            mas.add((int) (Math.random() * 100));
//        }
//        for (int m : mas) {
//            System.out.print(m + "\t");
//        }
//        max = mas.get(0);
//        for (int i = 0; i < 10; i++) {
//            if (mas.get(i) > max) {
//                max = mas.get(i);
//            }
//        }
//        System.out.println("\nМаксимальное число: " + max);
////        // ind = mas.indexOf(max); // нашли индекс максимального элемента
////        // mas.remove(ind);
//        mas.remove(mas.indexOf(max)); // второй вариант удаления максимального числа
//        mas.add(0, max); // добавили максимальный элемент в индекс 0
//        for (int m : mas) {
//            System.out.print(m + "\t");
//        }


//        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3)); // Arrays.asList - можно сразу вносить какие-то значения
//        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(11, 22, 33));
//        ArrayList<Integer> c = new ArrayList<>();
//        for (int i = 0; i < a.size(); i++) {
//            c.add(a.get(i));
//            c.add(b.get(i));
//        }
//        System.out.println(c);


        // если например один из массивов больше

//        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3)); // Arrays.asList - можно сразу вносить какие-то значения
//        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(11, 22, 33, 44, 55));
//        ArrayList<Integer> c = new ArrayList<>();
//        for (int i = 0; i < a.size(); i++) {
//            c.add(a.get(i));
//            c.add(b.get(i));
////          //  if (i < a.size()) {
////          //     c.add(a.get(i));
////          //  }
////          //  if (i < b.size()) {
////          //     c.add(b.get(i));
////          // }
//        }
//        for (int i = a.size(); i < b.size(); i++) {
//            c.add(b.get(i));
//        }
//        System.out.println(c);


        // Вложенные массивы
        int[][] num = {{0, 1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11}};

//        System.out.println(num[1][3]); // num[1][3] - где 1 это номер вложенного массива, а 3 - индекс числа во вложенном массиве
//        for (int i = 0; i < num.length; i++) {
//            System.out.println(Arrays.toString(num[i]));
//        }

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

