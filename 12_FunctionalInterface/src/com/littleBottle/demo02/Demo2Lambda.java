package com.littleBottle.demo02;

public class Demo2Lambda {
    //定义一个显示日志的方法，方法的参数传递日志的等级和MessageBuilder接口
    public static void showLog(int level,MessageBuilder mb) {
        //对日志的等级进行判断，如果是1级，则调用 MessageBuilder接口中的 builderMessage方法
        if(level==1) {
            System.out.println("如果不满足等级，则不会执行串相加，当前等级满足");
            System.out.println(mb.builderMessage());
        }
    }

    public static void main(String[] args) {
        //定义三个日志信息
        String msg1 = "Hello";
        String msg2 = "World";
        String msg3 = "Java";

        //调用 showLog方法，参数 MessageBuilder是一个函数式接口，所以可以传递 Lambda表达式
        showLog(1,()->{
            //返回一个拼接好的字符串
            return msg1+msg2+msg3;
        });
    }
}
