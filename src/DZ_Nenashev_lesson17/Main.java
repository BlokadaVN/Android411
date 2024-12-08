package DZ_Nenashev_lesson17;

public class Main {
    public static void main(String[] args) {
//
//        // Текст с повторяющимися символами
//        // Текстповряющимла


        String s = "Текст с повторяющимися символами";
        System.out.println("Исходная строка: " + s);

        s = s.replace(" ", "");

        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < s.length(); i++) {

            if (sb.indexOf(String.valueOf(s.charAt(i))) == -1) { // в цикле перебрали строку и при помощи .valueOf преобразовали символы в строку.

                sb.append(s.charAt(i));
            }
        }
        System.out.println("Отредактированная строка: " + sb);
    }
}




