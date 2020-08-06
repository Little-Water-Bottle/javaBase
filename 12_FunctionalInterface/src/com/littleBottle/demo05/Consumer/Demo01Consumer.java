package com.littleBottle.demo05.Consumer;

/*
java.util.function.Consumer<T>接口则正好与 Supplier接口相反，
它不是生产一个数据，而是消费一个数据，其数据类型由泛型决定。
Consumer接口中包含抽象方法 void accept（T t），意为消费一个指定泛型的数据。
Consumer接口是一个消费型接口，泛型执行什么类型，就可以使用 accept方法消费什么类型的数据
至于具体怎么消费（使用）需要自定义（输出，计算.）
 */

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Demo01Consumer {
    /*
    定义一个方法
    方法的参数传递一个字符串的姓名
    方法的参数传递 Consumer接口，泛型使用 String
    可以使用 Consumer接口消费字符串的姓名
     */


    public static void main(String[] args) {
        String s = new Supplier<String>() {;
            @Override
            public String get() {
                System.out.println("你好");
                return "返回你好";
            }
        }.get();

        System.out.println(s);

        //执行语句的输出结果
        //你好
        //返回你好

        System.out.println("=======================");

        Supplier<String> supplier = ()->{
            System.out.println("hello world");
            return "你好 世界";
        };

        String s2 = supplier.get();
        System.out.println(s2);

        //执行语句输出结果
        //hello world
        //你好 世界

        new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        }.accept("123456");
    }
}
