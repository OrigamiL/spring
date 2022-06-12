package com.weifang;

import com.weifang.pojo.School;
import com.weifang.pojo.Student;
import com.weifang.pojo.Student1;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Program: spring
 * @ClassName: MyTest
 * @Version: 1.0
 * @Description: 测试
 * @Author: zhezhi
 * @Create-Date: 2022-06-12 08:47
 **/

public class MyTest {

    @Test
    public void testStudent() {
        //程序员创建对象
        //Student student = new Student();
    }
    @Test
    public void testStudentSpring() {
        //由spring容器进行对象的创建
        //如果想从Spring容器中取出对象，则先创建容器对象并启动
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //getBean拿到的是object
        Student student = (Student) ac.getBean("student");
        System.out.println(student);
    }
    @Test
    public void testSchool() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student1 student1 = (Student1) ac.getBean("stu");
        System.out.println(student1);
    }
}
