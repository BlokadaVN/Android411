package DZoop16_Nenashev;

import java.io.*;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class ModelFilms {
    private Map<String, NewFilm> newFilmMap;
    private String dateBaseFilm;

    public ModelFilms() {
        this.dateBaseFilm = "dbf.txt";
        this.newFilmMap = loadDateFilm();
    }

    public void filmsAdd(Map add1) {
        NewFilm newFilm1 = new NewFilm(add1);
        newFilmMap.put((String) add1.get("название"), newFilm1);
    }

    public Collection allAddFilms() {
        return newFilmMap.values();
    }

    public Map getSingleFilm(String userFilm) {
        NewFilm newFilm = newFilmMap.get(userFilm);
        Map<String, String> dictFilm = new LinkedHashMap<>();
        dictFilm.put("название", newFilm.getNameFilm());
        dictFilm.put("жанр", newFilm.getGenre());
        dictFilm.put("режиссер", newFilm.getDirector());
        dictFilm.put("год выпуска", newFilm.getYearOfRelease());
        dictFilm.put("длительность", newFilm.getDuration());
        dictFilm.put("студия", newFilm.getAtelier());
        dictFilm.put("актеры", newFilm.getActors());
        return dictFilm;
    }

    public NewFilm removeFilm(String userFilm) {
        return newFilmMap.remove(userFilm);
    }

    public void saveDateFilm() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(dateBaseFilm))) {
            oos.writeObject(newFilmMap);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public LinkedHashMap loadDateFilm() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(dateBaseFilm))) {
            return (LinkedHashMap) ois.readObject();
        } catch (Exception ex) {
            return new LinkedHashMap();
        }
    }
}

class NewFilm implements Serializable {
    private String nameFilm;
    private String genre;
    private String director;
    private String yearOfRelease;
    private String duration;
    private String atelier;
    private String actors;

    public NewFilm(Map addFilm) {
        this.nameFilm = (String) addFilm.get("название");
        this.genre = (String) addFilm.get("жанр");
        this.director = (String) addFilm.get("режиссер");
        this.yearOfRelease = (String) addFilm.get("год выпуска");
        this.duration = (String) addFilm.get("длительность");
        this.atelier = (String) addFilm.get("студия");
        this.actors = (String) addFilm.get("актеры");
    }

    public String getNameFilm() {
        return nameFilm;
    }

    public String getGenre() {
        return genre;
    }

    public String getDirector() {
        return director;
    }

    public String getYearOfRelease() {
        return yearOfRelease;
    }

    public String getDuration() {
        return duration;
    }

    public String getAtelier() {
        return atelier;
    }

    public String getActors() {
        return actors;
    }

    @Override
    public String toString() {
        return "название " + nameFilm +
                " режиссер " + genre;
    }
}