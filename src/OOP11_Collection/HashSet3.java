package OOP11_Collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HashSet3 {
    public static void main(String[] args) {

        // Найти в Сете максимальное число.

        Set<Integer> num = new HashSet<>();
        num.add(43);
        num.add(31);
        num.add(24);
        num.add(54);
        num.add(21);
        System.out.println(num);

        Integer max = null;
        for (Integer item : num) {
            if (max == null) {
                max = item;
            } else if (max < item) {
                max = item;
            }
        }
        System.out.println("Максимальное значение: " + max);

        System.out.println("Минимальное значение: " + Collections.min(num));
    }
}
