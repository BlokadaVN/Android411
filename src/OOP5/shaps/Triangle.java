package OOP5.shaps;

public class Triangle extends Shape {

    private int side;

    public Triangle(int side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return (Math.sqrt(3) * side * side) / 4;
    }

    @Override
    public double getPerimeter() {
        return side + side + side;
    }

    @Override
    public void info() {
        System.out.println("=== Треугольник ===\nСторона: " + side + "\nЦвет: " + getColor() + "\nПлощадь: " + (int) getArea() + "\nПериметр: " + getPerimeter() + "\n");
        draw();
    }

    @Override
    public void draw() { // Цикл треугольник из звездочек.
        int copy = side;
        for (int i = 0; i <= side; i++) {
            for (int j = 0; j < copy; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" *  ");
            }
            System.out.println();
            copy--;
        }
    }
}
