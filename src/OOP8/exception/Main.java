package OOP8.exception;

public class Main {
    public static void main(String[] args) throws NegativeWightException {
        Square square = new Square(10);
        square.setWight(-2);

        System.out.println("Ширина квадрата: " + square.getWight());
        System.out.println("Площадь: " + square.calculateArea(square.getWight()));
    }
}

class NegativeWightException extends Exception {
    public NegativeWightException(String message) {
        super(message);
    }
}

class Square {
    private int wight;

    public Square(int wight) {
        this.wight = wight;
    }

    public int getWight() {
        return wight;
    }

    public void setWight(int wight) {
        this.wight = wight;
    }

    public int calculateArea(int wight) throws NegativeWightException {
        if (wight >= 0) {
            return wight * wight;
        } else {
            throw new NegativeWightException("Ширина квадрата: " + wight + ". Значение не может быть отрицательным!");
        }
    }
}