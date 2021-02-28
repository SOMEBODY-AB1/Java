package chapter05;

/**
 * @author SOMEBODY
 * @date 2021/1/12 - 11:24
 */
/*
    输出结果为:
            a=20
            x=11
            b=23
            x=12
            c=24
            x=11
            d=21
            x=10
 */
public class Homework01 {
    public static void main(String[] args) {
        int x = 10;
    /*
        a = 10 + 10;
        x = 10 + 1;
     */
        int a = x + x++;
        System.out.println("a=" + a);
        System.out.println("x=" + x);
    /*
        b = 11 + (11 + 1);
        x = 11 + 1
     */
        int b = x + ++x;
        System.out.println("b=" + b);
        System.out.println("x=" + x);
    /*
        c = 12 + 12;
        x = 12 - 1;
     */
        int c = x + x--;
        System.out.println("c=" + c);
        System.out.println("x=" + x);
    /*
        d = 11 + (11 - 1);
        x = 11 - 1;
     */
        int d = x + --x;
        System.out.println("d=" + d);
        System.out.println("x=" + x);
    }
}