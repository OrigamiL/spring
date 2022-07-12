package com.weifang.s04;

import org.springframework.stereotype.Service;

/**
 * @Program: spring
 * @ClassName: SomeServiceImpl
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-07-12 15:02
 **/

@Service
public class SomeServiceImpl implements SomeService {
    @Override
    public String doSome(String name, int age) {

        System.out.println("doSome方法执行了。、。、。"+"name:"+name+"age:"+age);
        //System.out.println(1/0);
        return "a";
    }
}
