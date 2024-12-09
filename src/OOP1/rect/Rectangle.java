package OOP1.rect;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int length) {
        if (length > 0)
            this.length = length;
    }

    public void setWidth(int width) {
        if (width > 0)
            this.width = width;
    }

    public int getArea() {
        return length * width;
    }

    public int getPerimeter() {
        return 2 * (length + width);
    }

    public double getHypotenuse() {
        return Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
    }

    public void cycle() {

        for (int i = 0; i <= length - 1; i++) {
            System.out.print("*");
            for (int j = 0; j < width - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
