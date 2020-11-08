package lyer.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

/***
 *@Author icepan
 *@Date 2020/11/5 下午11:06
 *@Description
 *
 ***/

@ConfigurationProperties("redis")
public class RedisProperties {
    private String username;
    private String password;
    private Integer db;

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

    public Integer getDb() {
        return db;
    }

    public void setDb(Integer db) {
        this.db = db;
    }
}
