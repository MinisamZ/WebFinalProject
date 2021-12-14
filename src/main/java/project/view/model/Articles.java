package project.view.model;

public class Articles {
    public String id, title, image, text, categorie_id, pubdate, views;




    @Override
    public String toString() {
        return "Articles{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", image='" + image + '\'' +
                ", text='" + text + '\'' +
                ", categorie_id=" + categorie_id +
                ", pubdate='" + pubdate + '\'' +
                ", views=" + views +
                '}';
    }
}
