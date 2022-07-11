package com.weifang.s01;

import org.springframework.stereotype.Service;

/**
 * @Program: spring
 * @ClassName: SomeServiceImpl
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-07-11 10:42
 **/

@Service
public class SomeServiceImpl implements SomeService{

    @Override
    public String doSome(String name, int age) {
        System.out.println("doSome业务功能实现.....");
        return name+age;
    }

    @Override
    public void show() {
        System.out.println("show。。。。");
    }
}
