package com.weifang.pojo;

/**
 * @Program: spring
 * @ClassName: Student1
 * @Version: 1.0
 * @Description: test 引用类型
 * @Author: zhezhi
 * @Create-Date: 2022-06-12 10:24
 **/

public class Student1 {
    private String name;
    private String age;
    private School school;

    public Student1() {
        System.out.println("无参构造方法执行了。。。。");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", school=" + school +
                '}';
    }
}
