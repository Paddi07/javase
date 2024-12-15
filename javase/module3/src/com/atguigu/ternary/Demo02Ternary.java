package com.atguigu.ternary;

public class Demo02Ternary {
    public static void main(String[] args) {
        //两个老人一个70岁,一个80岁,求出两个老人的最高年龄:
        int old1 = 70;
        int old2 = 80;

        //String result = old1 >= old2 ? "old1":"old2";
        //System.out.println("result = " + result);错误!

        int max = old1 > old2 ? old1:old2;
        System.out.println("max = " + max);

    }
}
