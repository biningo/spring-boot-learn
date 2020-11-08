package lyer.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/***
 *@Author icepan
 *@Date 2020/11/5 下午12:59
 *@Description
 *
 ***/

//https://juejin.im/post/6844903923891830792
@Component
//yaml文件需要手动建立工厂类 properties不需要
@PropertySource(value = "classpath:user.yaml",encoding = "utf-8",factory = YamlConfigParamFactory.class)
@ConfigurationProperties(prefix = "user") //加了这个只要属性名一样即可不需要手动添加@Value注解 如下age和phone
public class UserProperties {
    @Value("${user.name}")
    public String UserName;

    private Integer age;

    private String phone;

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
