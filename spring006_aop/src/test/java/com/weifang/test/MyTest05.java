package com.weifang.test;

import com.proxy5.*;
import org.junit.Test;

/**
 * @Program: spring
 * @ClassName: MyTest05
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-07-10 14:04
 **/

public class MyTest05 {
    @Test
    public void testProxy() {
        Service agent = (Service) ProxyFactory.getAgent(new ProductServiceImpl(),new LogAop());
        Service agent2 = (Service) ProxyFactory.getAgent(agent,new TransAop());
        agent2.buy();
    }
    @Test
    public void testProxy2() {
        Service agent = (Service) ProxyFactory.getAgent(new BookServiceImpl(), new LogAop());
        Service agent1 = (Service) ProxyFactory.getAgent(agent,new TransAop());
        String show = agent1.show(11);
    }
}
