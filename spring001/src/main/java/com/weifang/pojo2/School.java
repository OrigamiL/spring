package com.weifang.pojo2;

/**
 * @Program: spring
 * @ClassName: School
 * @Version: 1.0
 * @Description: 测试构造方法注入
 * @Author: zhezhi
 * @Create-Date: 2022-06-12 18:22
 **/

public class School {
    private String name;
    private String address;

    public School(String name1, String address1) {
        this.name = name1;
        this.address = address1;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
