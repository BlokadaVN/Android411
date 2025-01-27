package OOP10Lambda.func;

import java.util.function.Function;

public class Function1 {
    public static void main(String[] args) {
        Function<Integer, String> covert = x -> String.valueOf(x) + " долларов.";
        System.out.println(covert.apply(5)); // Передаем число и строку, возвращаем строковое значение.

        Function<Double, Long> function = d -> Math.round(d);
        System.out.println(function.apply(5.6));
    }
}
