package com.weifang.pojo;

/**
 * @Program: spring
 * @ClassName: School
 * @Version: 1.0
 * @Description: 学校类
 * @Author: zhezhi
 * @Create-Date: 2022-06-12 10:20
 **/

public class School {
    private String name;
    private String address;

    public School() {
        System.out.println("学校的无参构造方法执行了。。。");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
