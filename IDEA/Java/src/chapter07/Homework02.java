package chapter07;

/**
 * @author SOMEBODY
 * @date 2021-02-01-17:19
 */
/*
    判断大于某个数的最小质数
 */
public class Homework02 {
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("请输入一个数:");
        int n = sc.nextInt();

        minPrimeNumber(n);
        /*
        boolean zhiShu = isPrimeNumber(4);
        System.out.println(zhiShu ? "是质数" : "不是质数");
         */
    }

    public static void minPrimeNumber(int n){
        while (!isPrimeNumber(++n)){}
        System.out.println(n);
    }

    public static boolean isPrimeNumber(int num){
        for (int i = 2; i < num; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
