package OOP11_Collection.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

// 2:10:00 занятие 32.
public class LinkedList1 {
    public static void main(String[] args) {
        Student st1 = new Student("Иван", 2);
        Student st2 = new Student("Ольга", 1);
        Student st3 = new Student("Петр", 3);
        Student st4 = new Student("Инна", 2);
        Student st5 = new Student("Сергей", 3);

        LinkedList<Student> stL = new LinkedList<>();
        stL.add(st1);
        stL.add(st2);
        stL.add(st3);
        stL.add(st4);
        stL.add(st5);

        System.out.println("LinkedList = " + stL);
        System.out.println(stL.get(2));

        Student st6 = new Student("Алена", 2);
        Student st7 = new Student("Павел", 1);
        stL.add(st6);
        stL.add(1, st7);
        System.out.println("LinkedList = " + stL);

        Student st8 = new Student("Влад", 3);
        stL.set(1, st8); // Перезаписали "Павла" на "Влада".
        System.out.println("LinkedList = " + stL);

        stL.remove(3); // Удалили студента.
        stL.removeFirst(); // Удаление с начала.
        stL.removeLast(); // Удаление с конца.
        System.out.println("LinkedList = " + stL);

        // LinkedList в цикле.
        for (Student student : stL) {
            System.out.println(student);
        }

        for (int i = 0; i < stL.size(); i++) {
            System.out.println("Элемент по индексу: " + i + ": " + stL.get(i));
        }

//        Iterator p = stL.listIterator(2);
//        while (p.hasNext()){
//            System.out.println(p.next());
//        }

        Iterator it = stL.descendingIterator(); // Пройтись по массиву с конца.
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("Первый элемент: " + stL.getFirst()); // Вывести первый элемент массива.
        System.out.println("Последний элемент: " + stL.getLast()); // Вывести последний элемент массива.
        stL.clear(); // Очистить список.
        System.out.println("LinkedList = " + stL);
        System.out.println("Пустой список? " + stL.isEmpty()); // true или false.

        // ListIterator 2:57:30

        ListIterator<Student> listIterator = stL.listIterator();
        System.out.println("Итерация в прямом направлении.");
        while (listIterator.hasNext()) {
            System.out.println("Index = " + listIterator.nextIndex() + ", Element = " + listIterator.next());
        }

        System.out.println("Итерация в обратном направлении.");
        while (listIterator.hasPrevious()) { // Проверка индексов в обратном направлении.
            System.out.println("Index = " + listIterator.previousIndex() + ", Element = " + listIterator.previous());
        }
    }
}

class Student {
    String name;
    int course;

    public Student(String name, int course) {
        this.course = course;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}