package DZ_Nenashev_lesson18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        // Здравствуйте! Надеюсь что сделал правильно. Ну или хоть чуть-чуть приближенно.

        String s = "123456@i.ru, 123_456@ru.name.ru, login@i.ru, логин-5@i.ru, login.3@i.ru, login.3-67@i.ru, 1login@ru.name.ru ";

       String pattern = "[\\wа-я\\.-]+@[a-z.]+\\.?\\w+\\.?\\w+"; //

        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(s);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
