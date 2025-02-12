package OOP11_Collection;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Queue2 {
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(String::length));
        priorityQueue.add("Антон");
        priorityQueue.add("Аглая");
        priorityQueue.add("Александр");
        System.out.println(priorityQueue);

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.remove());
        }
    }
}
