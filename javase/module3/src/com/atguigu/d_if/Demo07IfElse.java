package com.atguigu.d_if;

public class Demo07IfElse {
    public static void main(String[] args) {
        boolean num1 = false;
        boolean num2 = true;
        int i = 1;

        if (num1=num2){//num1和num2赋值为布尔,用=放在if后相当于true
            ++i;
            System.out.println(i);
        }
        if (false){//if()内为false则不走if
            --i;
            System.out.println(i);
        }
    }
}
