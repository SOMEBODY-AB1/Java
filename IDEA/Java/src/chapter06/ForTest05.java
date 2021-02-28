package chapter06;

/**
 * @author SOMEBODY
 * @date 2021/1/18 - 10:40
 */
/*
    九九乘法表
 */
public class ForTest05 {
    public static void main(String[] args) {
        int a = 0;

        for (int i = 1; i <= 9; i++){
            for (int k = 1; k <= i; k++){
                a = i * k;
                System.out.print(k + "*" + i + "=" + a + " ");
            }
            System.out.println();
        }
    }
}
