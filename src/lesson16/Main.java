package lesson16;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        String s1 = "";
//        if (s1.length() == 0 || s1.isEmpty()) {  // s1.length() == 0 || s1.isEmpty() где метод .isEmpty то же самое что искать длину по .length
//            System.out.printf("Пустая строка.");
//        }



        // Положили строку в массив и посмотрели ее по индексам

//        String str1 = "Строка";
//        char[] res = str1.toCharArray();
//        System.out.println("Массив символов:");
//        for (int i = 0; i < res.length; i++) {
//            System.out.println("Элемент [" + i + "]: " + res[i]);
//        }


//        // разворот слешей в веб - строке в обратную сторону
//
//        String path = "https://promodj.com/fonarev/groups/17350/Digital_Emotions_Podcast?page=6";
//        char[] chars = path.toCharArray();
//
//        for (int i = 0; i < chars.length; i++) {
//            if (chars[i] == '/') {
//                chars[i] = '\\';    // изменили слеш
//            }
//        }
//        String res = new String(chars); // перезаписали массив
//        System.out.println(res);


//        String str1 = "I learning Java";
//        System.out.println(str1);
//        System.out.println(str1.indexOf('a')); // Метод, который ищет индекс по букве по первому совпадению. Если элемент не найден, вернет - 1 (минус один)
//        System.out.println(str1.lastIndexOf('a')); // последний индекс искомой буквы
//
//        System.out.println(str1.indexOf('a',5));
//        System.out.println(str1.lastIndexOf('a',5));


//        // Метод удаляющий пробел в начале и конце строки
//
//        System.out.println("   Какой то текст    ".trim());


//        String str = "I learning Java";
//        String str1 =str.substring(2,10); // .substring - грубо говоря обрезает строку по индексам
//        System.out.println(str1);
//        System.out.println("I learning Java".substring(2));


//        // Задача поменять слова местами
//
        //        System.out.print("Введите два слова через пробел: ");
//        String str = input.nextLine();
////        String first = str.substring(0, str.indexOf(' ')); // 0 -> 4
////        System.out.println(first);
////        // String second = str.substring(str.indexOf(' ')).trim(); // от пробела до конца строки
////        String second = str.substring(str.indexOf(' ') + 1);
////        System.out.println(second);
//
//        // System.out.println(second + " " + first);
//        System.out.println(str.substring(str.indexOf(' ') + 1) + " " + str.substring(0, str.indexOf(' ')));


//        // разделить строку на несколько подстрок
//
//        String str = "I learning Java";
//        String[] words = str.split(" "); //  .split - разделить. в данном случае на " " - пробел. Если подставить символ (например а) то сплит разобьет на ИНДЕКСЫ по символу а!!!!!!!!!!!   String[] words = str.split("a");
//
//        for (String word : words) {
//            System.out.println(word);
//        }


//        // Задача: пользователь вводит Ф.И.О. полностью, а программа выводит фамилию и инициалы.
//
//        System.out.print("Введите Ф.И.О. полностью: ");
//        String str = input.nextLine();
//        String[] fio = str.split(" ");
//        System.out.println(Arrays.toString(fio));
//        System.out.println(fio[0] + " " + fio[1].substring(0, 1) + "." + fio[2].substring(0, 1) + ".");
//        System.out.println(fio[0] + " " + fio[1].charAt(0) + "." + fio[2].charAt(0) + "."); // .charAt(0)  - берет значение по индексу 0 в ячейки массива по индексу [1] и [2]


//        // Разворот строки в обратную сторону.
//
//        // первый вариант
//        String str = "Строка";
//        char[] ch = new char[str.length()];
//        for (int i = 0; i < str.length(); i++) {
//            ch[i] = str.charAt(str.length() - 1 - i); // в ch[i] мы передаем с помощью str.charAt элементы строки (Строка)
//        }
//        System.out.println(ch);
//
//        // второй вариант.
//        String s1 = "Строка";
//        String result = "";
//        for (int i = s1.length() - 1; i >= 0;
//             i--) {
//            result += s1.charAt(i);
//        }
//        System.out.println(result);
//
//        // третий вариант
//
//        String s2 = "Строка";
//        String result1 = "";
//        for (int i = 0; i < s2.length(); i++) {
//            result1 = s2.charAt(i) + result1;
//        }
//        System.out.println(result1);


//        // Объединить несколько строк в одну.
//
//        String res = String.join(":", "00", "23", "30");
//        System.out.println(res);
//
//        String[] text = new String[]{"я", "буду", "хорошим", "программистом"};
//        String str = String.join(" ", text);
//        System.out.println(str);


        // Если что - то нужно найти в строке и заменить

//        String text = "Я изучаю Java. Мне нравится Java.";
//        System.out.println(text);
//        String[] array = text.split("Java"); // разделили
//        System.out.println(Arrays.toString(array));
//        String res = String.join("Android", array); // соединили
//        System.out.println(res);

//        String text = "Я изучаю Java. Мне нравится Java.";
//        text = text.replace("Java","Android"); // метод .replace заменил Java на Android
//        System.out.println(text);


//        //  Замените в этой строке все появления буквы "о" на букву "О", кроме первого и последнего вхождения.
//
//        String str1 = "Замените в этой строке все появления буквы \"о\" на букву \"О\", кроме первого и последнего вхождения.";
//        String str2 = "";
//        char x;
//        int a = str1.indexOf('о');
//        int b = str1.lastIndexOf('о');
//        for (int i = 0; i < str1.length(); i++) {
//            x = str1.charAt(i);
//            if (x == 'о' && i != a && i != b) {
//                x = 'О';
//            }
//            str2 += x;
//        }
//        System.out.println(str1);
//        System.out.println(str2);


//        // не полностью отрабатывает (можно разобраться)
//        String str1 = "Замените в этой строке все появления буквы \"о\" на букву \"О\", кроме первого и последнего вхождения.";
//        str1.substring(str1.indexOf('о'), str1.lastIndexOf('о'));
//        char[] array = new char[str1.length()];
//        for (int i = 0; i < str1.length(); i++) {
//            array[i] = str1.charAt(i);
//        }
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == 'о') {
//                array[i] = 'О';
//            }
//        }
//        for (char res : array) {
//            System.out.print(res);
//        }

//
//        String line = "Замените в этой строке все появления буквы \"о\" на букву \"О\", кроме первого и последнего вхождения.";
//        String a = line.substring(0, line.indexOf('о') + 1);
//       // System.out.println(a);
//        String b = line.substring(line.indexOf('о') + 1, line.lastIndexOf('о'));
//       // System.out.println(b);
//        String c = line.substring(line.lastIndexOf('о'));
//       // System.out.println(c);
//        System.out.println(a + b.replace('о', 'О') + c);


//        // Сравнение строк
//
////        int a = 5;
////        int b = 5;
//        String a = "Hello";
//        String b = "Hello";
//        String c = "Good bye";
//        String d = "HELLO";
//        System.out.println(a + " == " + b + " -> " + a.equals(b)); // где метод .equals сравнивает a и b (true)
//        System.out.println(a + " == " + c + " -> " + a.equals(c)); // false
//        System.out.println(a + " == " + d + " -> " + a.equals(d));
//        System.out.println(a + " == " + d + " -> " + a.equalsIgnoreCase(d)); // метод .equalsIgnoreCase игнорирует регистр.


//        System.out.println("I learning Java".endsWith("Java")); // метод .endsWith проверяет, заканчивается ли строка на слово "Java"
//
//        System.out.println("I learning Java".startsWith("I")); // метод .startsWith проверяет, начинается ли строка с "I"
//
//        System.out.println("I learning Java".contains("ing")); //  .contains содержится ли где - то во всей строке "ing"

//
//        // пример
//
//        System.out.print("Введите название документа: ");
//        String path = input.nextLine();
//        if (path.endsWith(".jpg") || path.endsWith(".jpeg") || path.endsWith(".png")) {
//            System.out.println("Это изображение.");
//        } else if (path.endsWith(".html")) {
//            System.out.println("Это HTML - страница.");
//        } else if (path.endsWith(".doc") || path.endsWith(".docx")) {
//            System.out.println("Это документ Word.");
//        } else System.out.println("Неизвестный формат.");


//        String s = "I learning Java";
//        int n;
//        n = s.codePointAt(1); // метод .codePointAt показывает код числом (по индексу 0 лежит буква I, у нее код 73
//        n = s.codePointBefore(3); // .codePointBefore берет предыдущий индекс (запросили 3) выведет индекс 2 (буква l)
//        System.out.println(n);


//        String s;
//        // double d = 3.8514;
//        // int d = -35478;
//        // char d = '+';
//        boolean d = true;
//        s = String.valueOf(d); // .valueOf метод преобразует число в строку
//        System.out.println(s);


        // Равна ли одна строка другой.

        String str = "1";
//        System.out.println("1 > 5 : " + str.compareTo("5")); // .compareTo 1 > 5 : -4
//        System.out.println("1 == 5 : " + str.compareTo("1")); // .compareTo 1 == 5 : 0
//        str = "7";
//        System.out.println("7 > 5 : " + str.compareTo("5")); // .compareTo 7 > 5 : 2

//        String str = "a";
//        System.out.println("a > d : " + str.compareTo("d")); // .compareTo a > d : -3
//        System.out.println("a == a : " + str.compareTo("a")); // .compareTo a == a : 0
//        str = "t";
//        System.out.println("7 > t : " + str.compareTo("d")); // .compareTo 7 > t : 16
//
//        // Метод сравнивает по кодировке (цифры в таблице) до ПЕРВОГО несовпадения кодов.
//
//        str = "Привет";
//        // System.out.println("Привет > привет : " + str.compareTo("привет")); // Привет > привет : -32
//
//        System.out.println("Привет > привет : " + str.compareToIgnoreCase("привет")); // Привет > привет : 0


        // Ищем слово в строке и заменяем его другим 11 23 44 55 23 22

        String a = "11 23 44 55 23 22";
        String b = "23";
        String c = "!!!";
        if (a.contains(b)) { // в переменной "а" при помощи метода .contains нашли то что лежит в переменной "b".
            a = a.replace(b, c); // перезаписали "a" при помощи метода .replace из "c" в "b"
        }
        System.out.println(a);


    }
}
