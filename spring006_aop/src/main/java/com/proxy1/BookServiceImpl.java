package com.proxy1;

/**
 * @Program: spring
 * @ClassName: BookServiceImpl
 * @Version: 1.0
 * @Description: 图书购买业务和事务切面耦合在一起
 * @Author: zhezhi
 * @Create-Date: 2022-07-09 16:20
 **/

public class BookServiceImpl {
    public void buy() {

        try {
            System.out.println("事务开启。。。。");
            System.out.println("图书购买业务功能实现。。。。");
            System.out.println("事务提交。。。。");
        } catch (Exception e) {
            System.out.println("事务回滚！！！！");
        }
    }
}
