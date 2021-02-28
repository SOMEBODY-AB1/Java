package chapter06;

import java.util.Scanner;

/**
 * @author SOMEBODY
 * @date 2021/1/16 - 16:13
 */
public class IfTest03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入您的成绩:");
        double results = sc.nextDouble();

        String str = "不及格！";
        if (results < 0 || results >100){
            System.out.println("您输入的成绩无效！");
        } else if (results >= 90){
            str = "优秀!";
        } else if (results >= 80){
            str = "良好！";
        } else if (results >= 70){
            str = "中等";
        } else if (results >= 60){
            str = "及格";
        }
        System.out.println("您的成绩等级是:" + str);
    }
}
