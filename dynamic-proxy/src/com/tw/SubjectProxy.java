package com.tw;

public class SubjectProxy {
    private Subject vendor;

    public SubjectProxy(Subject vendor) {
        this.vendor = vendor;
    }

    public void hello(String name) {
        System.out.println("Before method, I want to do something.");
        vendor.hello(name);
        System.out.println("After method, I want to do something.");
    }

    public void bye() {
        System.out.println("Before method, I want to do something.");
        vendor.bye();
        System.out.println("After method, I want to do something.");
    }
}
