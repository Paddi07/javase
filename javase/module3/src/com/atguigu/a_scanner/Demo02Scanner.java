package com.atguigu.a_scanner;

import java.util.Scanner;

//import java.util.Scanner;(导包格式及位置,但IDEA不需要手动导包)
public class Demo02Scanner {
    public static void main(String[] args) {
        //创建对象
        //输入Scanner后按回车可自动导包
        Scanner sc = new Scanner(System.in);
        //sc.nextInt();键盘录入
        //录入int型整数
        int old1 = sc.nextInt();
        int old2 = sc.nextInt();
        int old3 = sc.nextInt();

        int temp = old1>old2?old1:old2;
        int max = temp > old3 ? temp : old3;
        System.out.println("max = " + max);


    }
}
