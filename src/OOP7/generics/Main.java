package OOP7.generics;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {2, 1, 5, 4, 3};
        Double[] doubleArray = {3.3, 2.2, 5.5, 7.7};
        Character[] characterArray = {'G', 'e', 'n', 'e', 'r', 'i', 'c'};
        printArray(intArray);
        printArray(doubleArray);
        printArray(characterArray);
    }

    public static <T> void printArray(T[] inputArray) { // <T> - обобщение массивов.
        for (T element : inputArray) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
