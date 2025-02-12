package DZoop15_Nenashev;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        Map<String, Integer> hashMapOld = new HashMap<>(); // Не работает.
        Map<String, String> hashMapOld = new HashMap<>();
        hashMapOld.put("X", "1");
        hashMapOld.put("Y", "2");
        hashMapOld.put("Z", "3");
        Map<String, String> hashMapNew = new HashMap<>();

        for (var entry : hashMapOld.entrySet()) {
            hashMapNew.put(entry.getValue(), entry.getKey());
        }

        System.out.println("Исходный Map: " + hashMapOld);
        System.out.println("Измененный Map: " + hashMapNew);
    }
}
