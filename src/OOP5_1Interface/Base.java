package OOP5_1Interface;

public class Base {
    public static void main(String[] args) {

        Shape[] geom = new Shape[3];
        geom[0] = new Line(5, "red", 1, 2, 3, 4);
        geom[1] = new Rectangle(2, "yellow", 5, 10);
        geom[2] = new Triangle(3, "green", 4, 10);

//        for (Shape shape : geom) {
//            shape.draw();
//            if (shape instanceof MathShape) {
//                double s = ((MathShape) shape).getSquare(); //  Из интерфейса вызвали метод .getSquare()
//                System.out.println("Площадь: " + s);
//            }
//        }
//        System.out.println(geom[1] instanceof MathShape);

        Shape g = new Rectangle(2, "yellow", 5, 10);
        g.draw();

        MathShape q1 = new Rectangle(2, "yellow", 5, 10);
        q1.getSquare();
        System.out.println(q1.getSquare());
    }
}
