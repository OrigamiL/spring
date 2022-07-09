package com.weifang.s03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Program: spring
 * @ClassName: Student
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-06-13 15:48
 **/

@Component
public class Student {
    @Value("张三")
    private String name;
    @Value("24")
    private int age;
    @Autowired
    //@Qualifier("subSchool")
    @Qualifier("school")
    private School school;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
