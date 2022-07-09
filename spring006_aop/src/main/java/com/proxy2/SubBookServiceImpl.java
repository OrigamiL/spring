package com.proxy2;

/**
 * @Program: spring
 * @ClassName: SubBookServiceImpl
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-07-09 16:28
 **/

public class SubBookServiceImpl extends BookServiceImpl{
    @Override
    public void buy() {
        try {
            System.out.println("事务开启。。。");
            super.buy();
            System.out.println("事务提交。。。。");
        } catch (Exception e) {
            System.out.println("事务回滚！！！！");
        }
    }
}
