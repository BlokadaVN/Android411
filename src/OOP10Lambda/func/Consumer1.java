package OOP10Lambda.func;

import java.util.function.Consumer;

public class Consumer1 {
    public static void main(String[] args) {
        Consumer<Integer> printer = x -> System.out.println(x + " рублей.");
        printer.accept(15);

        Consumer<String > printUp = string -> System.out.println(string.toUpperCase());
        printUp.accept("машина");
    }
}
