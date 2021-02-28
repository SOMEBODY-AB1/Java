package chapter04;

/**
 * @author SOMEBODY
 * @date 2021/1/9 - 10:11
 */
/*
    在java中有一条非常重要的结论：
        重：在任何情况下，整数的“字面量\数据”都默认被当做’int‘类型处理

        如希望该“整数型字面量”被当做‘long’类型来处理，需要在‘字面量’后面加‘L\l’
        建议使用大写L
 */
public class IntTest02 {
    public static void main(String[] args) {
        // 不存在类型转换
        // 100被当做int类型
        // int类型的字面量被赋给int类型的变量
        int i = 100;
        System.out.println(i);

        // 存在类型转换
        // b变量是long类型，100默认是int类型 long类型占8个字节，int类型占4个字节
        // 小容量可以自动转换成大容量，这种操作被称为：自动类型转换
        long b = 100;
        System.out.println(b);

        // 这个不存在类型转换
        // 在整形字面量100后面加L后，100L联合起来就是long类型字面量
        // c是long类型变量，吧long类型100L赋值给long类型c，不存在类型转换
        long c = 100L;
        System.out.println(c);

        long d = 2147483647;
        System.out.println(d);

        // long e = 2147483648; // 编译器报错，2147483648超过int的最大值
                                // 记住：不是e放不下，而是2147483648超过了int能存放的最大值
        // 怎么解决？
        long f = 2147483648L; // 这样就解决了
        System.out.println(f);


    }
}
