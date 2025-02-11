package OOP11_Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSet2 {
    public static void main(String[] args) {

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();

        a.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        b.addAll(Arrays.asList(5, 6, 7, 8, 9));

        System.out.println(a);
        System.out.println(b);

        HashSet<Integer> union = new HashSet<>(a);
        System.out.println("union start = " + union);
        union.addAll(b); // Объединили два сета.
        System.out.println("union finish = " + union);

        HashSet<Integer> intersect = new HashSet<>(a);
        intersect.retainAll(b); // Находит одинаковые элементы в сетах.
        System.out.println(intersect);

        HashSet<Integer> subtract = new HashSet<>(a);
        subtract.removeAll(b); // Из первого сета вычитается второй. Остаются элементы первого сета.
        System.out.println(subtract);
    }
}