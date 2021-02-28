package chapter06;

import java.util.Scanner;

/**
 * @author SOMEBODY
 * @date 2021/1/17 - 12:14
 */
public class Homework06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.printf("请输入第一个数字:");
        double Num1 = s.nextDouble();

        System.out.printf("请输入第二个数字:");
        double Num2 = s.nextDouble();

        System.out.printf("请输入第三个数字:");
        double Num3 = s.nextDouble();

        if (Num1 < Num2){
            if (Num2 < Num3){
                System.out.println(Num1 + "<" + Num2 + "<" + Num3);
            }else if (Num2 > Num3 && Num1 < Num3){
                System.out.println(Num1 + "<" + Num3 + "<" + Num2);
            }else if (Num2 > Num3 && Num1 > Num3){
                System.out.println(Num3 + "<" + Num1 + "<" + Num2);
            }
        }else if (Num1 > Num2){
            if (Num1 < Num3){
                System.out.println(Num2 + "<" + Num1 + "<" + Num3);
            }else if (Num1 > Num3 && Num2 < Num3){
                System.out.println(Num2 + "<" + Num3 + "<" + Num1);
            }else {
                System.out.println(Num3 + "<" + Num2 + "<" + Num1);
            }
        }
    }
}
