package com.atguigu.logic;

public class Demo02Logic {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        /*boolean result01 = (++a>100)&(++b>10);
        System.out.println("result01 = " + result01);//false
        System.out.println("a = " + a);11
        System.out.println("b = " + b);21

        boolean result02 = (++a>100)&&(++b>10);
        System.out.println("result02 = " + result02);//false
        System.out.println("a = " + a);//11
        System.out.println("b = " + b);//20

        boolean result03 = (++a<100)|(++b>10);
        System.out.println("result03 = " + result03);//true
        System.out.println("a = " + a);//11
        System.out.println("b = " + b);//21

         */
        boolean result04 = (++a<100)||(++b>10);
        System.out.println("result04 = " + result04);//true
        System.out.println("a = " + a);//11
        System.out.println("b = " + b);//20
         /*定义一个变量(a),随意给一个值,判断这个变量接收的值是否在1-100之间:
         1 <= a <= 100 错误,此为数学写法;
         a >= 1 && a <= 100 Java写法,用逻辑运算符拼接多个判断;
         * */

    }
}
