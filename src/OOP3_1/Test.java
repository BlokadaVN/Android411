package OOP3_1;

public class Test {
    public static void main(String[] args) {
        Line l1 = new Line();
//        l1.color = "red";
//        l1.width = 5;
        l1.x1 = l1.y1 = 0;
        l1.x2 = l1.y2 = 10;
//        l1.showProp();
        l1.show();
        l1.showId();
    }
}

class Properties {
    int width;
    String color;
    protected int id = 1;

    public Properties() {
        System.out.println("Конструктор класса Properties.");
    }

    public Properties(int width, String color) {
        this.width = width;
        this.color = color;
        System.out.println("Конструктор класса с width и с color Properties.");
    }


    void show() {
        System.out.println("Ширина: " + width + "px, Цвет: " + color);
    }
}

class Line extends Properties {
    double x1, y1;
    double x2, y2;
    int id = 2;

    public Line() {
        super(10, "black"); // вызов конструктора из родительского класса. Если два и более конструкторов, то в скобках задаем параметры конструктора, который нужно вызвать.
        System.out.println("Конструктор класса Line.");
    }

    @Override
    void show() {
        super.show(); // вызов метода из родительского класса.
        System.out.println("Координаты линии - x1: " + x1 + ", x2: " + x2 + ", y1: " + y1 + ", y2: " + y2);
    }

    void showId() {

        System.out.println("id из дочернего класса = " + id + "\nid из родительского класса = " + super.id);
    }
}

class Triangle extends Properties {
    double x1, y1;
    double x2, y2;
    double x3, y3;
}