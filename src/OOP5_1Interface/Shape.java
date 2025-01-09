package OOP5_1Interface;

interface Geom {
    int MIN_COORDINATE = 0; // Константа.
    int MAX_COORDINATE = 1000; // Константа.

    static void showInterval() { // Статический метод.
        System.out.println("[" + MIN_COORDINATE + "; " + MAX_COORDINATE + "]");
    }
}

class InterfaceGroup {
    private interface Interface1 {
        void interface_1();

        private void privateMethod() {
            System.out.println("Приватный метод."); // Приватный метод в интерфейсе обязательно должен быть реализован.
        }
    }

    interface Interface2 extends Interface1 {
        void interface_2();
    }
}

class RealiseInterface implements InterfaceGroup.Interface2 {

    @Override
    public void interface_2() {

    }

    @Override
    public void interface_1() {

    }
}

interface MathShape {

    double getSquare();

    default double getPer(){
        return 0; // Метод с реализацией по умолчанию.
    }
}

abstract class Geom1 implements MathShape {
    int width, color;
    abstract void draw();
}



abstract class Shape {

    private int wight;
    private String color;

    public Shape(int wight, String color) {
        this.wight = wight;
        this.color = color;
    }

    abstract void draw();
}

class Line extends Shape implements Geom {
    private int x1, x2, y1, y2;

    public Line(int wight, String color, int x1, int x2, int y1, int y2) {
        super(wight, color);
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    private boolean isCheck(int value) {
        return MIN_COORDINATE <= value && value <= MAX_COORDINATE;
    }

    public void setCOORDINATE(int x1, int x2, int y1, int y2) {
        if (isCheck(x1) && isCheck(y1) && isCheck(x2) && isCheck(y2)) {
            this.x1 = x1;
            this.x2 = x2;
            this.y1 = y1;
            this.y2 = y2;
        }
    }

    @Override
    public String toString() {
        return "Координаты линии: " +
                "x1 = " + x1 +
                ", x2 = " + x2 +
                ", y1 = " + y1 +
                ", y2 = " + y2;
    }

    @Override
    void draw() {
        System.out.println("Рисуем линию.");
    }
}

class Rectangle extends Shape implements MathShape {

    private int width;
    private int height;

    public Rectangle(int wight, String color, int width, int height) {
        super(wight, color);
        this.width = width;
        this.height = height;
    }

    @Override
    void draw() {
        System.out.println("Рисуем прямоугольник.");
    }

    @Override // Переопределенный метод из интерфейса.
    public double getSquare() {
        return width * height;
    }
}

class Triangle extends Shape implements MathShape {

    private int length;
    private int height;

    public Triangle(int wight, String color, int length, int height) {
        super(wight, color);
        this.length = length;
        this.height = height;
    }

    @Override
    void draw() {
        System.out.println("Рисуем треугольник.");
    }

    @Override
    public double getSquare() {
        return 0.5 * length * height;
    }
}