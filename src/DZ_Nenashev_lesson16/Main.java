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
        st = st.replace(a, b);
        for (int i = st.length() - 1; i >= 0; i--) {
            st1 += st.charAt(i);
        }
        System.out.print(st2 + " : " + st.equalsIgnoreCase(st1));
    }
}
