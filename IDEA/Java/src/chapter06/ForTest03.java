package chapter06;

/**
 * @author SOMEBODY
 * @date 2021/1/18 - 9:41
 */
/*
    用for循环求1~100之间奇数之和
 */
public class ForTest03 {
    public static void main(String[] args){
        // 第一种方案
        int sum = 0;

        for (int i = 1; i <=100; i++){
            if (i%2 == 1){
                sum += i;
                // System.out.println(sum);
            }
        }
        System.out.println("1~100所有奇数求和:" + sum);

        // 第二种方案
        // 1 += 2 = 3这样写可以保证每次取出的值都是奇数，不需要判断
        // 这一种方案更佳，推荐写这种代码
        int Sum = 0;
        for (int i = 1; i < 100; i += 2){
            Sum += i;
        }
        System.out.println(Sum);
    }
}
