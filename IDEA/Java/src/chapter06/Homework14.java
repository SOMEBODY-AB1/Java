package chapter06;

import java.util.Scanner;

/**
 * @author SOMEBODY
 * @date 2021/1/23 - 13:45
 */
/*
    *
   ***
  *****
 *******
*********

输入5输出上面

输出空格数:
第一行输出4个 (5-1)
第二行输出3个 (5-2)
第三行输出2个 (5-3)
第四行输出1个 (5-4)
第五行输出0个 (5-5)

输出星号数:
第一行输出1个
第二行输出3个
第三行输出5个
第四行输出7个
第五行输出9个

 */
public class Homework14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个正整数:");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++){ // 控制的总行数
            for (int k = 0; k < rows - i; k++){ // 控制空格数
                System.out.print(" ");
            }
            for (int j = 0; j < i*2-1; j++){ // 控制星号数
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
