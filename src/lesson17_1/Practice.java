package lesson17_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Practice {
    public static void main(String[] args) {

        try { // try - что - то типа отладчика. Окружаем в скобки код с ошибкой и с помощью catch (код ниже) смотрим описание и т.д.

            String s = "Час в 24-часовом формате от 00 до 23. 2021-06-15Т21:45. Минуты, в диапазоне от 00 до 59. 2021-06-15Т01:09.";
            String pattern = "[0-2][0-9]:[0-5][0-9";

            Pattern regex = Pattern.compile(pattern);
            Matcher matcher = regex.matcher(s);

            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        } catch (PatternSyntaxException e) {
            System.out.println("Не правильное регулярное выражение: " + e.getMessage()); // Выводит полное описание ошибки.
            System.out.println("Описание: " + e.getDescription()); // Выводит конкретное пояснение ошибки.
            System.out.println("Позиция: " + e.getIndex()); // Выводит индекс ошибки.
            System.out.println("Не правильный шаблон: " + e.getPattern()); // Выводит шаблон в котором ошибка.
        }
    }
}
