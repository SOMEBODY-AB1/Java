package chapter07;

/**
 * @author SOMEBODY
 * @date 2021-02-04-11:47
 */
public class RecursionTest02 {
    public static void main(String[] args){
        System.out.println(sum(5));
    }

    public static int sum(int n){
        if (n == 1){
            return 1;
        }
        return n + sum(n - 1);
    }
}
