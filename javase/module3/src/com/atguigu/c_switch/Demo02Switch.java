package com.atguigu.c_switch;

import java.util.Scanner;

public class Demo02Switch {
    public static void main(String[] args) {
       //float num = 2.5;
      // switch (num){}  -->直接报错

        Scanner sc = new Scanner(System.in);//直接int num = 10;也行,但学了Scanner就要用\
        int data = sc.nextInt();
        switch (data) {
            case 1://case后的常量值类型要与前面传递的变量类型一致
                System.out.println("人生得意须尽欢");

            case 2:
                System.out.println("莫使金樽空对月");

            case 3:
                System.out.println("天生我材必有用");

            case 4:
                System.out.println("千金散尽还复来");
                break;
            default:
                System.out.println("下面没有了");
                break;
        }

    }
}
