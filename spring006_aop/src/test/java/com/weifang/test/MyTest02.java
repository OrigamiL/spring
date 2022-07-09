package com.weifang.test;

import com.proxy2.SubBookServiceImpl;
import org.junit.Test;

/**
 * @Program: spring
 * @ClassName: MyTest02
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-07-09 16:31
 **/

public class MyTest02 {
    @Test
    public void testProxy02() {
        SubBookServiceImpl subBookService = new SubBookServiceImpl();
        subBookService.buy();
    }
}
