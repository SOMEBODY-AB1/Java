package chapter06;

import java.util.Scanner;

/**
 * @author SOMEBODY
 * @date 2021/1/17 - 11:46
 */
public class Homework01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入您所在的月份:");
        int Num = sc.nextInt();

        if (Num == 12 || Num <= 2) {
            System.out.println("冬季");
        } else if (Num <= 5) {
            System.out.println("春季");
        } else if (Num <= 8) {
            System.out.println("夏季");
        } else if (Num <= 11) {
            System.out.println("秋季");
        }
    }
}