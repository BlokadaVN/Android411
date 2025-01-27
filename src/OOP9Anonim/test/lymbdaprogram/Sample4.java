package OOP9Anonim.test.lymbdaprogram;

// Лямбда выражение в качестве аргумента методу.
interface StringFunc { // 1:35:20
    String func(String n);
}

public class Sample4 {
    public static void main(String[] args) {
        String inStr = "Лямбда выражения в Java.";
        System.out.println("Это исходная строка - " + inStr);

        String outStr = stringOp(str -> str.toUpperCase(), inStr);
        System.out.println("Это строка в верхнем регистре - " + outStr);

        StringFunc revers = (str) -> { // Лекция 30. 1:53:20
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };
        System.out.println("Это развернутая строка - " + stringOp(revers, inStr));
    }

    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }
}
