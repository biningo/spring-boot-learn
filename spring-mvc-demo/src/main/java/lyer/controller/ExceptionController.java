package lyer.controller;

import lyer.exception.MyException1;
import lyer.exception.MyException2;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/***
 *@Author icepan
 *@Date 2020/11/6 下午6:40
 *@Description
 *
 ***/

@RestControllerAdvice
public class ExceptionController {

    @ExceptionHandler(MyException1.class)
    @ResponseStatus(HttpStatus.EXPECTATION_FAILED)
    public String handleException1(MyException1 myException1){
        return myException1.getMessage();
    }

    @ExceptionHandler(MyException2.class)
    @ResponseStatus(HttpStatus.EXPECTATION_FAILED)
    public String handleException1(MyException2 myException2){
        return myException2.getMessage();
    }

}
