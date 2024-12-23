package OOP3_1.Shapes;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20, "Green");

        System.out.println("Ширина: " + rectangle.getWidth() + "\n" + "Высота: " + rectangle.getHeight() + "\n" + "Цвет: " + rectangle.getColor());
        System.out.println("Площадь: " + rectangle.area());
    }
}
