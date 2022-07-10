package com.proxy5;

/**
 * @Program: spring
 * @ClassName: BookServiceImpl
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-07-09 16:35
 **/

public class BookServiceImpl implements Service {

    @Override
    public void buy() {
        System.out.println("图书购买的功能实现。。。。");
    }

    @Override
    public String show(int age) {
        System.out.println("show方法被调用。。。"+age);
        return "aaa";
    }
}
