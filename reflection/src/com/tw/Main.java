package com.tw;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // write your code here
        //通过对象的getClass()方法获取Class对象，该方法是Object类下的方法
        Man man = new Man("张三", 8);
        Class c1 = man.getClass();

        //打印Class对象
        System.out.println(c1); //class com.com.tw.Man
        System.out.println(c1.getName());  //com.com.tw.Man
        System.out.println(c1.getSimpleName()); //Man
        System.out.println(c1.getTypeName()); //com.com.tw.Man

        //获取public构造函数数组
        System.out.println(c1.getConstructors()[0]);//public com.com.tw.Man(java.lang.String,int)

        //获取超类
        System.out.println(c1.getSuperclass());//class com.com.tw.Person

        //获取private字段数组
        Field[] f = c1.getDeclaredFields();

        for (Field f0 : f) {
            System.out.println(f0);//private int com.com.tw.Man.age
        }

        //通过“静态”的class属性获取Class对象
        Class c2 = Man.class;
        System.out.println(c2);//class com.com.tw.Man

        //通过Class类的静态方法：forName（String  className）(常用)
        Class c3 = Class.forName("com.com.tw.Man");
        System.out.println(c3);//class com.com.tw.Man


        Constructor con = c1.getConstructor(String.class, int.class);//获取构造器对象
        Man man2 = (Man) con.newInstance("jim", 10);//通过构造器对象创建实例
        System.out.println(man2);

        //Man [age=10, name=jim]

        Class c4 = c1.getSuperclass();//获取超类
        Constructor p = c4.getConstructor(String.class);
        Person person = (Person) p.newInstance("hon");
        System.out.println(person);

        Method method = c4.getDeclaredMethod("setName", String.class);//获取方法对象
        method.invoke(person, "Tony");//激活方法修改器
        System.out.println(person);
    }
}
