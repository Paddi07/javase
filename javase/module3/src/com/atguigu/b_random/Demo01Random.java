package com.atguigu.b_random;

import java.util.Random;

public class Demo01Random {
    public static void main(String[] args) {
        //创建对象
        Random rd = new Random();
        int data = rd.nextInt();
        System.out.println("data = " + data);
        //运行后随机生成一个int取值范围内的数


    }
}