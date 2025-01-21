package DZoop9_Nenashev;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String st = input.nextLine();

        System.out.println();
        try {
            if (check(st)) {
                System.out.println("Исходная строка: " + st + "\nВ строке найдены гласные буквы!");
            } else {
                throw new Error("Исходная строка: " + st + "\nОшибка: Строка не содержит гласные буквы!");
            }
        } catch (Error e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean check(String st1) {

        st1 = st1.toLowerCase();
        String pattern = "[aeiоuy]+|[аеёийоуыэюя]+";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(st1);
        return matcher.find();
    }
}

class Error extends Exception {
    public Error(String message) {
        super(message);
    }
}