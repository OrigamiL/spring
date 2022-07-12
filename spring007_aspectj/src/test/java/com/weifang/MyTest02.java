package com.weifang;

import com.weifang.s02.SomeService;
import com.weifang.s02.SomeServiceImpl;
import com.weifang.s02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Program: spring
 * @ClassName: MyTest02
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-07-12 10:28
 **/

public class MyTest02 {
    @Test
    public void testAfterReturning() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("s02/applicationContext.xml");
        SomeService someService = (SomeService) ac.getBean("someServiceImpl");
        String s = someService.doSome("张三", 11);
        System.out.println("返回值："+s);
    }
    @Test
    public void testAfterReturning2() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("s02/applicationContext.xml");
        SomeService someService = (SomeService) ac.getBean("someServiceImpl");
        Student student = someService.doOther("张三", 11);
        System.out.println("返回值："+student);
        System.out.println(student.hashCode());
    }
}
