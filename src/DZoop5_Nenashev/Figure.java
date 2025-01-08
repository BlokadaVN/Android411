package DZoop5_Nenashev;

public abstract class Figure {

    private double volume;

    public Figure(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public abstract double volume();

    public abstract void info();
}
