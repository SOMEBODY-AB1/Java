package chapter04;

/**
 * @author SOMEBODY
 * @date 2021/1/10 - 14:52
 */
/*
    char short byte做混合运算的时候，各自先转换成int类型再做运算

 */
public class IntTest06 {
    public static void main(String[] args) {
        char c1 = 'a';
        byte a = 1;
        // 这里的’+‘是求和运算
        System.out.println(c1 + 1); // 输出结果：98

        // 错误：不兼容类型
        // short s = c1 + a; // 编译器不知道这个加法最后的结果是多少，只知道是int类型

        short s = (short) (c1 + a);
        System.out.println(s);

        int b = 1;

        // 错误类型不兼容
        // b是int类型 x是short类型
        //short x = b;

        short x = (short)b; // 可以运行
        //System.out.println(x);
        System.out.println(x);
    }
}
