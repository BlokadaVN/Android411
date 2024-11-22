package DZ_Nenashev_lesson12;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        char a = '=';
        char b = 47;   // 47 - /
        char c = 92;   //92 - \
        // что бы вывести символ \/ , нужно экранизировать бек слеш (поставить \\/)
        ciOne(n, a);
        ciTwo(n, c, b, a);
        ciOne(n, a);
    }

    public static void ciOne(int n, char a) {

        for (int i = 0; i < n * 2; i++) {
            System.out.print(a);
        }
        System.out.println();
    }

    public static void ciTwo(int n, char c, char b, char a) {

        for (int i = 0; i < n - 2; i++) {
            System.out.print(a);
            for (int k = 0; k < n - 1; k++) {
                System.out.print(c + "" + b);
            }
            if (i <= n) {
                System.out.print(a);
            }
            System.out.println();
        }
    }
}


