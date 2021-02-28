package chapter06;

import java.util.Scanner;

/**
 * @author SOMEBODY
 * @date 2021/1/16 - 15:29
 */
public class IfTest02 {
    public static void main(String[] args){
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入您的年龄:");
            int age = sc.nextInt();

            System.out.println("----------------------------------------");

            if (age == 20030208){
                System.out.println("正在停止运行...");
                System.out.println("========================================");
                System.exit(0);
            }

        /*
            // ||或者
            if (age < 0 || age > 150) {
                System.out.println("您输入的年龄无效！");
            } else if (age <= 5) {
                System.out.println("您的年龄阶段是:婴幼儿！");
            } else if (age <= 10) {
                System.out.println("您的年龄阶段是:少儿！");
            } else if (age <= 18) {
                System.out.println("您的年龄阶段是:少年!");
            } else if (age <= 35) {
                System.out.println("您的年龄阶段是:青年!");
            } else if (age <= 55) {
                System.out.println("您的年龄阶段是:中年!");
            } else {
                System.out.println("您的年龄阶段是:老年!");
            }

         */

         // 升级代码
            String str = "老年";
            if (age < 0 || age > 150) {
                System.out.println("您输入的年龄无效！");
                return;
            }else if(age <= 5) {
                str = "婴幼儿";
            }else if(age <= 10) {
                str = "少儿";
            }else if(age <= 18) {
                str = "少年";
            }else if(age <= 35) {
                str = "青年";
            }else if(age <= 55) {
                str = "中年";
            }
            System.out.println("您的年龄阶段为:" + str + "!");

            System.out.println("========================================");
        } while (true);
    }
}
