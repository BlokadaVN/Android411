package DZ_Nenashev_lesson15;

public class Main {
    public static void main(String[] args) {
        String s = "Hello, World!";
        System.out.println("Дана строка: " + s);

        int[] sm = new int['z' - 'a' + 1];
        int[] sb = new int['Z' - 'A' + 1];
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch > 'a' && ch < 'z') {
                sm[ch - 'a']++;
            }
            if (ch > 'A' && ch < 'Z') {
                sb[ch - 'A']++;
            }
        }
        System.out.println();
        for (int i = 0; i < sm.length; i++) {
            if (sm[i] >= 1) {
                sum += sm[i];
            }
            if (sb[i] >= 1) {
                sum1 += sb[i];
            }
        }
        System.out.print("Количество прописных букв - " + sum1 + "\n");
        System.out.print("Количество строчных букв - " + sum);

    }
}
