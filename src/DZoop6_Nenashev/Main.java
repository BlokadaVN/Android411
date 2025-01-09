package DZoop6_Nenashev;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(100, 150);
        System.out.println();

        System.out.print("Ширина: " + rectangle.getW() + " Высота: " + rectangle.getH());
        System.out.println();
        System.out.print("Ширина: " + rectangle.resizeWidth(250) + " Высота: " + rectangle.resizeHeight(300));
    }
}
