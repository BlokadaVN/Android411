package OOP12.articles;

import java.util.Collection;
import java.util.Map;

public class Controller {
    private Model articleModel;
    private View userInterface;

    public Controller() {
        this.articleModel = new Model();
        this.userInterface = new View();
    }

    public void run() { // Цикл проверяет пока юзер не нажмет "q".
        String answer = "";
        while (!answer.equals("q")) {
            answer = userInterface.waitUserAnswer(); //  answer перезаписали из конструктора new View, который вызвал из класса View метод waitUserAnswer()
            checkUserAnswer(answer); // Проверка того, что ввел пользователь.
        }
    }

    public void checkUserAnswer(String answer) {
        if (answer.equals("1")) {
            Map article = userInterface.addUserArticle(); // 1
            articleModel.addArticle(article); // 2
        }else if (answer.equals("2")){
            Collection articles = articleModel.getAllArticles();
            userInterface.showAllArticles(articles);
        }
    }
}
