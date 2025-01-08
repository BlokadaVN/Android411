package OOP5_1Interface;

interface MathShape {

    double getSquare();
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

class Line extends Shape {
    private int x1, x2, y1, y2;

    public Line(int wight, String color, int x1, int x2, int y1, int y2) {
        super(wight, color);
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
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