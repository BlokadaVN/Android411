package DZoop16_Nenashev;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Films {
    Scanner input = new Scanner(System.in);

    public String waitUF() {

        System.out.println("=== Редактирование данных каталога фильмов ===");

        System.out.println("Действия с фильмами:");
        System.out.println("1 - добавление фильма.\n"
                + "2 - каталог фильмов.\n"
                + "3 - просмотр определенного фильма.\n"
                + "4 - удаление фильма.\n"
                + "q - выход из программы.");
        System.out.print("Выберите вариант действия: ");
        String userFilm = input.nextLine();
        System.out.println("==============================================");
        return userFilm;
    }

    public Map addFilm() {
        Map<String, String> addF = new LinkedHashMap<>();
        addF.put("название", "");
        addF.put("жанр", "");
        addF.put("режиссер", "");
        addF.put("год выпуска", "");
        addF.put("длительность", "");
        addF.put("студия", "");
        addF.put("актеров", "");

        System.out.println("=== Добавление фильма ===");
        for (Map.Entry<String, String> el : addF.entrySet()) {
            System.out.print("Введите " + el.getKey() + " ");
            addF.put(el.getKey(), input.nextLine());
        }
        System.out.println("=========================");
        return addF;
    }

    public void showAllFilms(Collection films) {
        System.out.println("======= Список фильмов =======");
        for (var elements : films) {
            System.out.println(elements);
        }
        System.out.println("==============================");
    }
}
