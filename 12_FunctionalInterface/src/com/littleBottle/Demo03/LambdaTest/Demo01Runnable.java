package com.littleBottle.Demo03.LambdaTest;

/*
    例如java.Lang. Runnable接口就是一个函式接口，
    假设有一个 start Thread方法使用该接口作为参数，那么就可以使用 Lambda进行传参。
    这种情况其实和 Thread类的构造方法参数为 Runnable没有本质区别。
*/

public class Demo01Runnable {
    //定义一个方法 startThread，方法的参数使用函数式接口 Runnable
    public static void startThread(Runnable run) {
        //开启多线程
        new Thread(run).start();
    }

    public static void main(String[] args) {
        //调用 startThread方法方法的参数是一个接口，那么我们可以传递这个接口的匿名内部类
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "-->" + "线匿名启动了");
            }
        });

        //调用 startThread方法，方法的参数是一个函数式接口，所以可以传递 Lambda表达式
        startThread(()->{
            System.out.println(Thread.currentThread().getName() + "-->" + "线程lambda启动了");
        });

        //优化lambda  无参，函数体就一句   能简则简
        startThread(()->System.out.println(Thread.currentThread().getName() + "-->" + "线程lambda启动了"));


    }


}
