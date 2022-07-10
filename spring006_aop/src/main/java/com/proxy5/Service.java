package com.proxy5;

public interface Service {
    //规定当前要实现的业务
    void buy();
    default String show(int age){return null;};
}
