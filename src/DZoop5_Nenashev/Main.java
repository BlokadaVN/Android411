package DZoop5_Nenashev;

public class Main {
    public static void main(String[] args) {

        Figure[] f = new Figure[3];
        f[0] = new Ball("Шар", 7);
        f[1] = new Cylinder("Цилиндр", 3, 7);
        f[2] = new Pyramid("Пирамида", 20, 14, 10);

        for (Figure fg : f) {
            fg.info();
        }
    }
}
