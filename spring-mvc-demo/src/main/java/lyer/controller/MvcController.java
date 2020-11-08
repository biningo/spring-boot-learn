package lyer.controller;

import lyer.vo.VoArticle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/***
 *@Author icepan
 *@Date 2020/11/8 下午9:42
 *@Description
 *
 ***/

@RestController("mymvc")
public class MvcController {
    private Logger logger = LoggerFactory.getLogger(MvcController.class);


//    localhost:8080/get/article?title=a&views=18&author=abc
    @GetMapping("/get/article")
    public VoArticle VoGet(VoArticle article){
        logger.info(article.getTitle()+article.getViews());
        return article;
    }
    @GetMapping("/get/article/{title}/{author}/{views}")
    public VoArticle VoGetPath(VoArticle article){
        logger.info(article.getTitle()+article.getViews());
        return article;
    }


    //form-data   form-uncode...
    @PostMapping("/post/user/form")
    public String FormRequest(String username,String age){
        return username+"-"+age;
    }


    //错误 无法注入json
//    @PostMapping("/post/user/json")
//    public String FormRequest2(@RequestBody String username,@RequestBody String age){
//        return username+"-"+age;
//    }

    //JSON
    /*{
        "title":"icpan",
        "views":19,
        "author":"ida"
    }
    */
    @PostMapping("/post/article")
    public VoArticle FormArticle(@RequestBody VoArticle article){
        return article;
    }

}
