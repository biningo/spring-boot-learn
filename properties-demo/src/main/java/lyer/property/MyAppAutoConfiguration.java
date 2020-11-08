package lyer.property;

import lyer.bean.MyApp;
import lyer.property.MyAppProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/***
 *@Author icepan
 *@Date 2020/11/5 下午11:43
 *@Description
 *
 ***/

@EnableConfigurationProperties({MyAppProperties.class})
@Configuration
public class MyAppAutoConfiguration {
    private MyAppProperties properties;
    public MyAppAutoConfiguration(MyAppProperties myAppProperties){
        this.properties = myAppProperties;
    }

    @Bean
    public MyApp myApp(){
        return new MyApp(this.properties.getName(),this.properties.getPort());
    }
}
