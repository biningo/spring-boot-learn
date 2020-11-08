package lyer.property;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/***
 *@Author icepan
 *@Date 2020/11/5 下午11:12
 *@Description
 *
 ***/

@Configuration
@Import({EsProperties.class, MySqlProperties.class, RedisProperties.class})
public class DBAutoConfiguration {

    @Autowired
    private EsProperties esProperty;

    @Autowired
    private MySqlProperties mySqlProperty;

    @Autowired
    private RedisProperties redisProperty;

    public EsProperties getEsProperty() {
        return esProperty;
    }

    public MySqlProperties getMySqlProperty() {
        return mySqlProperty;
    }

    public RedisProperties getRedisProperty() {
        return redisProperty;
    }
}
