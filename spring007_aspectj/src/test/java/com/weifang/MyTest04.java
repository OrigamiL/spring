package com.weifang;

import com.weifang.s04.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Program: spring
 * @ClassName: MyTest
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-07-12 15:36
 **/

public class MyTest04 {
    @Test
    public void testAfter() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("s04/applicationContext.xml");
        SomeService service = (SomeService) ac.getBean("someServiceImpl");
        System.out.println(service.getClass());
        String s = service.doSome("张三", 11);
        System.out.println(s);
    }
}
