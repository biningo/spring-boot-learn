package lyer.exception;

/***
 *@Author icepan
 *@Date 2020/11/6 下午6:40
 *@Description
 *
 ***/


public class MyException1 extends Exception {
    private String msg;
    private Integer code;
    public MyException1(String msg,Integer code){
        this.msg = msg;
        this.code = code;
    }

    @Override
    public String getMessage() {
        return this.msg+"-"+this.code;
    }
}
