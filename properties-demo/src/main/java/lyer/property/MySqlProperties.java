package lyer.property;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/***
 *@Author icepan
 *@Date 2020/11/5 下午11:05
 *@Description
 *
 ***/

@ConfigurationProperties("mysql")
public class MySqlProperties {
    private String username;
    private String password;

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
}
