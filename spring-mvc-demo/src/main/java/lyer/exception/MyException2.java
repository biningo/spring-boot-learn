package lyer.exception;

/***
 *@Author icepan
 *@Date 2020/11/6 下午6:40
 *@Description
 *
 ***/


public class MyException2 extends Exception {
    private String msg;
    private Integer code;
    public MyException2(String msg,Integer code){
        this.msg = msg;
        this.code = code;
    }

    @Override
    public String getMessage() {
        return this.msg+"-"+this.code;
    }
}
