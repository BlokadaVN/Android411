package OOP5.shaps;

public class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle(int width, int height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();
    }

    @Override
    public void info() {
        System.out.println("=== Прямоугольник ===\nШирина: " + width + "\nВысота: " + height + "\nЦвет: " + getColor() + "\nПлощадь: " + getArea() + "\nПериметр: " + getPerimeter() + "\n");
        draw();
    }

    @Override
    public double getPerimeter() {
        return (width + height) * 2;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
