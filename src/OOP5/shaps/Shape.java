package OOP5.shaps;

public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract void info();

    public abstract void draw();
}
