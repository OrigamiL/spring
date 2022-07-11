package com.proxy5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Program: spring
 * @ClassName: ProxyFactory
 * @Version: 1.0
 * @Description: 动态代理工厂
 * @Author: zhezhi
 * @Create-Date: 2022-07-10 13:53
 **/
/*
*   切面：就是那些重复的，公共的，通用的功能称为切面：日志，事务，权限
*   连接点：就是目标方法，因为在目标方法中要实现目标方法的功能和切面功能
*   切入点（Pointcut）：指定切入的位置。多个连接点构成切入点，切入点可以使一个目标方法，可以使一个类的所有方法，可以是某个包下的所有类中的方法
*   目标对象：操作谁谁就是目标对象
* 通知（advice）：来制定切入的时机，是在目标方法执行前还是执行后，还是出错时，还是环绕目标方法切入切面功能。
* */

/*
    execution(public * *(..)):任意的公共方法
    execution(* set*(..)):任何一个以set开头的方法
    execution(* com.xyz.service.impl.*.*(..)):任意的返回类型 在com.xyz.service.impl包下的任意类的任意参数的任意方法
    execution(* com.xyz.service..*.*(..)):任意返回类型 在com.xyz.service包下的所有子包下的任意类的任意参数的任意方法
    execution(* *..service.*.*(..)):service之前可以有任意个包
    execution(* *.service.*.*(..)):service之前只有一个包

    AspectJ的前置通知@Before
    在目标方法执行前切入切面功能，在切面方法中不可以获得目标方法的返回值，只能得到目标方法的签名（方法名 形参个数 修饰符 类型）
* */
public class ProxyFactory {

    public static Object getAgent(Service target,Aop aop) {
        return Proxy.newProxyInstance(
                //类加载器
                target.getClass().getClassLoader(),
                //目标对象实现的所有的接口
                target.getClass().getInterfaces(),
                //代理功能实现
                (proxy, method, args) -> {
                    Object obj = null;
                    try {
                        aop.before();
                        obj = method.invoke(target, args);
                        aop.after();
                    } catch (Exception e) {
                        aop.exception();
                    }
                    return obj;
                }
        );
    }
}
