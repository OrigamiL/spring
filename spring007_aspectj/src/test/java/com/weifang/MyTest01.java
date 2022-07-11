package com.weifang;

import com.weifang.s01.SomeService;
import com.weifang.s01.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Program: spring
 * @ClassName: MyTest01
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-07-11 11:00
 **/

public class MyTest01 {
    @Test
    public void testAspectj() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("s01/applicationContext.xml");
        //取出代理对象
        SomeService someService = (SomeService) ac.getBean("someServiceImpl");
        System.out.println(someService.getClass());
        String name = someService.doSome("zhangSan", 11);
        System.out.println(name);
        someService.show();
    }
}
