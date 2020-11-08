package lyer.aspect;

import lyer.convert.User;
import lyer.convert.UserConvert;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/***
 *@Author icepan
 *@Date 2020/11/6 下午8:45
 *@Description
 *
 ***/

@Aspect
@Component
public class PermissionFirstAspect {

    @Pointcut("@annotation(lyer.annotation.PermissionAnnotation)")
    private void permissionCheck() {
    }



    @Around("permissionCheck()")
    public Object permissionCheckFirst(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("------------------第一个切面----------------");
        System.out.println("name:"+jp.getArgs()[0]+" password:"+jp.getArgs()[1]);
        return jp.proceed();
    }

}
