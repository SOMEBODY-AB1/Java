package chapter06;

import java.util.Scanner;

/**
 * @author SOMEBODY
 * @date 2021/1/17 - 11:53
 */
public class Homework02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入您所在的月份:");
        int Num = sc.nextInt();

        switch (Num){
            case 3: case 4: case 5:
                System.out.println("春季");
                break;
            case 6: case 7: case 8:
                System.out.println("夏季");
                break;
            case 9: case 10: case 11:
                System.out.println("秋季");
                break;
            case 12: case 1: case 2:
                System.out.println("冬季");
                break;
        }
    }
}
