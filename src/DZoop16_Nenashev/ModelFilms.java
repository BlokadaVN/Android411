package DZoop16_Nenashev;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class ModelFilms {
    private Map<String, NewFilm> newFilmMap;

    public ModelFilms() {
        this.newFilmMap = new LinkedHashMap<>();
    }

    public void filmsAdd(Map add1) {
        NewFilm newFilm1 = new NewFilm(add1);
        newFilmMap.put((String) add1.get("название"), newFilm1);
//        System.out.println(newFilmMap);
    }

    public Collection allAddFilms(){
        return newFilmMap.values();
    }
}

class NewFilm {
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