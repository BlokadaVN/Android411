package lesson15;

public class Main {
    public static void main(String[] args) {

        // ДЗ по рекурсии разбор

        int[] arr = {-2, 3, 8, -11, -4, 6};
        System.out.print("n = " + calcNegativeNumbers(arr, 0));
    }

    public static int calcNegativeNumbers(int[] numbers, int index) {
        if (index == numbers.length) {
            return 0;
        }
        return (numbers[index] < 0 ? 1 : 0) + calcNegativeNumbers(numbers, index + 1);
    }
}
