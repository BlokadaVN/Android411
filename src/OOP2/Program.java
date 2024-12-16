package OOP2;

import static java.lang.System.*;

public class Program {
    public static void main(String[] args) {

        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        out.println(Point.getCount());
//        System.out.println(Point.getCount());
//        System.out.println(p1.count); // p1 - ЭКЗЕМПЛЯР класса, а Point - класс.

    }
}

// Статические и динамические свойства (переменные).

class Point {
    private static int count; // статическая переменная.
    int x;
    int y; //  динамические переменные.

    static {
        count = 10; // Статический инициализатор. Нужен если нужно изначально присвоить какое - то значение переменной count.
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        count++;
    }

    public static int getCount() {
        return count;
    }
}