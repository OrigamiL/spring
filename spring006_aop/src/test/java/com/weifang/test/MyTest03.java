package com.weifang.test;

import com.proxy3.Agent;
import com.proxy3.BookServiceImpl;
import com.proxy3.ProductServiceImpl;
import com.proxy3.Service;
import org.junit.Test;

/**
 * @Program: spring
 * @ClassName: MyTest03
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-07-09 16:38
 **/

public class MyTest03 {
    @Test
    public void testProxy03() {
        Service service = new Agent(new BookServiceImpl());
        service.buy();
        Service service1 = new Agent(new ProductServiceImpl());
        service1.buy();
    }
}
