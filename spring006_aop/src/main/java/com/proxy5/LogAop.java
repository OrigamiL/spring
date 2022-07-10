package com.proxy5;

/**
 * @Program: spring
 * @ClassName: LogAop
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-07-09 17:25
 **/

public class LogAop implements Aop {
    @Override
    public void before(){
        System.out.println("日志开始记录...");
    }
}
