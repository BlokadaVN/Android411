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
        addF.put("актеры", "");

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

    public String getUserFilms() {
        System.out.println("======== Ввод фильма ========");
        System.out.print("-> ");
        String user_film = input.nextLine();
        System.out.println("=============================");
        return user_film;
    }

    public void showInfoFilm(Map film) {
        System.out.println("===== Просмотр фильма =====");
        for (var el : film.entrySet()) {
            System.out.println(el);
        }
        System.out.println("===========================");
    }

    public void showIncorrectTitleFilmError(String userTitle) {
        System.out.println("=========== Ошибка ===========");
        System.out.println("Фильма с названием " + userTitle + " нет!");
        System.out.println("==============================");
    }

    public void removeSingleFilm(NewFilm film) { // 4
        System.out.println("=========== Удаление фильма. ===========");
        System.out.println("Фильм с названием " + film + " удален!");
        System.out.println("=======================================");
    }

    public void showIncorrectFilmError(String userTitle) {
        System.out.println("=========== Ошибка ===========");
        System.out.println("Фильма с названием " + userTitle + " нет!");
        System.out.println("==============================");
    }

    public void showIncorrectError(String film) {
        System.out.println("=========== Сообщение об ошибке ===========");
        System.out.println("Варианта " + film + " не существует!");
        System.out.println("===========================================");
    }
}
