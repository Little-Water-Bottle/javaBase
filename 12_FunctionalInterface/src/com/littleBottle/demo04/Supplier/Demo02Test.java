package com.littleBottle.demo04.Supplier;

/*
练习:求数组元素最大值
使用 Supplier接口作为方法参数类型，通过 Lambda表达式求出int数组中的最大值。
提示:接口的泛型请使用java.Lang. Integer类。
 */

import java.util.function.Supplier;

public class Demo02Test {
    //定义一个方法，用于获取int类型数组中元素的最大值，方法的参数传递 Supplier接口，泛型使用 Integer
    public static int getMax(Supplier<Integer> sup) {
        return sup.get();
    }

    public static void main(String[] args) {
        //定义一个int类型的数组，并赋值
        int[] arr = {100,34,-324,567,789,-78};

        //调用getMax方法，方法的参数 Supplier是一个函数式接口，所以可以传递 Lambda表达式
        int m = getMax(()->{
            int max = arr[0];
            for (int i : arr) {
                if(i>max) {
                    max = i;
                }
            }
            //返回最大值
            return max;
        });

        System.out.println("数组中的最大数是" + m);
    }
}
