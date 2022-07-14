package com.weifang.service.impl;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Program: spring
 * @ClassName: AspectAccountServiceImpl
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-07-14 09:05
 **/

@Aspect
@Component
public class AspectAccountServiceImpl {
    @Pointcut(value = "execution(* com.weifang.service.impl.AccountsServiceImpl.*(..))")
    public void cut(){}
    @Around(value = "cut()")
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕通知前置通知、。。、");

        Object obj = pjp.proceed(pjp.getArgs());
      //  System.out.println(1/0);
        System.out.println("后置通知。。。");
        return obj;
    }
    @After(value = "cut()")
    public void myAfter() {
        System.out.println("最终通知。。");
    }
}
