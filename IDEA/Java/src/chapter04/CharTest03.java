package chapter04;

/**
 * @author SOMEBODY
 * @date 2021/1/10 - 14:12
 */
/*
    1、整数能否直接赋值给Char吗？
        char b = 97;
        可以运行，并且输出结果为：a
        由此可以得出两个结论：
            第一：当一个整数赋值给char类型变量时会自动转换成char字符型
            第二：当一个整数没有超出byte short char的取值范围时
                 这个整数可以直接赋值给byte short char类型的变量

 */
public class CharTest03 {
    public static void main(String[] args) {

        char a = 'a';
        System.out.println(a);

        // 可以
        char b = 97;
        System.out.println(b);

        char c = 65535;
        System.out.println(c);

        // char d = 65536; // 错误65536超出了char的取值范围，需要强制类型转换
        char d = (char)65536;
        System.out.println(d); // 输出结果为乱码
    }
}
