package com.weifang.s03;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Program: spring
 * @ClassName: School
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-06-13 15:47
 **/

@Component("sc")
public class School {
    @Value("北大")
    private String name;
    @Value("北京市海淀")
    private String address;

    public School() {
        System.out.println("school的无参构造方法执行了。。。。");
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
