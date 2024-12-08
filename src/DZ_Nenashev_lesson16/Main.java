package DZ_Nenashev_lesson16;

public class Main {
    public static void main(String[] args) {

        // ЛидерВенереневредил - лидервенеренеВредиЛ

        String st = "Лидер Венере не вредил";
        //   String st = "Могу добавить";
        //    String st = "Лазер резал";
        String st2 = st;
        String a = " ";
        String b = "";
        String st1 = "";
        st.contains(a);
        st = st.replace(a, b); // эта строка - мое решение
        //  st = st.replace(" ",""); // это как можно было сделать без переменных  String a = " "; String b = "";

        for (int i = st.length() - 1; i >= 0; i--) {
            st1 += st.charAt(i);
        }
        System.out.print(st2 + " : " + st.equalsIgnoreCase(st1));

        System.out.println();

        // Решение преподавателя.

        System.out.println(isPalindrome("Лидер Венере не вредил"));
        System.out.println(isPalindrome("hello"));
    }

    public static boolean isPalindrome(String str) {

        String result = "";
        str = str.toLowerCase().replace(" ", "");
        for (int i = 0; i < str.length(); i++) {
            result = str.charAt(i) + result; // в этом цикле развернули строку обратно/
        }
        System.out.println("Исходная строка: " + str);
        System.out.println("Развернутая строка: " + result);
        return str.equals(result) ? true : false;
    }
}
