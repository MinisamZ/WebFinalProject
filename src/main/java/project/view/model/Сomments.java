package project.view.model;

public class Сomments {
    public String id, author, nickname, email, text, pubdate, articles_id;
    @Override
    public String toString() {
        return "Articles{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", nickname='" + nickname + '\'' +
                ", email='" + email + '\'' +
                ", text=" + text +
                ", pubdate='" + pubdate + '\'' +
                ", articles_id=" + articles_id +
                '}';
    }
}
