package lyer.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

/***
 *@Author icepan
 *@Date 2020/11/6 上午10:09
 *@Description
 *
 ***/

@ConfigurationProperties("article")
public class ArticleProperties {
    private String title;
    private String author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
