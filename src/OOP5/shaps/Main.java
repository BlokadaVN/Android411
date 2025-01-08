package OOP5.shaps;

public class Main {
    public static void main(String[] args) {

        // Вывод информации из дочерних классов (ПОЛИМОРФИЗМ).

        Shape[] shapes = new Shape[3];
        shapes[0] = new Square(3, "red");
        shapes[1] = new Rectangle(7, 4, "blue");
        shapes[2] = new Triangle(5, "yellow");

        for (Shape shape : shapes) {
            shape.info();
        }


//        Square square = new Square(3, "red");
//        square.info();
////        square.draw();
//
//        Rectangle rectangle = new Rectangle(7, 4, "blue");
//        rectangle.info();
//
//        Triangle triangle = new Triangle(5, "yellow");
//        triangle.info();
    }
}
