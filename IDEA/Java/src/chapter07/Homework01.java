package chapter07;

/**
 * @author SOMEBODY
 * @date 2021-02-01-16:47
 */
/*
    判断某个数的阶乘
 */
public class Homework01 {
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("请输入人一个数值:");
        int num = sc.nextInt();

        int retValue = factorial(num);
        System.out.println(num + "的阶乘结果为:" + retValue);
    }

    public static int factorial(int i){
        int result = 1;
        for (int x = i; x > 0; x--){
            result *= x;
        }
        return result;
    }
}
