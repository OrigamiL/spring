package com.proxy5;

/**
 * @Program: spring
 * @ClassName: TransAop
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-07-09 17:23
 **/

public class TransAop implements Aop {
    @Override
    public void before() {
        System.out.println("事务开始、、、、、");
    }

    @Override
    public void after() {
        System.out.println("事务关闭。。。。");
    }

    @Override
    public void exception() {
        System.out.println("事务回滚!");
    }
}
