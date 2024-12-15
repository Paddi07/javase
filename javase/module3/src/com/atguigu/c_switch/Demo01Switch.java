package com.atguigu.c_switch;

import java.util.Scanner;

public class Demo01Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入一个整数");
        int data = sc.nextInt();//变量类型为int
        switch (data){
            /*
            default:
                System.out.println("下面没有了");
                break;//此段放case上面也不影响流程
             */
            case 1://case后的常量值类型要与前面传递的变量类型一致
                System.out.println("人生得意须尽欢");
                break;
            case 2:
                System.out.println("莫使金樽空对月");
                break;
            case 3:
                System.out.println("天生我材必有用");
                break;
            case 4:
                System.out.println("千金散尽还复来");
                break;
            default:
                System.out.println("下面没有了");
                break;//default习惯放case下面

        }

    }
}
