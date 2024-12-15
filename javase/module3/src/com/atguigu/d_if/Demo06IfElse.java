package com.atguigu.d_if;

import java.util.Scanner;

public class Demo06IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        // if( (year%4==0&&year%100!=0)||(year%400==0))范例写法
        if (year%4==0&&year%100!=0||year%400==0){
            System.out.println("闰年2月29天");
        }else{
            System.out.println("平年2月28天");
        }
    }
}
