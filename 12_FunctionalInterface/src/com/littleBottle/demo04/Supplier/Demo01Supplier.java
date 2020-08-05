package com.littleBottle.demo04.Supplier;

/*
常用的函数式接口
jσva.utiL. function. Supplier<T>接口仅包含一个无参的方法: T get（）。用来获取一个泛型参数指定类型的对象数据。
Supplier<T>接口被称之为生产型接口，指定接口的泛型是什么类型，那么接口中的get方法就会生产什么类型的数据
 */

import java.util.function.Supplier;

public class Demo01Supplier {
    //定义一个方法，方法的参数传递 Supplier<T>接口，泛型执行 String，get方法就会返回一个 String
    public static String getString(Supplier<String> sup) {
        return sup.get();
    }

    public static void main(String[] args) {
        //调用 getString方法，方法的参数 Supplier是一个函数式接口，所以可以传递 Lambda表达式
        String s = getString(()->{
            //生产一个字符串，并返回
            return "小水瓶";
        });
        System.out.println(s);


        //lambda优化
        String s2 = getString(()->{
            //生产一个字符串，并返回
            return "大水瓶";
        });
        System.out.println(s2);
    }
}
