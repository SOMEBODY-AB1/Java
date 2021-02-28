package chapter05;

/**
 * @author SOMEBODY
 * @date 2021/1/12 - 11:48
 */
/*
    6
    6
    8
    8

    6
    6
    7
    5

    4
    4

 */
public class Homework05 {
    public static void main(String[] args) {
        int i = 5;
        int j = 5;
        int m = 5;
        int n = 5;
        i++;
        j = j + 1;
        m--;
        n = n - 1;
        System.out.println(i);
        // 先输出 i ，然后 i 再自加一
        System.out.println(i++);
        // i 先自加一，然后再输出i
        System.out.println(++i);
        // 先输出 i ，然后 i 再自减一
        System.out.println(i--);
        System.out.println(i);
        System.out.println();
        System.out.println(j);
        System.out.println(j++);
        System.out.println(j--);
        System.out.println(--j);
        System.out.println();
        System.out.println(m);
        System.out.println(n);
    }
}
