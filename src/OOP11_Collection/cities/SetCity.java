package OOP11_Collection.cities;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetCity {
    private Set<City> hash = new HashSet<>();
    private Set<City> tree = new TreeSet<>();

    public int size() {
        return hash.size() + tree.size();
    }

    private boolean isEven(int code) {
        return code % 2 == 0;
    }

    public boolean addCity(String name, int code) {
        boolean result = name.length() > 0 && code > 0;
        if (result) {
            if (isEven(code)) {
                hash.add(new City(name, code));
            } else tree.add(new City(name, code));
        }
        return result;
    }

    public void removeCity(int minAmountSymbol, int maxAmountSymbol) {
        hash.removeIf(x -> x.getName().length() < minAmountSymbol || x.getName().length() > maxAmountSymbol);
        tree.removeIf(x -> x.getName().length() < minAmountSymbol || x.getName().length() > maxAmountSymbol);
    }

    public void printReversCity() {
        TreeSet<City> treeSet = new TreeSet<>(tree); // Соединили трисет и хешсет.
        treeSet.addAll(hash);


        Iterator<City> iterator = treeSet.descendingIterator(); // Вывод городов в обратном порядке.
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
//        System.out.println(treeSet.descendingSet());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Список городов с четным кодом (HashSet):\n");
        for (City city : hash) {
            sb.append(city).append("\n");
        }
        sb.append("\n").append("Список городов с нечетным кодом (TreeSet):\n");
        for (City city : tree) {
            sb.append(city).append("\n");
        }
        return sb.toString();
    }
}
