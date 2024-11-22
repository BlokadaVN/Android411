package DZ_Nenashev_lesson13;

public class Main {
    public static void main(String[] args) {
        int[] mas = {-2, 3, 8, -11, -4, 6};
        int a = 0;
        met(mas, a);
        System.out.print("n = " + met(mas, a));
    }

    public static int met(int[] m, int n1) {
        if (n1 == m.length) {  //  n1 == a, m == mas[ ]
            return 0;
        }
//
        int sum;
        sum = met(m, n1 + 1); // m == mas[ ], n1 == a
        if (m[n1] < 0) { // n1 == [0] -> -2 ,n1 == [1] -> 3, n1 == [2] -> 8, n1 == [3] -> -11, n1 == [4] -> -4, n1 == [5] -> 6
            sum++;
        }
        return sum;
    }
}
