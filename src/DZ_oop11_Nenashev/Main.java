package DZ_oop11_Nenashev;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

//        Predicate<String> sn = string -> string.isEmpty();
        Predicate<String> sn = String::isEmpty;

        String s1 = "";
        System.out.println("Строка 1 пустая: " + sn.test(s1));
        String s2 = "Строка содержит текст!";
        System.out.println("Строка 2: " + s2 + " " + sn.test(s2));
    }
}
