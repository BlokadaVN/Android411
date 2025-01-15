package OOP7.genericsProgram;

//public class Rectangle extends Figure {

public class Rectangle implements Figure {
    private double wight;
    private double height;

    public Rectangle(double wight, double height) {
        this.wight = wight;
        this.height = height;
    }

    @Override
    public double getArea() {
        return wight * height;
    }
}
