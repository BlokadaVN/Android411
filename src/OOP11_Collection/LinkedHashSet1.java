package OOP11_Collection;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(7);
        lhs.add(4);
        lhs.add(1);
        lhs.add(8);
        lhs.add(0);
        lhs.add(3);
        lhs.add(5);
        System.out.println(lhs); // Выводит все так, как ему написали.
        lhs.remove(0);
        System.out.println(lhs);
        System.out.println(lhs.contains(0));
        System.out.println(lhs.contains(3));
        System.out.println(lhs.removeIf(x -> x > 5)); // Удаляет все, что больше 5.
        System.out.println(lhs);
    }
}
