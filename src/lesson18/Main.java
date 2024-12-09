package lesson18;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        // String s1 = "Я ищу совпадения в 2024 и я их найду в 2 счёта. Hel_lo World.";
        // String s1 = "one\ntwo";
        // String s1 = "Goods - 500$";
        // String s1 = "Java,\njava,\nJAVA";

        // System.out.println("Исходная строка: " + s1);
        // String pattern1 = "h";
        // String pattern1 = "\\d+ #поиск цифр"; // поиск цифр.
        // String pattern1 = "one.\\w+"; // "one\ntwo"
        // String pattern1 = "one$"; // "one\ntwo"
        // String pattern1 = "(?im)^java";

        // Pattern regex1 = Pattern.compile(pattern1, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE); // .CASE_INSENSITIVE - ищет совпадение игнорируя регистр (только язык буржуев). .UNICODE_CASE - ищет русский, работает в связке Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE (?i)

//        Pattern regex1 = Pattern.compile(pattern1, Pattern.COMMENTS); // .COMMENTS - берет комментарий #поиск цифр

        // Pattern regex1 = Pattern.compile(pattern1, Pattern.DOTALL); // .DOTALL - игнорирует \n.

        // Pattern regex1 = Pattern.compile(pattern1, Pattern.MULTILINE); // .MULTILINE - если есть \n то будет выводить каждый конец строки. (?m)

        // Pattern regex1 = Pattern.compile(pattern1, Pattern.MULTILINE); // .MULTILINE - если есть \n то будет выводить каждый конец строки.

        // Pattern regex1 = Pattern.compile(pattern1, Pattern.LITERAL); // .LITERAL - игнорирует спецсимвол. String pattern1 = "$500";
//
//        Pattern regex1 = Pattern.compile(pattern1);
//
//        Matcher matcher1 = regex1.matcher(s1);
//
//        while (matcher1.find()) {
//            System.out.print(matcher1.group() + " ");


//        String s1 = "<body>Пример жадного соответствия регулярного выражения</body>";
//        String pattern1 = "<.*>";

//        String s1 = "<body>Пример ленивого соответствия регулярного выражения</body>";
//        String pattern1 = "<.*?>";
//
//        Pattern regex1 = Pattern.compile(pattern1);
//
//        Matcher matcher1 = regex1.matcher(s1);
//
//        while (matcher1.find()) {
//            System.out.print(matcher1.group() + " ");
//        }

        /*
          может быть *? +? ?? {n,m}? {m,}? - если нужно минимальное кол-во символов при поиске.
        */


//        String s1 = "Егорова Алиса Александровна";
//        String pattern1 = "А.+а";
//
//        Pattern regex1 = Pattern.compile(pattern1);
//
//        Matcher matcher1 = regex1.matcher(s1);
//
//        while (matcher1.find()) {
//            System.out.print(matcher1.group() + " ");
//        }


        // Круглые скобки

        // Круглые скобки работают что-то типа массива. в примере String pattern1 = "([a-z]+)(\\d*)"; в первых скобках поиск букв, во вторых - цифр. и в System.out.print(matcher1.group(2) + " "); где .group(2) будут искаться и выводиться цифры.

//        String s1 = "Word2016, PS6, AI5";
//        String pattern1 = "([a-z]+)(\\d*)";
//
//        Pattern regex1 = Pattern.compile(pattern1, Pattern.CASE_INSENSITIVE);
//
//        Matcher matcher1 = regex1.matcher(s1);
//
//        while (matcher1.find()) {
//            System.out.print(matcher1.group(2) + " ");
//            System.out.print(matcher1.group(1) + " ");
//        }


//        String s1 = "one";
//        String pattern1 = "(.(.(.)))";
//
//        Pattern regex1 = Pattern.compile(pattern1, Pattern.CASE_INSENSITIVE);
//
//        Matcher matcher1 = regex1.matcher(s1);
//
//        matcher1.find();
//        System.out.println(matcher1.groupCount());
//        for (int i = 0; i <= matcher1.groupCount(); i++) {
//            System.out.println(i + ": " + matcher1.group(i));
//        }


//        String s1 = "Ольга и Виталий отлично учатся";
//        String pattern1 = "Ольга|Виталий|Петр";
//
//        Pattern regex1 = Pattern.compile(pattern1, Pattern.CASE_INSENSITIVE);
//
//        Matcher matcher1 = regex1.matcher(s1);
//
//        while (matcher1.find()) {
//            System.out.print(matcher1.group() + " ");
//        }


//        String s1 = "int = 4, float = 4.0f, double = 8.0";
//        // String pattern1 = "int+\\s*=\\s*\\d[.\\w]*|float+\\s*=\\s*\\d[.\\w]*"; // Было
//        String pattern1 = "(int|float)+\\s*=\\s*(\\d[.\\w]*)"; // Стало
//
//        Pattern regex1 = Pattern.compile(pattern1, Pattern.CASE_INSENSITIVE);
//
//        Matcher matcher1 = regex1.matcher(s1);
//
//        while (matcher1.find()) {
//            System.out.println(matcher1.group());
//            System.out.println(matcher1.group(1));
//            System.out.println(matcher1.group(2));
//        }


        // Ищем IP - адрес

//       // String s1 = "192.168.255.255"; // 1
//        String s1 = "127.0.0.1";
//
//       // String pattern1 = "\\d{1,3}.\\d{1,3}.\\d{1,3}.\\d{1,3}"; // 1
//        String pattern1 = "(\\d{1,3}\\.){3}\\d{1,3}"; // в скобках () что ищем, в {3} сколько повторений того, что в круглых скобках.
//
//        Pattern regex1 = Pattern.compile(pattern1, Pattern.CASE_INSENSITIVE);
//
//        Matcher matcher1 = regex1.matcher(s1);
//
//        while (matcher1.find()) {
//            System.out.print(matcher1.group() + " ");
//        }


        // АЛЬТЕРНАТИВА Pattern regex1 = Pattern.compile(); Matcher matcher = regex.matcher();

//       // String s = "Я ищу совпадения в 2024. И я их найду в 2 счёта. Hel_lo World.";
//       //String s = "Суворова Виктория, Россия, Сочи, +7 999 555 77-33";
//
//        // String[] arr = s.split("\\."); // .split - разбивает строку по разделителю. в данном случае точка.
//
//        String[] arr = s.split(",\\s"); // .split - разбивает строку по разделителю. в данном случае точка.
//        System.out.println(Arrays.toString(arr));
//
////        for (int i = 0; i < arr.length; i++) {
////            System.out.println(arr[i]);
////        }
//
//        for (String temp : arr) {
//            System.out.println(temp);
//        }


        // ПОИСК И ЗАМЕНА

        String s = "05-03-1987 // Дата рождения";
        String s2 = s.replaceAll("\\s//.*", "").replaceAll("-", "."); // .replaceAll - поиск и замена.

        System.out.println("Дата рождения: " + s2);
    }
}
