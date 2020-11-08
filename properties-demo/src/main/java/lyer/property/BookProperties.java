package lyer.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

/***
 *@Author icepan
 *@Date 2020/11/6 上午10:09
 *@Description
 *
 ***/

@ConfigurationProperties("book")
public class BookProperties {
    private String title;
    private Double price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
