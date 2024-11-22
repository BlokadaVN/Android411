package lesson13;

public class Main {
    public static void main(String[] args) {


        // РЕКУРСИЯ (расшифровка: рекурсия - это когда метод может вызывать сам себя) продолжение.

        // Сумма элементов массива БЕЗ РЕКУСИИ
//
        int[] mas = {1, 3, 5, 7, 9};
////        System.out.println(sumList( mas));  // БЕЗ РЕКУСИИ
        System.out.println(sumList(0, mas));


        // конвертация числа в строку

//        System.out.println(toStr(18, 2));



    }


    public static String toStr(int n, int base) {

        String[] convert = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
        if (n < base) { // 254 < 10
            return convert[n];
        } else
            return toStr(n / base, base) + convert[n % base]; // toStr(254 / 10, 10) + convert [254 % 10] => convert [4] => "4"
    }




    // с рекурсией int[] mas = {1, 3, 5, 7, 9};

    public static int sumList(int i, int[] arr) {
        if (i == arr.length - 1) {
            return arr[i];
        }
        return arr[i] + sumList(i + 1, arr);
    }


    // Без рекусии.
//    public static int sumList(int[] arr)   // arr = {1, 3, 5, 7, 9} arr - название массива в методе (можно называть и mas)
//    {
//        int sum = 0; // переменная, куда будет сохраняться сумма массива.
//        for (int i : arr) {
//            sum += i;
//        }
//        return sum;
//    }


}
