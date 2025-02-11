package OOP11_Collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
        Set<Integer> tree = new TreeSet<>();
        tree.add(1);
        tree.add(6);
        tree.add(3);
        tree.add(4);
        tree.add(8);
        tree.add(2);
        System.out.println(tree);
        tree.remove(6);
        System.out.println(tree);
        System.out.println(tree.contains(1));
        System.out.println(tree.contains(9));
    }
}
