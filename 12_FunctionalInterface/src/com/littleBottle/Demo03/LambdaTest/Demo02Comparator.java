package com.littleBottle.Demo03.LambdaTest;

/*
如果一个方法的返回值类型是一个函数式接口，那么就可以直接返回一个 Lambda表达式。
当需要通过一个方法来获取一个java.util.Comparator接口类型的对象作为排序器时，就可以调该方法获取。
 */

import java.util.Arrays;
import java.util.Comparator;

public class Demo02Comparator {
    //定义一个方法，方法的返回值类型使用函数式接口 Comparator
    public static Comparator<String> getComparator() {
        /*return new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //按照字符串的降序排序
                return o1.length()-o2.length();
            }
        };
    }*/

        //方法的返回值类型是一个函数式接口，所有我们可以返回一个 Lambda表达式
        /*return (String o1, String o2)->{
            //按照字符串的降序排序
            return o2.length()-o1.length();
        };*/

        //继续优化
        return (o1, o2)->o2.length()-o1.length();
    }

    public static void main(String[] args) {
        //创建一个字符串数组
        String[] arr = {"aaa","b","cccc","ddddddd"};
        //排序前
        System.out.println(Arrays.toString(arr));   //[aaa, b, cccc, ddddddd]

        Arrays.sort(arr,getComparator());
        //排序后
        System.out.println(Arrays.toString(arr));   //[ddddddd, cccc, aaa, b]
    }
}
