package com.weifang.s03;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @Program: spring
 * @ClassName: MyAspect
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-07-12 15:03
 **/

@Aspect
@Component
public class MyAspect {
    /*
    环绕通知方法的规范
    1.访问权限 public
    2.切面方法返回值 目标方法的返回值
    3.方法名称自动以
    4.方法参数就是目标方法本身
    5.回避异常
    6.使用@Around注解声明是环绕通知
        参数：value:指定切入点表达式
    * */

    @Around(value = "execution(* com.weifang.s03..*(..))")
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕通知中的前置功能、。、。");
        Object obj = pjp.proceed(pjp.getArgs());
        System.out.println("环绕通知中的后置功能。。。。");
        return obj.toString().toUpperCase();
    }
}
