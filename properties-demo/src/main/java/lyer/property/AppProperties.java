package lyer.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.stereotype.Component;

/***
 *@Author icepan
 *@Date 2020/11/5 下午12:57
 *@Description
 *
 ***/

@Component
public class AppProperties {

    @Value("${spring.application.name}")
    private String ApplicationName;
    @Value("${server.port}")
    private Integer port;


    public String getApplicationName() {
        return ApplicationName;
    }

    public void setApplicationName(String applicationName) {
        ApplicationName = applicationName;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
}
