package lyer.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/***
 *@Author icepan
 *@Date 2020/11/6 下午8:41
 *@Description
 *
 ***/

@Aspect
@Component
public class GetRequestAspect {
    @Pointcut("@annotation(org.springframework.web.bind.annotation.GetMapping)")
    private void pointCut(){};

    @Before("pointCut()")
    public void logGetRequest(JoinPoint jp){
        System.out.println("get request aspect");

    }
}
