package chapter05;

/**
 * @author SOMEBODY
 * @date 2021/1/12 - 10:36
 */
/*
    字符连接运算符 “+”
    1、+ 运算符在java中有两个作用：
        1、求和
        2、字符串拼接

    2、使用
        当 + 两边都是数字时，求和
        当 + 两边的“任意一边”是字符串类型，那么这个 + 会进行字符串拼接操作

    3、一定要记住：字符串拼接完之后还是一个字符串

    口诀:加一个双引号，双引号之间加两个 ++ ，两个 ++ 中间加变量名
        System.out.println("abc"+def+"ghy");
 */
public class OperatorTest06 {
    public static void main(String[] args) {

        int age = 35;
        // + 在这里会进行字符串的拼接操作
        System.out.println("年龄:" + age);

        int i = 100;
        int b = 20;
        // 这个 + 是加法运算
        int c = i + b;
        System.out.println("价钱:" + (i + b));

        // 价钱:是字符串，i 是数字，相加之后还是字符串
        // 字符串 + b 还是拼接操作
        // 所以最后输出的一定是字符串
        System.out.println("价钱:" + i + b); // 输出结果为:价钱:10020

        // 注意：当有多个 + 时，遵循自左向右的顺序依次执行 (除非额外添加了“()”)
        System.out.println(i + b + "110"); // 输出结果为:120110

        // 因为加"()"了所以先运算"()"内的
        System.out.println(i + (b + "110")); // 输出结果为:10020110，还是字符串

        System.out.println(i + "+" + b + "=" + c); // 输出结果:100+20=120

        // 因为没有小括号，所以按照自左向右的顺序执行
        System.out.println(i + "+" + b + "=" + i + b); // 输出结果:100+20=10020

        // 先进行求和运算
        System.out.println(i + "+" + b + "=" + (i + b)); // 输出结果:100+20=120

        String name = "jack";
        System.out.println(name + "的年龄是" + age);

        System.out.println("登录成功欢迎" + name + "回来!");
    }
}
