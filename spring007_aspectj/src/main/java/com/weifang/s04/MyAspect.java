package com.weifang.s04;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

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
    最终通知方法的规范
    1，访问权限是public
    2.方法没有返回值
    3.方法名称自定义
    4。方法没有参数，如果有，只能是JoinPoint
    5. 使用@After注解表明是最终通知
        参数：value：指定切入点表达式

    如果多个切面切入到同一个切入点，可以使用别名简化开发
    使用@Pointcut注解，创建一个空方法，此方法的名称就是别名
    * */

    @Pointcut(value = "execution(* com.weifang.s04.*.*(..))")
    public void myPointcut(){}

    @After(value = "myPointcut()")
    public void myAfter() {
        System.out.println("最终通知功能。。。。");
    }
    @Before(value = "myPointcut()")
    public void myBeforeA(JoinPoint joinPoint) {
        System.out.println("前置通知功能1112。。。。"+joinPoint.getSignature()+ Arrays.toString(joinPoint.getArgs()));
    }
    @Before(value = "myPointcut()")
    public void myBefore(JoinPoint joinPoint) {
        System.out.println("前置通知功能。。。。"+joinPoint.getSignature()+ Arrays.toString(joinPoint.getArgs()));
    }
    @Before(value = "myPointcut()")
    public void myBeforeB(JoinPoint joinPoint) {
        System.out.println("前置通知功能111。。。。"+joinPoint.getSignature()+ Arrays.toString(joinPoint.getArgs()));
    }
    @AfterReturning(value = "myPointcut()", returning = "object")
    public void myAfterReturning(Object object) {

        if (object!=null){
            if (object instanceof String){
                System.out.println("后置通知功能。。。。"+((String) object).toUpperCase());
            }
        }
    }
    @Around(value = "myPointcut()")
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕通知的前置通知功能。。。。");
        Object o = pjp.proceed(pjp.getArgs());
        System.out.println("环绕通知的后置通知功能。。。。");
        return o.toString().toUpperCase();
    }
}
