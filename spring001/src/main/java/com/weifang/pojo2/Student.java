package com.weifang.pojo2;

/**
 * @Program: spring
 * @ClassName: Student
 * @Version: 1.0
 * @Description: 测试使用构造方法参数下标注入
 * @Author: zhezhi
 * @Create-Date: 2022-06-13 13:38
 **/

public class Student {
    private String name;
    private int age;
    private School school;

    public Student(String name, int age, School school) {
        this.name = name;
        this.age = age;
        this.school = school;
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
