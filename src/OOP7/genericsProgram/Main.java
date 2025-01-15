package OOP7.genericsProgram;

public class Main {
    public static void main(String[] args) {
        Rectangle[] mas1 = new Rectangle[3];
        mas1[0] = new Rectangle(1, 1);
        mas1[1] = new Rectangle(10, 10);
        mas1[2] = new Rectangle(5, 5);
        FigureStatistics<Rectangle> rs = new FigureStatistics<>(mas1);
        System.out.println("=== Прямоугольник ===\nСумарная площадь: " + rs.getSumArea() + "\nМаксимальная площадь: " + rs.getMaxArea() + "\nМинимальная площадь: " + rs.getMinArea());
        System.out.println();

        Circle[] mas2 = new Circle[5];
        mas2[0] = new Circle(1);
        mas2[1] = new Circle(10);
        mas2[2] = new Circle(4);
        mas2[3] = new Circle(100);
        mas2[4] = new Circle(0.1);
        FigureStatistics<Circle> cs = new FigureStatistics<>(mas2);
        System.out.println("=== Круги ===\nСумарная площадь: " + cs.getSumArea() + "\nМаксимальная площадь: " + cs.getMaxArea() + "\nМинимальная площадь: " + cs.getMinArea());
    }
}
