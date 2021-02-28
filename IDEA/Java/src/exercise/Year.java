package exercise;

import java.util.Scanner;

/**
 * @author SOMEBODY
 * @date 2021/1/8 - 14:34
 */
/*
    项目：
        用户输入一个年份，系统判断是否是闰年
 */
public class Year {
    public static void main(String[] args) {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入年份：");
            int yearNum = sc.nextInt();
            if(yearNum%4==0 && yearNum%100!=0){
                System.out.println("普通闰年");
            }
            else {
                if(yearNum%400==0){     // 这样写不好！
                    System.out.println("世纪闰年");
                }
                else {
                    System.out.println("不是闰年");
                }
            }
        }   while (true);
    }
}
