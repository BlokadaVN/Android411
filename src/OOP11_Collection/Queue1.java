package OOP11_Collection;

import java.util.PriorityQueue;

public class Queue1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> task = new PriorityQueue<>();
        task.add(5);
        task.add(1);
        task.add(9);
        task.add(2);
        task.add(3);
        task.add(3);
        System.out.println(task);

//        while (!task.isEmpty()){
////            System.out.println(task.remove());
//            System.out.println(task.poll()); // Удаляет элементы без исключений.
//        }
//        System.out.println(task);
        System.out.println(task.peek()); // Возвращает верхушку.
        System.out.println(task.element()); // Возвращает верхушку.
        System.out.println(task);
    }
}
