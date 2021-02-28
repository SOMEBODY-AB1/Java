package chapter06;

import java.util.Scanner;

/**
 * @author SOMEBODY
 * @date 2021/1/16 - 16:32
 */
public class Homework08 {
    public static void main(String[] args) {
        do {
            Scanner s = new Scanner(System.in);
            System.out.print("请输入您所在地的天气(1代表雨天，0代表晴天):");
            int weather = s.nextInt();

            System.out.print("请输入您的性别(1代表男，0代表女):");
            int sex = s.nextInt();

            if (weather == 1) {
                if (sex == 1) {
                    System.out.println("打一把大黑伞");
                } else {
                    System.out.println("打一把大花伞");
                }
            } else if (weather == 0) {
                if (sex == 1) {
                    System.out.println("直接出去玩");
                } else {
                    System.out.println("擦点防晒霜，出去玩");
                }
            }
            System.out.println("=======================================");
        } while (true);
    }
}
