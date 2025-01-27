package OOP10Lambda.func;

import java.util.Scanner;
import java.util.function.Supplier;

public class Supplier1 {
    public static void main(String[] args) {
//        String t = "One";
//        Supplier<String> supplier = () -> t.toUpperCase();
//        System.out.println(supplier.get());

        Supplier<User> userSupplier = () -> {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите имя: ");
            String name = input.nextLine();
            return new User(name);
        };
        User user1 = userSupplier.get();
        User user2 = userSupplier.get();
        System.out.println("Имя пользователя 1: " + user1.getName());
        System.out.println("Имя пользователя 2: " + user2.getName());
    }
}

class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}