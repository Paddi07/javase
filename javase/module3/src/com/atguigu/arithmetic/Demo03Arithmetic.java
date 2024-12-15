package com.atguigu.arithmetic;

public class Demo03Arithmetic {
    public static void main(String[] args) {
        int i = 10;
        //i++;
        ++i;

        System.out.println("i = " + i);

        int j = 100;
        int rusult01 = ++j;
        System.out.println("rusult01 = " + rusult01);
        System.out.println(j);
        
        int k = 10;
        int rusult02 = k++;
        System.out.println("rusult02 = " + rusult02);
        System.out.println(k);

        int z = 100;
        System.out.println(z++);
        System.out.println(z);
        System.out.println("===============");

        int x = 10;
        int y = 20;
        int result03 = x++ + --y + ++x;

        /*
          10+19=29
          此时x用完原值,再计算后x为11,则++x = 11+1
          29+12=41
         */

        System.out.println("result03 = " + result03);
        System.out.println("==========================");

        int c = 10;
        c = c++;
        System.out.println(c);//10


    }
}
