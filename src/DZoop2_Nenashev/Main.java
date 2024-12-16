package DZoop2_Nenashev;

public class Main {
    public static void main(String[] args) {
        System.out.println("Площадь треугольника через основание и высоту: " + Square.osn(6, 7));
        System.out.println("Площадь квадрата: " + Square.sqr(7));
        System.out.println("Площадь прямоугольника: " + Square.pr(2, 6));
        System.out.println("Количество подсчетов площади: " + Square.getCount());
    }
}
