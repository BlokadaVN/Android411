package OOP11_Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet2 {
    public static void main(String[] args) {
        TreeSet<Student2> treeSet = new TreeSet<>();
        Student2 st1 = new Student2("Виктор", 3);
        Student2 st2 = new Student2("Герман", 1);
        Student2 st3 = new Student2("Ольга", 2);
        Student2 st4 = new Student2("Ирина", 4);
        Student2 st5 = new Student2("Михаил", 5);
        treeSet.add(st1);
        treeSet.add(st2);
        treeSet.add(st3);
        treeSet.add(st4);
        treeSet.add(st5);
        System.out.println(treeSet);
        Student2 st6 = new Student2("Алена", 3);
        System.out.println(treeSet.headSet(st6)); // .headSet выводит всех, кто меньше по курсу.
        System.out.println(treeSet.tailSet(st6)); // .tailSet выводит = или > курс.
        Student2 st7 = new Student2("Владимир", 2);
        Student2 st8 = new Student2("Катя", 4);
        System.out.println(treeSet.subSet(st7, st8));
        System.out.println("***********************************");

        Iterator<Student2> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("***********************************");

        Iterator<Student2> iterator2 = treeSet.descendingIterator(); // .descendingIterator() от большего к меньшему.
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
    }
}

class Student2 implements Comparable<Student2> {
    String name;
    int course;

    public Student2(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public int compareTo(Student2 o) {
        return course - o.course;
    }
}