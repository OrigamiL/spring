package com.weifang.s03;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Program: spring
 * @ClassName: SubSchool
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-06-13 16:41
 **/

@Component("school")
public class SubSchool extends School{

    @Value("清华附小")
    private String name;
    @Value("海淀校区")
    private String address;

    public SubSchool() {
        System.out.println("school子类无参构造方法");
    }

    @Override
    public String toString() {
        return "SubSchool{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
