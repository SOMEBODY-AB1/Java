package chapter06;

import java.util.Scanner;

/**
 * @author SOMEBODY
 * @date 2021/1/16 - 16:47
 */
/*
    switch 语句
        1、switch语句语法格式
        switch(值){
        case 值1:
            java语句
            java语句
            break;
        case 值2:
            java语句
            java语句
            break;
        case 值3:
            java语句
            java语句
            break;
        default:
            java语句;
        }
        以上是一个完整的switch语句
            其中:break; 语句和default; 语句不是必须的
        switch语句的值:
            支持int类型以及String类型
            switch语句本质上只支持int类型和String类型
            但是，byte、short、char也可以使用在switch语句中
            因为byte、short、char可以自动进行类型转换

        switch语句中“值”和“值1”、“值2”的比较时会使用“==”来进行比较

        2、switch语句执行原理
            拿“值”和“值1”进行比较，如果相同，执行该分支语句，
            最后遇到break;语句，switch语句终止
            如果“值”与“值1”不相等，会继续拿“值”与“值2”进行比较
            如果相同，则执行该分支中的java语句
        注:如果分支执行了但是分支最后没有“break;”，此时会发生case穿透现象

        所有的case都没有匹配成功，那么最后default分支会执行
 */
public class SwitchTest01 {
    public static void main(String[] args) {
        /*
        switch 只支持int类型或String类型
         long x = 100l;
         switch(x){} 类型不兼容

       但switch((int)x){} 可以，但是可能会损失精度

         但是下面的代码可以，因为小转大自动类型转换

         byte b = 100;
         switch(b){}

         short s = 100;
         switch(s){}

         char c = 'a';
         switch(c){}

        */

        // 代码存在BUG
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入0~6的整数:");
        int num = sc.nextInt();

        switch (num){
            case 0:
                System.out.println("星期日");
                break;
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
        }



        // 关于default语句，当所有的case都没有匹配上时，执行default语句
        switch (num){
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
            default:
                System.out.println("星期日");
        }

        // 关于case合并的问题
        // 用户输入 0、1、2 都是星期日
        switch (num){
            case 0: case 1: case 2:
                System.out.println("星期日");
                break;
            case 3:
                System.out.println("星期一");
                break;
            case 4:
                System.out.println("星期二");
                break;
            case 5:
                System.out.println("星期三");
                break;
            case 6:
                System.out.println("星期四");
                break;
            case 7:
                System.out.println("星期五");
                break;
            case 8:
                System.out.println("星期六");
        }
    }
}
