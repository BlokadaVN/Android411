package OOP12.articles;

import java.io.*;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class Model {
    private Map<String, Article> articles;
    private String dbName; // Переменная для сохранения данных.

    public Model() {
        this.dbName = "db.txt";
        this.articles = loadDate(); // new LinkedHashMap<>();
    }

    public void addArticle(Map dictArticle) { // 2
        Article article = new Article(dictArticle); // Сюда легла статья.
        articles.put((String) dictArticle.get("название"), article);
//        System.out.println(articles);
    }

    public Collection getAllArticles() {
        return articles.values();
    }

    // ============================

    public Map getSingleArticle(String userTitle) { // 3
        Article article = articles.get(userTitle); // Запрос на определенную статью.
        Map<String, String> dictArticle = new LinkedHashMap<>();
        dictArticle.put("название", article.getTitle()); // 34:00
        dictArticle.put("автор", article.getAuthor()); // 34:00
        dictArticle.put("количество страниц", article.getPage()); // 34:00
        dictArticle.put("описание", article.getDescription()); // 34:00
        return dictArticle;
    }

    public Article removeArticle(String userTitle) { // 4
        return articles.remove(userTitle);
    }

    // Метод сохранения данных в файл.
    public void saveDate() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(dbName))) {
            oos.writeObject(articles);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    // Метод загрузки данных из файла.
    public LinkedHashMap loadDate() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(dbName))) {
            return (LinkedHashMap) ois.readObject();
        } catch (Exception ex) {
            return new LinkedHashMap(); // 2:03
        }
    }
}

// ============================
class Article implements Serializable { // Хранение статьи. А Model хранит все статьи.
    private String title;
    private String author;
    private String page;
    private String description;

    public Article(Map dictArticle) {
        this.title = (String) dictArticle.get("название");
        this.author = (String) dictArticle.get("автора");
        this.page = (String) dictArticle.get("количество страниц");
        this.description = (String) dictArticle.get("описание");
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPage() {
        return page;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return title +
                " (" + author + ")";
    }
}