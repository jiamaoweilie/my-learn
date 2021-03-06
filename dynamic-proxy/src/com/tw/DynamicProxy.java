package com.tw;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {
    // 这个就是我们要代理的真实对象
    private Object object;

    // 构造方法，给我们要代理的真实对象赋初值
    public DynamicProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object object, Method method, Object[] args) throws Throwable {
        // 在代理真实对象前我们可以添加一些自己的操作
        System.out.println("Before method, I want to do something.");
        // 当代理对象调用真实对象的方法时，其会自动的跳转到代理对象关联的handler对象的invoke方法来进行调用
        Object obj = method.invoke(this.object, args);
        // 在代理真实对象后我们也可以添加一些自己的操作
        System.out.println("After method, I want to do something.");
        return obj;
    }
}
