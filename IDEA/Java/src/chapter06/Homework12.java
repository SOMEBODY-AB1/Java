package chapter06;

import java.util.Scanner;

/**
 * @author SOMEBODY
 * @date 2021/1/18 - 20:11
 */
/*
    阶乘例如5*4*3*2*1
 */
public class Homework12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入数值:");
        int Num = sc.nextInt();

        int sum = 1;
        for (int i = Num; i > 0; i--){
            sum *= i;
            System.out.print(i);
            if (i > 1){
                System.out.print("*");
            }else if (i <= 1){
                break;
            }
        }
        System.out.println("=" + sum);
    }
}
