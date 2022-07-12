package com.weifang;

import com.weifang.s03.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Program: spring
 * @ClassName: MyTest03
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-07-12 15:11
 **/

public class MyTest03 {
    @Test
    public void testAround() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("s03/applicationContext.xml");
        SomeService service = (SomeService) ac.getBean("someServiceImpl");
        String s = service.doSome("张三", 1);
        System.out.println(s);
    }
}
