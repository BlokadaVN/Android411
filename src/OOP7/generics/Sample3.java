package OOP7.generics;

public class Sample3 {
    public static void main(String[] args) {
        Point2<Integer> pt = new Point2<>(1, 2);
        Point2<Double> pt2 = new Point2<>(1.6, 2.8);

        System.out.println(pt.getMax());
        System.out.println(pt2.getMax());
    }
}

class Point2<T extends Number> {
    public T x, y;

    public Point2(T x, T y) {
        this.x = x;
        this.y = y;
    }

    double getMax() {
        double xd = x.doubleValue();
        double yd = y.doubleValue();

        return (xd < yd) ? xd : yd;
    }
}