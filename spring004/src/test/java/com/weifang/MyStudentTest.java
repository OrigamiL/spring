package com.weifang;

import com.weifang.s03.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Program: spring
 * @ClassName: MyTest3
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-06-13 16:31
 **/

public class MyStudentTest {
    @Test
    public void testStudent() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("s03/applicationContext.xml");
        Student student =(Student) ac.getBean("student");
        System.out.println(student);
    }
}
