package chapter04;

/**
 * @author SOMEBODY
 * @date 2021/1/9 - 9:57
 */
/*
    byte 1
    short 2
    int 4
    long 8
    int 是最常用的

    在java中整数的字面量有四种：
        十进制 最常用的 10
        二进制 0b10
        八进制 010
        十六进制 0x10

 */
public class IntTeat01 {
    public static void main(String[] args) {
        // 十进制
        int a = 10;
        System.out.println(a);

        // 二进制
        int b = 0b10;
        System.out.println(b);

        // 八进制
        int c = 010;
        System.out.println(c);

        // 十六进制
        int d = 0x10;
        System.out.println(d);
    }
}
