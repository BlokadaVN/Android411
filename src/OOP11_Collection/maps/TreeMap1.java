package OOP11_Collection.maps;

import java.util.TreeMap;

public class TreeMap1 {
    public static void main(String[] args) {
//        TreeMap<String,String> fileExtension = new TreeMap<>((o1, o2) -> {
//            return o1.compareTo(o2); // Сортировка.

        TreeMap<String, String> fileExtension = new TreeMap<>(String.CASE_INSENSITIVE_ORDER); // Перевели в верхний регистр.

        fileExtension.put("Python", "*.py");
        fileExtension.put("C++", "*.cpp");
        fileExtension.put("JavaScript", "*.js");
        fileExtension.put("Goland", "*.jo");
        fileExtension.put("Java", "*.java");
        fileExtension.put("java", "*.java");

        System.out.println(fileExtension);
        System.out.println(fileExtension.get("java"));
        fileExtension.remove("Goland");
        System.out.println(fileExtension);
        System.out.println(fileExtension.descendingMap()); // Развернуть в обратном направлении.
        System.out.println(fileExtension.lastEntry());
        System.out.println(fileExtension.firstEntry());
    }
}
