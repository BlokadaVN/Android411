package DZoop12_Nenashev;

import java.util.LinkedList;
import java.util.ListIterator;

public class Rainbow {
    public static void main(String[] args) {

        LinkedList<Color> colors = getColors();
        System.out.println("Список: " + colors);
        System.out.println();

        ListIterator<Color> cL = colors.listIterator();
        System.out.println("Список итераторов в прямом направлении:");
        while (cL.hasNext()) {
            System.out.println("Индекс = " + cL.nextIndex() + ", Элемент = " + cL.next());
        }
        System.out.println();

        System.out.println("Список итераторов в обратном направлении:");
        while (cL.hasPrevious()) {
            System.out.println("Индекс = " + cL.previousIndex() + ", Элемент = " + cL.previous());
        }

    }

    private static LinkedList<Color> getColors() {
        Color c1 = new Color("Красный");
        Color c2 = new Color("Оранжевый");
        Color c3 = new Color("Желтый");
        Color c4 = new Color("Зеленый");
        Color c5 = new Color("Голубой");
        Color c6 = new Color("Синий");
        Color c7 = new Color("Фиолетовый");

        LinkedList<Color> colors = new LinkedList<>();
        colors.add(c1);
        colors.add(c2);
        colors.add(c3);
        colors.add(c4);
        colors.add(c5);
        colors.add(c6);
        colors.add(c7);
        return colors;
    }
}

class Color {
    String color;

    public Color(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color;
    }
}