package chapter07;

/**
 * @author SOMEBODY
 * @date 2021-02-04-12:18
 */
public class Homework03 {
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("请输入一个数字:");
        int Num = sc.nextInt();

        System.out.println(factorial(Num));
    }

    public static int factorial(int n){
        if (n == 1){
            return 1;
        }
        return n * factorial(n - 1);
    }
}
