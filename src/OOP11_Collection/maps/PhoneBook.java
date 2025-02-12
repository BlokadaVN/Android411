package OOP11_Collection.maps;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();
        addNumber("Зотов", 778899, phoneBook);
        addNumber("Зотов", 112233, phoneBook);
        addNumber("Калинкин", 449988, phoneBook);
        addNumber("Романов", 889922, phoneBook);
        addNumber("Зотов", 445577, phoneBook);
        addNumber("Калинкин", 116655, phoneBook);
        printBook(phoneBook);
    }

    public static void addNumber(String key, int value, HashMap<String, ArrayList<Integer>> map) {
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }

    public static void printBook(HashMap<String, ArrayList<Integer>> map) {
        for (var item : map.entrySet()) { // var - независимая переменная, что пришло, то и пришло.
            String phones = "";
            int a = 0;
            for (int el : item.getValue()) {
                phones = phones + el + (item.getValue().size() - 1 == a ? "" : ", "); // Убрали запятую в конце строки.
                a++;
            }
            System.out.printf("%s: %s%n", item.getKey(), phones);
        }
    }
}
