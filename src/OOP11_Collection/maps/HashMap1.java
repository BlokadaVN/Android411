package OOP11_Collection.maps;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
    public static void main(String[] args) {
        Map<Integer,String > map1 = new HashMap<>();
        map1.put(334455,"Михаил Борисов");
        map1.put(778899,"Борис Михайлов");
        map1.put(443366,"Роман Петров");
        map1.put(225577,"Анна Полякова");
        map1.putIfAbsent(334455,"Ирина Мельник"); //  Одинаковый ключ, но не перезаписывает значение - map1.put(334455,"Михаил Борисов");
        System.out.println(map1);
        System.out.println(map1.get(225577));
        map1.remove(443366);
        System.out.println(map1);
        System.out.println(map1.containsValue("Роман Петров")); // Проверка есть ли этот элемент или нет.
        System.out.println(map1.containsKey(225577)); // Проверка есть ли такой ключ.
        System.out.println(map1.keySet()); // Проверка всех ключей.
        System.out.println(map1.values()); // Проверка всех значений.
    }
}
