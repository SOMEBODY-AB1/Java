package chapter06;

import java.util.Scanner;

/**
 * @author SOMEBODY
 * @date 2021/1/19 - 15:12
 */
/*
    判断是否是质数
    质数:2、3、5、7、11、13
    不是质数:4、6、8、9、10、12、14
    能被1和他本身整除
    是大于一的两个整数的乘积
    所有大于2的偶数都是合数。
    所有大于5的奇数中，个位为5的都是合数。
    除0以外，所有个位为0的自然数都是合数。
    所有个位为4，6，8的自然数都是合数。
    最小的（偶）合数为4，最小的奇合数为9。

    重点:主要是 在外部打布尔标记
 */
public class Homework13 {
    public static void main(String[] args) {
        // 从控制台输入一个正整数
        Scanner sc = new Scanner(System.in);
        System.out.print("输入数字:");
        int Num = sc.nextInt(); // 假设输入:8

        // 怎么判断Num是不是质数
        // 1和Num本身不用测试
        // 思路:8/2、8/3、...一直除下去，直到发现有能被整除的数，则表示该数不是质数

        boolean zhiShu = true;

        for (int i = 2; i < Num; i++){
            if (Num % i == 0){ // 对除1和Num本身的其他数能整除
                zhiShu = false;
                break;
            };
        }

        System.out.println(Num + (zhiShu ? "是" : "不是") + "质数");
    }
}
