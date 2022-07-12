package com.weifang.s02;

import org.springframework.stereotype.Service;

/**
 * @Program: spring
 * @ClassName: SomeServiceImpl
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-07-12 10:14
 **/

@Service
public class SomeServiceImpl implements SomeService{
    @Override
    public String doSome(String name, int age) {
        System.out.println("doSome功能实现。。。。");
      //  System.out.println(1/0);
        return "a";
    }

    @Override
    public Student doOther(String name, int age) {
        System.out.println("doOther方法执行。、。。。");
        return new Student(name,age);
    }

}
