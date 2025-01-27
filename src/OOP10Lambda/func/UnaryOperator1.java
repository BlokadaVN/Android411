package OOP10Lambda.func;

import java.util.function.UnaryOperator;

public class UnaryOperator1 {
    public static void main(String[] args) {
        // UnaryOperator - принимает один тип данных и возвращает один тип.
        UnaryOperator<Integer> square = x -> x * x;
        System.out.println(square.apply(5));

        UnaryOperator<String> uo = s -> s.toUpperCase();
        System.out.println(uo.apply("Java code"));
    }
}
