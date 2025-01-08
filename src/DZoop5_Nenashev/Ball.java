package DZoop5_Nenashev;

public class Ball extends Figure {

    private String name;

    public Ball(String name, double volume) {
        super(volume);
        this.name = name;
    }

    @Override
    public double volume() {

        return (4 / 3) * Math.PI * Math.pow(getVolume(), 3);
    }

    @Override
    public void info() {
        System.out.printf("Фигура: %s       |   Объем фигуры: %.2f%n", name, volume());
    }
}
