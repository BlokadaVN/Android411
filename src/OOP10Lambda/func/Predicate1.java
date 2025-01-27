package OOP10Lambda.func;

import java.util.function.Predicate;

public class Predicate1 {
    public static void main(String[] args) {
//        Predicate<Integer> isPositive = x -> x > 0; // Predicate - встроенный интерфейс в Java.
//        System.out.println(isPositive.test(5));

        Predicate<String> isPalindrome = str -> {
            String reversed = new StringBuilder(str).reverse().toString();
            return str.equals(reversed);  // .equals - метод сравнивает строки.
//            return str.isEmpty();
        };

        String w1 = "Мадам";
        boolean res = isPalindrome.test(w1);
        System.out.println(w1 + " это палиндром: " + res);

        String w2 = "радар";
        boolean res1 = isPalindrome.test(w2);
        System.out.println(w2 + " это палиндром: " + res1);


//        Predicate<Integer> isSimple = num -> { // 1:20:00
//            if (num < 2) return false;
//            for (int i = 2; i < num; i++) {
//                System.out.println("i = " + i);
//                if (num % i == 0) {
//                    return false;
//                }
//            }
//            return true;
//        };
//        System.out.println("Число простое: " + isSimple.test(7));
//        System.out.println("Число простое: " + isSimple.test(12));
    }
}
