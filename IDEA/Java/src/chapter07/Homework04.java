package chapter07;

/**
 * @author SOMEBODY
 * @date 2021-02-05-14:59
 */
public class Homework04 {
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("请输入一个数字：");
        int Num = sc.nextInt();

        System.out.println(factorial(Num));
    }

    public static int factorial(int n){
        int product = 1;
        for (int i = n; i > 0; i--){
            product *= i;
        }
        return product;
    }
}
