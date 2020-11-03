package com.tw;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;

public class DynamicProxy {
    public static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler handler) {
        Constructor constructor = clazz.getConstructor(new Class[] { InvocationHandler.class })
        return new Object();
    }
}
