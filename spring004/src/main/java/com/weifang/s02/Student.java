package com.weifang.s02;

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

@Component("student")
public class Student {
    @Value("赵六")
    private String name;
    @Value("20")
    private int age;
    /*//引用类型按类型注入  必须有这个类型的对象@Component("school")
    @Autowired*/
    //按名称注入
    @Autowired
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
