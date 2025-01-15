package DZoop7_Nenashev;

public enum Speed {
    CAR("Car",65), TRUCK("Truck",55), AIRPLANE("Airplane",600), TRAIN("Train",70), BOAT("Boat",22);

    String n;
    int s;

    Speed(String n, int s) {
        this.n = n;
        this.s = s;
    }

    public int getS() {
        return s;
    }

    @Override
    public String toString() {
        return n;
    }
}
