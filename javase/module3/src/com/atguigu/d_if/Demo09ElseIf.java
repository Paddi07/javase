package com.atguigu.d_if;

import java.util.Scanner;

public class Demo09ElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int week = sc.nextInt();
        /*if (week == 7){
            System.out.println("星期天");
        } else if (week == 6) {
            System.out.println("星期六");
        } else if (week == 5) {
            System.out.println("星期五");
        } else if (week == 4) {
            System.out.println("星期四");
        } else if (week == 3) {
            System.out.println("星期三");
        } else if (week == 2) {
            System.out.println("星期二");
        } else if (week == 1) {
            System.out.println("星期一");
        }else{
            System.out.println("数字有误");
        }*/

        if (week<1 || week>7){
            System.out.println("数字有误");
        }else{
            if (week == 7){
                System.out.println("星期天");
            } else if (week == 6) {
                System.out.println("星期六");
            } else if (week == 5) {
                System.out.println("星期五");
            } else if (week == 4) {
                System.out.println("星期四");
            } else if (week == 3) {
                System.out.println("星期三");
            } else if (week == 2) {
                System.out.println("星期二");
            } else if (week == 1) {
                System.out.println("星期一");
            }
        }

    }
}
