package DZoop5_Nenashev;

public class Cylinder extends Figure {

    private String name;
    private int height;

    public Cylinder(String name, double volume, int height) {
        super(volume);
        this.name = name;
        this.height = height;
    }

    @Override
    public double volume() {
        return Math.PI * (getVolume() * getVolume()) * height;
    }

    @Override
    public void info() {

        System.out.printf("Фигура: %s   |   Объем фигуры: %.2f%n", name, volume());
    }
}
