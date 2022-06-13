package com.weifang.s01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Program: spring
 * @ClassName: Student
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-06-13 14:17
 **/

@Component("stu")
public class Student {
    @Value("王五")
    private String name;
    @Value("14")
    private int age;

    public Student() {
        System.out.println("学生对象的无参构造方法执行了。。。。");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
