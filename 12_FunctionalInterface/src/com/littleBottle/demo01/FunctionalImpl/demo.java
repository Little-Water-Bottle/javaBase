package com.littleBottle.demo01.FunctionalImpl;

public class demo {
    //定义一个方法，参数是哦用该函式接口MyFunctionalInterface
    public static void show(MyFunctionalInterface myInter) {
        myInter.method();
    }

    public static void main(String[] args) {
        show(new MyFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("使用匿名内部类重写接口中的抽象方法");
            }
        });

        //调用show方法，方法的参数是一个函数时接口，所以我们可以lambda表达式
        show(()-> {
            System.out.println("使用lambda表达式重写接口中的抽象方法——未使用简化");
        });

        //简化lambda表达式
        show(()-> System.out.println("使用lambda表达式重写接口中的抽象方法——简化lambda "));  //() 括号里的是参数列表

    }
}