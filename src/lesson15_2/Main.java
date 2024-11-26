package lesson15_2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // СТРОКИ!

//        String str1 = "Hello";
//        String str2 = "World.";
//        String message = str1 + str2;
//        System.out.println(message);


//        char[] helloArray = {'П', 'Р', 'И', 'В', 'Е', 'Т', '.'};
//        String helloString = new String(helloArray);
//        System.out.println(helloString);


//        String str1 = "Hello";
//        int a = 5;
//        String message = str1 + " " + 5;
//        System.out.println(message);


//        String str1 = "2";
//        int a = 5;
//        String message = str1 + 5;
//        System.out.println(message); // 25


//        int a = 5;
//        String message = "" + a;
//        System.out.println(message); // 5 - строка


//        String str1 = "2";
//        int a = 5;
//        int b = Integer.parseInt(str1);  //  преобразование строки в число
//        int message = b + a;
//        System.out.println(message);


//        String str1 = "2";
//        int a = 5;
//        int message = Integer.parseInt(str1) + a;
//        System.out.println(message);


//        String str1 = "Hello";
//        int count = (str1 + 57).length(); // длинна строки.
//        System.out.println(count);


        // пересохранить строку в нижнем регистре или в верхнем

//        String name ="VoVa";
//        String name2 =name.toLowerCase();  // метод перевода в нижний регистр
//        System.out.println(name2); // ПЕРЕСОХРАНИЛИ из name в name2
//
//        System.out.println(name.toLowerCase());
//        System.out.println(name);  // НЕ ПЕРЕСОХРАНИЛИ так как нет оператора =

//        String name ="VoVa";
//        String name2 =name.toUpperCase();
//        System.out.println(name2);

//
//        String s ="Я буду хорошим программистом";
//        char res = s.charAt(7); // .charAt - метод для обращения к индексу.
//        System.out.println(res);


        String s = "я буду хорошим программистом";
        System.out.println(s);
        int[] result = new int['я' - 'а' + 1];
        System.out.print(Arrays.toString(result));
        System.out.println();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch > 'а' && ch < 'я') {
                result[ch - 'а']++;
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println((char) (i + 'а') + " = " + result[i]);
        }
    }
}
