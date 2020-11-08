package lyer.controller;

import lyer.bean.Memroy;
import lyer.bean.MyApp;
import lyer.property.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/***
 *@Author icepan
 *@Date 2020/11/5 下午1:04
 *@Description
 *
 ***/

@RestController
public class AppController {
    @Autowired
    private DBAutoConfiguration dbAutoConfiguration;

    @Autowired
    private UserProperties userProperty;

    @Autowired
    private AppProperties appProperty;

    @Autowired
    private StudentProperties studentProperty;


    @Autowired
    private MyApp myApp;

    @GetMapping("/config/app")
    public AppProperties ConfigApp(){
        return appProperty;
    }

    @GetMapping("/config/stu")
    public StudentProperties ConfigStu(){
        return studentProperty;
    }


    @GetMapping("/config/user")
    public UserProperties ConfigUser(){
        return userProperty;
    }

    @GetMapping("/config/db")
    public Object ConfigDB(@RequestParam String type){
        switch (type){
            case "mysql":
                System.out.println(dbAutoConfiguration.getMySqlProperty().getUsername());
                return dbAutoConfiguration.getMySqlProperty();
            case "redis":
                System.out.println(dbAutoConfiguration.getRedisProperty().getUsername());
                return dbAutoConfiguration.getRedisProperty();
            case "es":
                System.out.println(dbAutoConfiguration.getEsProperty().getUsername());
                return dbAutoConfiguration.getEsProperty();
        }
        return null;
    }


    @GetMapping("/config/my")
    public MyApp ConfigMy(){
        return myApp;
    }

    @Autowired
    BlogAutoConfiguration blogAutoConfiguration;


    @GetMapping("/config/blog")
    public ArticleProperties ConfigBlog(){
        return blogAutoConfiguration.getArticleProperties();
    }

}
