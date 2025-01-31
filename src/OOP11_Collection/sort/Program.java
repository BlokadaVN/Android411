package OOP11_Collection.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Program {
    public static void main(String[] args) {
        University un1 = new University("Университет", 600);
        University un2 = new University("Начальная школа", 450);
        University un3 = new University("Средняя школа", 200);
        University un4 = new University("Колледж", 100);
        University un5 = new University("Училище", 550);

        SortUniversity sU = new SortUniversity();
        int res = sU.compare(un1, un2);

        switch (res) {
            case -1:
                System.out.println(un2.getName() + " больше.");
                break;
            case 1:
                System.out.println(un1.getName() + " больше.");
                break;
            default:
                System.out.println("Два учебных заведения одинаковы по численности.");
        }

        ArrayList<University> list = new ArrayList<>();
        list.add(un1);
        list.add(un2);
        list.add(un3);
        list.add(un4);
        list.add(un5);

        System.out.println("\nСортировка по имени: ");
        SortNameUniversity nameCompare = new SortNameUniversity();
        Collections.sort(list, nameCompare); // Класс Collections общий класс для сортировки.

        // Сортировка по алфавиту.
        for (University name : list) {
            System.out.println(name.getName() + " " + name.getNumStudents());
        }

        // Сортировка по количеству учеников.
        System.out.println("\nСортировка по количеству учеников: ");
        Collections.sort(list, sU);
        for (University count : list) {
            System.out.println(count.getName() + " " + count.getNumStudents());
        }
    }
}

class University {
    private String name;
    private int numStudents;

    public University(String name, int numStudents) {
        this.name = name;
        this.numStudents = numStudents;
    }

    public String getName() {
        return name;
    }

    public int getNumStudents() {
        return numStudents;
    }
}

class SortUniversity implements Comparator<University> {

    @Override
    public int compare(University o1, University o2) {
        if (o1.getNumStudents() == o2.getNumStudents())
            return 0;
        else return o1.getNumStudents() > o2.getNumStudents() ? 1 : -1;
    }
}

class SortNameUniversity implements Comparator<University> {
    @Override
    public int compare(University o1, University o2) {
        return o1.getName().compareTo(o2.getName());
    }
}