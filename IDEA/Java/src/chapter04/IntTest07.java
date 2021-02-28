package chapter04;

/**
 * @author SOMEBODY
 * @date 2021/1/10 - 15:07
 */
/*
    结论：多种数据类型做混合运算的时候，最终的结果类型是“最大容量”对应的类型
    但是：除了 char+short+byte 因为这三个在进行混合运算时，会先自动转换成int类型再做运算
 */
public class IntTest07 {
    public static void main(String[] args) {

        long a = 10L;
        char b = 'a';
        short s = 100;
        int d = 30;
        System.out.println(a + b + s + d);

        // 错误：类型不兼容
        // 计算结果为long类型
        // int x = a + b + s + d;
        int x = (int)(a + b + s + d);
        System.out.println(x);

        // int类型和int类型最终结果还是int类型
        int temp = 10 / 3; // 取整数
        System.out.println(temp); // 输出结果：3

        int temp1 = 1 / 2;
        System.out.println(temp1); // 输出结果：0
    }
}
