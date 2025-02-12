package OOP11_Collection.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap1 {
    public static void main(String[] args) {
        Map<Integer, String> lhm = new LinkedHashMap<>(16, 0.75f, true);
        lhm.put(1, "object1");
        lhm.put(15, "object15");
        lhm.put(4, "object4");
        lhm.put(38, "object38");

        System.out.println(lhm);
        System.out.println(lhm.get(4));
        System.out.println(lhm.get(1));
        System.out.println(lhm);
    }
}
