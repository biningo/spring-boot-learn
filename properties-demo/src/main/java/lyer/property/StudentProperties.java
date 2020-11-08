package lyer.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/***
 *@Author icepan
 *@Date 2020/11/5 下午9:24
 *@Description
 *
 ***/

@Component
@PropertySource("classpath:student.properties")
public class StudentProperties {
    @Value("${stu.name}")
    private String StuName;
    @Value("${stu.grade}")
    private Integer StuGrade;

    public String getStuName() {
        return StuName;
    }

    public void setStuName(String stuName) {
        StuName = stuName;
    }

    public Integer getStuGrade() {
        return StuGrade;
    }

    public void setStuGrade(Integer stuGrade) {
        StuGrade = stuGrade;
    }
}
