package com.atguigu.d_if;

public class Demo11IfSwitch {
    public static void main(String[] args) {
        int week = 3;
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
        switch (week){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("星期八...不存在!");
                break;
        }
    }
}
