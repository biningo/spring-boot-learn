package lyer.service;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/***
 *@Author icepan
 *@Date 2020/11/6 下午8:11
 *@Description
 *
 ***/

//AOP语法
//https://blog.csdn.net/zhengchao1991/article/details/53391244

//AOP权限验证
//https://www.javazhiyin.com/73048.html

//    https://stackoverflow.com/questions/15660535/get-method-arguments-using-spring-aop
@Aspect
@Component
public class UserServiceAspect {

    @Pointcut("execution(public String lyer.service.UserService.SayHello())")
    public void pointCut() {
    }

    //前置通知
    @Before("pointCut()")
    public void before(){
        System.out.println("User Before");
    }

    //后置通知
    @After("pointCut()")
    public void after(){
        System.out.println("User After");
    }

    //后置返回通知
    @AfterReturning("pointCut()")
    public void afterReturn(){
        System.out.println("User After Return");
    }

    //后置异常通知
    @AfterThrowing("pointCut()")
    public void afterThrowing(){
        System.out.println("User Error After");
    }

    //环绕通知
    @Around("pointCut()")
    public void Round(){
        System.out.println("User Around");
    }


}
