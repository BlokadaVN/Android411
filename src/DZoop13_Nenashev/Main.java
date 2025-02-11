package DZoop13_Nenashev;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Введите пять цифр: ");

        for (int i = 0; i < 5; i++) {
            System.out.print("-> ");
            int num = input.nextInt();
            treeSet.add(num);
        }
        System.out.println("Наименьший элемент в TreeSet -> " + treeSet.getFirst());
    }
}
