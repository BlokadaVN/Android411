package OOP11_Collection;

import java.util.Vector;

public class Vector1 {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Сергей");
        vector.add("Михаил");
        vector.add("Николай");
        vector.add("Виктор");
        System.out.println(vector);
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        vector.remove(2);
        System.out.println(vector);
        System.out.println(vector.get(1));
    }
}
