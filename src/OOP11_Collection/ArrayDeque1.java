package OOP11_Collection;

import java.util.ArrayDeque;

public class ArrayDeque1 {
    public static void main(String[] args) {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("red");
        arrayDeque.add("blue");
        arrayDeque.add("white");
        arrayDeque.add("green");
        arrayDeque.add("black");
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.getFirst());
        System.out.println(arrayDeque.getLast());

        while (arrayDeque.peek()!= null){
            System.out.println(arrayDeque.pop());
        }
    }
}
