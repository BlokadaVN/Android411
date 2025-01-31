package OOP11_Collection.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Валерий");
        arrayList.add("Инга");
        arrayList.add("Светлана");
        System.out.println(arrayList);

        ArrayList<String> arrayList2 = new ArrayList<>(20); // 20 - это на сколько элементов мы выделяем размер массива.
        arrayList2.add("Валерий");
        arrayList2.add("Инга");
        System.out.println(arrayList2);

        List<String> arrayList3 = new ArrayList<>();
        arrayList3.add("Валерий");
        arrayList3.add("Инга");
        System.out.println(arrayList3);

        ArrayList<String> arrayList4 = new ArrayList<>(arrayList); // Передали первый массив в этот.
        System.out.println(arrayList4);
        arrayList4.add("Владимир");
        System.out.println(arrayList4);
        System.out.println(arrayList);

        ArrayList arrayList5 = new ArrayList<>();
        arrayList5.add("Иван");
        arrayList5.add(125);
        arrayList5.add(true);
        System.out.println(arrayList5);

        System.out.println(arrayList5.get(1)); // Доступ к индексу.
        arrayList5.set(1, 227);
        System.out.println(arrayList5);

        ArrayList<String> arrayList6 = new ArrayList<>();
        arrayList6.add("!!!");
        arrayList6.add("+++");
//        arrayList6.addAll(arrayList); // addAll - добавили первый массив.
//        System.out.println(arrayList6);

        arrayList6.addAll(1, arrayList); // Чтоб переданный массив начинался с первого индекса.
        System.out.println(arrayList6);

//        arrayList6.removeAll(arrayList); // Удалили первый массив.
//        System.out.println(arrayList6);

//        arrayList6.retainAll(arrayList); // Оставили arrayList, остальное удалили.
//        System.out.println(arrayList6);

        List<String> myList = arrayList6.subList(0, 3); // Из arrayList6 методом .subList взяли индексы от 0 - 3 (3 не включается)
        System.out.println(myList);
        myList.add("Борис");
        System.out.println(myList);
        System.out.println(arrayList6);

        // Преобразовать ArrayList к обычному массиву.
        String[] array = arrayList6.toArray(new String[6]); // Если не знаем размер массива, можно ставить в [] ноль.
        for (String s : array)
            System.out.print(s + " ");

        System.out.println();


        // Сортировка.
        Collections.sort(arrayList6); // Сортировка.
        System.out.println(arrayList6);

//        Collections.shuffle(arrayList6); // Перемешивание.
//        System.out.println(arrayList6);

//        Collections.reverse(arrayList6); // Реверс массива.
//        System.out.println(arrayList6);

        Collections.swap(arrayList6, 0, 4); // Смена индексов в массиве.
        System.out.println(arrayList6);


        // Итератор.
        Iterator<String> iterator = arrayList6.iterator();
        while (iterator.hasNext()) { // .hasNext - ищет в цикле следующий индекс массива (защита, чтоб не выйти за пределы массива).
//        System.out.println(iterator.next()); // .next - печатает то, что хранится в индексе массива.

            iterator.next(); // Парная запись: сначала .next() в цикле в память добавляет то, что лежит по индексу, а .remove это удаляет.
            iterator.remove();
        }
        System.out.println(arrayList6);
    }
}
