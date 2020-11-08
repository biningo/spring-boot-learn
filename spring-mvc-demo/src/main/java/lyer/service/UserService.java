package lyer.service;

import org.springframework.stereotype.Service;

/***
 *@Author icepan
 *@Date 2020/11/6 下午8:08
 *@Description
 *
 ***/

@Service
public class UserService {

    public String SayHello(){
        System.out.println("User");
        return "UserService.SayHello";
    }

}
