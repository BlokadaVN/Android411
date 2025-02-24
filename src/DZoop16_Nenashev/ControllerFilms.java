package DZoop16_Nenashev;

import java.util.Collection;
import java.util.Map;

public class ControllerFilms {
    private Films userFilms;
    private ModelFilms modelFilms;

    public ControllerFilms() {
        this.userFilms = new Films();
        this.modelFilms = new ModelFilms();
    }

    public void run() {
        String run = "";
        while (!run.equals("q")) {
            run = userFilms.waitUF();
            checkAddFilms(run);
        }
    }

    public void checkAddFilms(String run) {

        if (run.equals("1")) {
            Map film1 = userFilms.addFilm();
            modelFilms.filmsAdd(film1);
        } else if (run.equals("2")) {
            Collection films = modelFilms.allAddFilms();
            userFilms.showAllFilms(films);
        } else if (run.equals("3")) {
            String filmTitle = userFilms.getUserFilms();
            try {
                Map film = modelFilms.getSingleFilm(filmTitle);
                userFilms.showInfoFilm(film);
            } catch (NullPointerException npe) {
                userFilms.showIncorrectTitleFilmError(filmTitle);
            }
        } else if (run.equals("4")) {
            String filmTitle = userFilms.getUserFilms();
            NewFilm newFilmTitle = modelFilms.removeFilm(filmTitle);
            if (newFilmTitle != null) {
                userFilms.removeSingleFilm(newFilmTitle);
            } else {
                userFilms.showIncorrectFilmError(filmTitle);
            }
        } else if (run.equals("q")) {
            modelFilms.saveDateFilm();
        } else {
            userFilms.showIncorrectError(run);
        }
    }
}

