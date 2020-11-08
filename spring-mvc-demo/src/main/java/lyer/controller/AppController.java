package lyer.controller;

import lyer.annotation.PermissionAnnotation;
import lyer.convert.User;
import lyer.exception.MyException1;
import lyer.exception.MyException2;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/***
 *@Author icepan
 *@Date 2020/11/6 下午12:55
 *@Description
 *
 ***/

@RestController
public class AppController {

    @GetMapping("/admin/login")
    public String AdminLogin(HttpServletRequest request){
        return "Login";
    }

    @GetMapping("/admin/ping")
    public String AdminPing(){
        return "Admin";
    }



    @GetMapping("/exception/e1")
    public String E1() throws MyException1 {
        throw new MyException1("error1",10000);
    }
    @GetMapping("/exception/e2")
    public String E2() throws MyException2 {
        throw new MyException2("error2",20000);
    }


    @GetMapping("/date/{time}")
    public Date GetDate(@PathVariable("time") Date date){
        return date;
    }


    @GetMapping("/user/{UserInfo}")
    public User UserPost(@PathVariable("UserInfo") User user){
        return user;
    }

    @PermissionAnnotation
    @GetMapping("/user")
    public String EchoMsg(@RequestParam String username,@RequestParam String password){
        return username+"-"+password;
    }
}
