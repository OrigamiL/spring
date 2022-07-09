package com.proxy4;

/**
 * @Program: spring
 * @ClassName: Agent
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-07-09 17:25
 **/

public class Agent implements Service {
    Service target;
    Aop aop;

    public Agent(Service target, Aop aop) {
        this.target = target;
        this.aop = aop;
    }

    @Override
    public void buy() {
        try {
            aop.before();
            target.buy();
            aop.after();
        } catch (Exception e) {
            aop.exception();
        }
    }
}
