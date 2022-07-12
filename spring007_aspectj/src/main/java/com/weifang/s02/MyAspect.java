package com.weifang.s02;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @Program: spring
 * @ClassName: MyAspect
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-07-12 10:15
 **/

@Aspect
@Component
public class MyAspect {
    /*
    后置通知的方法的规范：
    1.访问权限是public
    2。方法没有返回值
    3.方法名称自定义
    4.方法有参数（也可以没有参数，如果目标方法没有返回值，则可以写无参，但是一般会写有参，这样可以处理无参及有参）切面方法的参数就是目标方法的返回值
    5.使用@AfterReturning注解表明是后置通知
        参数:
            value:指定切入点表达式
            returning：指定目标方法的返回值的名称，此名称必须与切面方法的参数名称一致。
    * */
    @AfterReturning(value="execution(* com.weifang.s02.*.*(..))",returning = "object")
    public void myAfterReturning(Object object){
        System.out.println("后置通知功能实现。。。。");
        if(object!=null){
            if(object instanceof String){
                object = object.toString().toUpperCase();
                System.out.println("切面方法中目标方法的返回值："+object);
            }
            if(object instanceof Student){
                ((Student) object).setAge(100);
                ((Student) object).setName("李四");
                System.out.println(object.hashCode());
            }
        }
    }
}
