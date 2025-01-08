package DZoop5_Nenashev;

public class Pyramid extends Figure {

    private String name;
    private int area;
    private int height;

    public Pyramid(String name, double volume, int area, int height) {
        super(volume);
        this.name = name;
        this.area = area;
        this.height = height;
    }

    @Override
    public double volume() {
        return (area / 3) * area * height;
    }

    @Override
    public void info() {
        System.out.printf("Фигура: %s  |   Объем фигуры: %.2f%n", name, volume());
    }
}
