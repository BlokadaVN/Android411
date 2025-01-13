package OOP7.enums;

import java.util.regex.Pattern;

public class Base {
    public static void main(String[] args) {

        System.out.println(RegEx.UPPER.test("ABC"));
        System.out.println(RegEx.NUMERIC.test("+79967007227"));
        System.out.println(RegEx.LOWER.test("abc"));
    }
}

enum RegEx {

    // Регулярное выражение в enum.
    UPPER("[A-Z]+"),
    LOWER("[a-z]+"),
    NUMERIC("[+-]?\\d+");

    private final Pattern pattern;

    RegEx(final String pattern) {
        this.pattern = Pattern.compile(pattern); // Сюда приходит String pattern и Pattern.compile(pattern) компилирует строку в шаблон РВ.

    }

    public boolean test(final String input) {
        return pattern.matcher(input).matches();
    }
}