package com.atguigu.a_scanner;

import java.util.Scanner;

//import java.util.Scanner;(导包格式及位置,但IDEA不需要手动导包)
public class Demo01Scanner {
    public static void main(String[] args) {
        //创建对象
        //输入Scanner后按回车可自动导包(可不操作)
        Scanner sc = new Scanner(System.in);//输入后回车可直接导包
        //sc.nextInt();键盘录入
        //录入int型整数
        int data1 = sc.nextInt();
        System.out.println("data1 = " + data1);

        //录入String型字符串
        String data2 = sc.next();
        System.out.println("data2 = " + data2);


    }
}
