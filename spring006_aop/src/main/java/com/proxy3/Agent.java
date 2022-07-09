package com.proxy3;

/**
 * @Program: spring
 * @ClassName: Agent
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-07-09 16:36
 **/

public class Agent implements Service{
    public Service target;

    public Agent(Service target) {
        this.target = target;
    }

    @Override
    public void buy() {
        System.out.println("事务开启。。。");
        target.buy();
        System.out.println("事务关闭。。。");
    }
}
