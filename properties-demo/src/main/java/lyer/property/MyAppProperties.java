package lyer.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

/***
 *@Author icepan
 *@Date 2020/11/5 下午11:41
 *@Description
 *
 ***/

@ConfigurationProperties("my")
public class MyAppProperties {
    private Integer port;
    private String name;
    private String code;

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
