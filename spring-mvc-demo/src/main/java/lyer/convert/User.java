package lyer.convert;

/***
 *@Author icepan
 *@Date 2020/11/6 下午6:24
 *@Description
 *
 ***/


public class User {
    private String name;
    private Integer age;

    public User(){}

    public User(String name,String age){
        this.name = name;
        this.age = Integer.parseInt(age);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
