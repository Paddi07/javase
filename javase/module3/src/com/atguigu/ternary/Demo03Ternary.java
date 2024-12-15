package com.atguigu.ternary;

public class Demo03Ternary {
    public static void main(String[] args) {
        //两个老人一个70岁,一个80岁,求出两个老人的最高年龄:
        int old1 = 70;
        int old2 = 80;
        int old3 = 60;

        int temp = old1 > old2 ? old1:old2;

        int max = temp > old3 ? temp:old3;
        System.out.println("max = " + max);

    }
}
