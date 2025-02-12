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
        }
    }
}
