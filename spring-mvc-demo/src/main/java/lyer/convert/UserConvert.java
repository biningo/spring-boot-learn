package lyer.convert;


import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/***
 *@Author icepan
 *@Date 2020/11/6 下午6:25
 *@Description
 *
 ***/

@Component
public class UserConvert implements Converter<String,User> {
    @Override
    public User convert(String s) {
        return new User(s.split("-")[0],s.split("-")[1]);
    }
}
