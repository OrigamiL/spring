package com.weifang.test;

import com.proxy4.*;
import org.junit.Test;

/**
 * @Program: spring
 * @ClassName: MyTest04
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-07-09 17:27
 **/

public class MyTest04 {
    @Test
    public void testTransAop() {
        Service service = new Agent(new BookServiceImpl(),new TransAop());
        service.buy();
    }
    @Test
    public void testLog() {
        Service service = new Agent(new ProductServiceImpl(),new LogAop());
       // service.buy();
        Service service1 = new Agent(service,new TransAop());
        service1.buy();
    }
}
