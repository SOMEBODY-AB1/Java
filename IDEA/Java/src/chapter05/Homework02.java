package chapter05;

/**
 * @author SOMEBODY
 * @date 2021/1/12 - 11:38
 */
/*
    输出结果为：
            15/2=7
            15%2=1
            15/2.0=7.5
            15%2.0=1.0
 */
public class Homework02 {
    public static void main(String[] args) {
        int a = 15;
        int b = 2;
        double c = 2;
        System.out.println(a + "/" + b + "=" + (a/b));
        System.out.println(a + "%" + b + "=" + (a%b));
        System.out.println(a + "/" + c + "=" + (a/c));
        System.out.println(a + "%" + c + "=" + (a%c));
    }
}
