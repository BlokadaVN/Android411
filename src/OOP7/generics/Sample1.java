package OOP7.generics;

public class Sample1 {
    public static void main(String[] args) {
        Point<Integer, String> pt = new Point<>(1, 2, "point1");
//        pt.x = 10;
//        pt.y = 20;
        System.out.println(pt.getX() + " " + pt.getY() + " " + pt.getId());

        Point<Double, Integer> pt1 = new Point<>(15.7, 6.5, 1);
//        pt1.x = 15.2;
//        pt1.y = 17.6;
        System.out.println(pt1.getX() + " " + pt1.getY() + " " + pt1.getId());
    }
}

class Point<T, V> {
    private V id;
    private T x, y;

    public Point(T x, T y, V id) {
        this.x = x;
        this.y = y;
        this.id = id;
    }

    public V getId() {
        return id;
    }

    public T getX() {
        return x;
    }

    public T getY() {
        return y;
    }
}