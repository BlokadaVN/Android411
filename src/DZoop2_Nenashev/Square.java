package DZoop2_Nenashev;

public class Square {

    //   public static int ger ()

    public static double osn(int a, int b) {
        double p = (a * b) / 2.;
        count++;
        return p;
    }

    public static int sqr(int a) {
        int p = a * a;
        count++;
        return p;
    }

    public static int pr(int a, int b) {
        int p = a * b;
        count++;
        return p;
    }

    private static int count;

    public static int getCount() {
        return count;
    }
}
