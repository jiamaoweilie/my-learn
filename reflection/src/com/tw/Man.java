package com.tw;

class Man extends Person {

    private int age;

    public Man(String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    public String toString() {
        return "Man [age=" + age + ", name=" + name + "]";
    }
}
