package Test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] mas = {-2, 3, 8, -11, -4, 6};
        int a = 0;
        met(mas, a);
        System.out.print("n = " + met(mas, a));

    }

    public static int met(int[] m, int n1) {
        if (n1 == m.length) {
            return 0;
        }
        int sum;
        sum = met(m, n1 + 1);
        if (m[n1] < 0) {
            sum++;
        }
        return sum;
    }
}
