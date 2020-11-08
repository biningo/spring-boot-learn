package lyer.property;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/***
 *@Author icepan
 *@Date 2020/11/6 上午10:13
 *@Description
 *
 ***/
@Component
@Import({BlogSelector.class})
public class BlogAutoConfiguration {

    @Resource
    private BookProperties bookProperties;
    @Resource
    private ArticleProperties articleProperties;

    public BookProperties getBookProperties() {
        return bookProperties;
    }

    public void setBookProperties(BookProperties bookProperties) {
        this.bookProperties = bookProperties;
    }

    public ArticleProperties getArticleProperties() {
        return articleProperties;
    }

    public void setArticleProperties(ArticleProperties articleProperties) {
        this.articleProperties = articleProperties;
    }
}
