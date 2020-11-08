package lyer.config;

import lyer.bean.Memroy;
import lyer.bean.MyApp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/***
 *@Author icepan
 *@Date 2020/11/6 上午10:44
 *@Description
 *
 ***/

@Configuration
public class SystemConfiguration {

    @Bean
    public Memroy createMemory(MyApp myApp){
        return new Memroy(myApp.getPort());
    }

}
