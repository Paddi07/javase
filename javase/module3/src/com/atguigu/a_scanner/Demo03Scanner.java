package com.atguigu.a_scanner;

import java.util.Scanner;

public class Demo03Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data1 = sc.next();
        //String data1 = sc.next();输入hhh haha,date1只能接收到hhh
        //String data1 = sc.nextLine();输入hhh haha,date1都能接收到
        //sc.next()和 sc.nextLine()连起来用会出现问题
        System.out.println("data1 = " + data1);


    }
}
