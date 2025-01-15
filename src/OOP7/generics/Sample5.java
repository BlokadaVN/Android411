package OOP7.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sample5 {
    public static void main(String[] args) {
        ArrayList<Integer> intArr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println(intArr);
        System.out.println(reversList(intArr));

//        Revers r1 = new Revers<>(intArr);
//        System.out.println(r1.reverse());

        ArrayList<String> strArr = new ArrayList<>(Arrays.asList("Red", "Green", "Black"));
        System.out.println(strArr);
        System.out.println(reversList(strArr));

//        Revers r2 = new Revers(strArr);
//        System.out.println(r2.reverse());
    }

    public static <T> ArrayList<T> reversList(ArrayList<T> or) {
        ArrayList<T> newAr = new ArrayList<>();
        for (int i = or.size() - 1; i >= 0; i--) {
            newAr.add(or.get(i));
        }
        return newAr;
    }
}

//class Revers<T> {
//    private ArrayList<T> ob;
//
//    public Revers(ArrayList<T> ob) {
//        this.ob = ob;
//    }
//
//    public ArrayList<T> reverse() {
//        Collections.reverse(ob);
//        return ob;
//    }
//}