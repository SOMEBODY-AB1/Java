package chapter06;

import java.util.Scanner;

/**
 * @author SOMEBODY
 * @date 2021/1/17 - 12:02
 */
public class Homework04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("请输入数字:");
        int Num = sc.nextInt();

        if (Num%2 == 0){
            System.out.println("该数字是偶数！");
        }else {
            System.out.println("该数字是基数！");
        }
    }
}
