package DZ_Nenashev_lesson19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {


        String s = " +7 499 456-45-48, 8 (499) 456 45-48, +74994564548, 7 (499) 456 45 48, 8 (499) 456 45 48, 7 (499) 456-45-48";
        String pattern = "[+]?7\\s*\\(?\\d{3}\\)?[ -]?\\d{3,}([ -]?\\d{2}){2}";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(s);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
