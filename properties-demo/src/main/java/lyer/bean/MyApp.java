package lyer.bean;

/***
 *@Author icepan
 *@Date 2020/11/5 下午11:46
 *@Description
 *
 ***/


public class MyApp {
    private String AppName;
    private Integer port;

    public MyApp(){}

    public MyApp(String name,Integer p){
        this.AppName= name;
        this.port = p;
    }

    public String getAppName() {
        return AppName;
    }

    public void setAppName(String appName) {
        AppName = appName;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
}
