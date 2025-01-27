package OOP10Lambda.func;

import java.util.function.BinaryOperator;

public class BinaryOperator1 {
    public static void main(String[] args) {
        BinaryOperator<Integer> mul = (x, y) -> x * y;
        System.out.println(mul.apply(3, 2));
        System.out.println(mul.apply(5, -2));
    }
}
