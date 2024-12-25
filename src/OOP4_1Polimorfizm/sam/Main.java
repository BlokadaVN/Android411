package OOP4_1Polimorfizm.sam;

public class Main {
    public static void main(String[] args) {

        // ПЕРЕОПРЕДЕЛЕНИЕ МЕТОДОВ С КОНСТРУКТОРАМИ!!!!!!!

        Color c = new Color(200, 400, "Yellow");
        c.show();
        Border b = new Border(400, 600, "1px solid red");
        b.show();
    }
}

class Rectangle {
    private int h;
    private int v;

    public Rectangle(int h, int v) {
        this.h = h;
        this.v = v;
    }

    public void show() {
        System.out.printf("\n\n***Прямоугольник***\nШирина: %s\nВысота: %s", h, v);
    }
}

class Color extends Rectangle {
    private String color;

    public Color(int h, int v, String color) {
        super(h, v);
        this.color = color;
    }

    @Override
    public void show() {
        super.show();
        System.out.printf("\nЦвет: %s", color);
    }
}

class Border extends Rectangle {
    private String border;

    public Border(int h, int v, String border) {
        super(h, v);
        this.border = border;
    }

    @Override
    public void show() {
        super.show();
        System.out.printf("\nРамка: %s", border);
    }
}