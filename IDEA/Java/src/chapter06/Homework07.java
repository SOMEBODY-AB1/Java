package chapter06;

import java.util.Scanner;

/**
 * @author SOMEBODY
 * @date 2021/1/17 - 12:28
 */
/*
    起步价8元
    >3km 1.2/km
    >5km 1.5/km
 */
public class Homework07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("请输入您的公里数(km):");
        double matter = sc.nextDouble();

        double i = 8;
        double t;

        if (matter == 0){
            System.out.println("您的总价钱为:0元");
        }else if (matter <= 3){
            System.out.println("您的总价钱为:" + i + "元");
        }else if (matter <= 5){
            t = (matter - 3) * 1.2;
            System.out.println("您的总价钱为:" + (t + i) + "元");
        }else if (matter > 5){
            t = ((matter - 5) * 1.5) +2.4;
            System.out.println("您的总价钱为:" + (t + i) + "元");
        }else {
            System.out.println("您输入的里程数无效！");
        }
    }
}
