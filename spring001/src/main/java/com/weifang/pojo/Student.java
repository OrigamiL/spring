package com.weifang.pojo;

/**
 * @Program: spring
 * @ClassName: Student
 * @Version: 1.0
 * @Description: 学生类
 * @Author: zhezhi
 * @Create-Date: 2022-06-12 08:46
 **/

public class Student {
    private String name;
    private String age;

    public Student() {
        System.out.println("无参构造方法执行了！！！！！");
    }
    public Student(int a) {
        System.out.println("you参构造方法执行了！！！！！");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
