package OOP11_Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSet4 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 2, 7, 8, 6, 8, 9};
        System.out.println("Исходный массив: " + Arrays.toString(arr));

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println(set);

        int[] arr1 = new int[set.size()];
        int a = 0;
        for (int num : set) {
            arr1[a++] = num;
        }
        System.out.println("Массив без дубликатов: " + Arrays.toString(arr1));
    }
}
