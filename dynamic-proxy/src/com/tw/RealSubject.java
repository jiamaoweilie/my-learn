package com.tw;

public class RealSubject implements Subject {
    @Override
    public void hello(String name) {
        System.out.println("Hello  " + name);
    }

    @Override
    public String bye() {
        System.out.println("Goodbye");
        return "Over";
    }
}
