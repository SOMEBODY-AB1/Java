package chapter05;

/**
 * @author SOMEBODY
 * @date 2021/1/10 - 16:20
 */
/*
    算数运算符
        +   求和
        -   求差
        *   乘积
        /   商
        %   取余数(求模)
        ++  自加一
        --  自减一

    对于 ++ 来说：
        ++ 可以出现在变量前也可以出现在变量后

    对于 -- 来说
        -- 可以出现在变量前也可以出现在变量后
 */
public class OperatorTest01 {
    public static void main(String[] args) {
        int a = 10;
        int c = 3;

        System.out.println(a + c); // 13
        System.out.println(a - c); // 7
        System.out.println(a * c); // 30
        System.out.println(a / c); // 3
        System.out.println(a % c); // 1

        // 重点掌握 ++ 和 --
        // ++ 等于自加1
        // ++ 可以出现在变量前也可以出现在变量后
        int i = 10;
        i++;
        System.out.println(i);

        // 研究：++ 在变量前和变量后的区别

        // ++在变量后
        int m = 10;
        int n = m++;
        System.out.println(n); // 结果为：10
        System.out.println(m); // 结果为：11

        // ++在变量前
        // 语法规则：当++出现在变量前面时，会先进行自加一的运算，然后再赋值
        int x = 100;
        int y = ++x;
        System.out.println(x); // 结果为：101
        System.out.println(y); // 结果为：101

        // 传，这个“传”在这里有一个简单的隐形运算，
        int s = 100;
        System.out.println(s++); // 输出结果为：100
        // 拆解
        // int temp = s++; // 先把s的值赋值给temp 然后再 自加一
        // System.out.println(temp);
        System.out.println(s); // 输出结果为：101

        int p = 80;
        System.out.println(++p); // 输出结果为：81
        // 拆解
        // int temp = ++p; // p先 自加一 后再赋值给temp
        // System.out.println(temp);
        System.out.println(p); // 输出结果为：81

        // 研究：-- 运算符测试

        // -- 在字面量后后面
        int l = 100;
        System.out.println(l--); // 输出结果为：100
        // 拆解
        // int temp = l--; // l先赋值给temp 然后再 自减一
        // System.out.println(l);
        System.out.println(l); // 输出结果为：99

        int j = 80;
        System.out.println(--j); // 输出结果为：79
        // 拆解
        // int temp = --j
        // System.out.println(); j先 自减一 然后再赋值给temp
        System.out.println(j); // 输出结果为：79
    }
}
