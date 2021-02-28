package chapter06;

import java.util.Scanner;

/**
 * @author SOMEBODY
 * @date 2021/1/17 - 11:59
 */
public class Homework03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入数字:");
        double Num = sc.nextDouble();

        if (Num > 0){
            System.out.println("该数字是正数！");
        }else {
            System.out.println("该数字是负数！");
        }
    }
}
