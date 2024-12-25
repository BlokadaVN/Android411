package DZoop3_Nenashev;

public class Main {
    public static void main(String[] args) {

        Box3D box = new Box3D(5f, 3f, 2f);
        Box3D box1 = new Box3D(10f, 5f, 7f);
//        box.setWidth(0);
//        box.setHeight(0);
//        box.setDepth(0);

        System.out.println("Объект Box3D: {" + " ширина " + box.getWidth() + " высота " + box.getHeight() + " глубина " + box.getDepth() + "}");
        System.out.println("Объем: " + box.area());
        System.out.println("Новые значения:");
        System.out.println("Объект Box3D: {" + " ширина " + box1.getWidth() + " высота " + box1.getHeight() + " глубина " + box1.getDepth() + "}");
        System.out.println("Объем: " + box1.area());
    }
}
