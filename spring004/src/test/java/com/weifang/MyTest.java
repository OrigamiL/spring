package com.weifang;

import com.weifang.s01.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Program: spring
 * @ClassName: MyTest
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-06-13 15:13
 **/

public class MyTest {
    @Test
    public void testComponent() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("s01/applicationContext.xml");
        Student student = (Student)ac.getBean("stu");
        System.out.println(student);
    }
    @Test
    public void testStudent1() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("s02/applicationContext.xml");
        com.weifang.s02.Student student = (com.weifang.s02.Student) ac.getBean("student");
        System.out.println(student);
    }

}
