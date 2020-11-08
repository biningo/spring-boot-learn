package lyer.vo;

/***
 *@Author icepan
 *@Date 2020/11/8 下午10:11
 *@Description
 *
 ***/


public class VoArticle {
    private String title;
    private Integer views;
    private String author;

    public VoArticle(){}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
