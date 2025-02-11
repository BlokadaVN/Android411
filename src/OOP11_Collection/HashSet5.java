package OOP11_Collection;

import java.util.*;

public class HashSet5 {
    public static void main(String[] args) {
        try {
            List<Integer> num1 = readNumbers();
            checkDuplicates(num1);
        } catch (Duplicate_Number_Exception d) {
            System.out.println("Ошибка! " + d.getMessage());
        }
    }

    public static List<Integer> readNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.print("Кол-во чисел: ");
        int count = input.nextInt();
        System.out.println("Введите целые числа: ");
        for (int i = 0; i < count; i++) {
            System.out.print("->");
            int num = input.nextInt();
            numbers.add(num);
        }
        return numbers;
    }

    public static void checkDuplicates(List<Integer> numbers) throws Duplicate_Number_Exception {
        Set<Integer> unique = new HashSet<>();
        for (int num : numbers) {
            if (unique.contains(num)) {
                throw new Duplicate_Number_Exception("Обнаружен повторяющийся номер -> " + num);
            }
            unique.add(num);
        }
    }
}

class Duplicate_Number_Exception extends Exception {
    public Duplicate_Number_Exception(String message) {
        super(message);
    }
}