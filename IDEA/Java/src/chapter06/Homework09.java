package chapter06;

import java.util.Scanner;

/**
 * @author SOMEBODY
 * @date 2021/1/16 - 17:39
 */
/*
    switch 案例，重！！
 */
public class Homework09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入您的成绩:");
        double mark = sc.nextDouble();

        int grade = (int)(mark/10); // 95.5/10 = 9.55 int 类型为9

        String str = "不及格";
        switch (grade){
            case 10:
                str = "满分";
                break;
            case 9:
                str = "优秀";
                break;
            case 8:
                str = "良好";
                break;
            case 7:
                str = "中等";
                break;
            case 6:
                str = "及格";
                break;
        }
        System.out.println(str);
    }
}
