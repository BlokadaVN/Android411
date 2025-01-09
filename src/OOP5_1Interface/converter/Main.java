package OOP5_1Interface.converter;

public class Main {
    public static void main(String[] args) {

        double temperature = 21.5;
        final int N = 3; // Это константа.
        Converter converter[] = new Converter[N];
        converter[0] = new Celsius();
        converter[1] = new Kelvin();
        converter[2] = new Fahrenheit();

        for (Converter c : converter) {
            System.out.println("t = " + c.getConvertedValue(temperature));
        }
    }
}

interface Converter {

    double getConvertedValue(double baseValue);
}

class Celsius implements Converter {

    @Override
    public double getConvertedValue(double baseValue) {
        return baseValue;
    }
}

class Kelvin implements Converter {

    @Override
    public double getConvertedValue(double baseValue) {
        return baseValue + 273.15;
    }
}

class Fahrenheit implements Converter {

    @Override
    public double getConvertedValue(double baseValue) {
        return 1.8 * baseValue + 32;
    }
}