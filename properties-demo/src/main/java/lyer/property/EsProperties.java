package lyer.property;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/***
 *@Author icepan
 *@Date 2020/11/5 下午11:07
 *@Description
 *
 ***/

@ConfigurationProperties("es")
public class EsProperties {
    private String username;
    private String password;
    private String index;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }
}
