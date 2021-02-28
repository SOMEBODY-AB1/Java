package chapter05;

/**
 * @author SOMEBODY
 * @date 2021/1/10 - 17:08
 */
/*
    逻辑运算符：
        &   逻辑与
        |   逻辑或
        !   逻辑非
        &&  短路与
        ||  短路或

    重：逻辑运算符两边要求必须都是布尔类型，并且最终运行结果也是布尔类型
 */
public class OperatorTest03 {
    public static void main(String[] args) {
        int a = 100;
        int b = 101;
        int c = 90;


        // 同真为真，有假即假
        System.out.println(a < b & a > c); // true
        System.out.println(a < b & a < c); // false

        // 有真即真，同假即假
        System.out.println(a < b | a > c); // true
        System.out.println(a > b | a > c); // true

        // 假真即假，假假即真
        System.out.println(!true); // false
        System.out.println(!false); // true

        // 注意这里需要加‘()’
        System.out.println(!(a > b)); // true
        System.out.println(!(a < b)); // false
        /*
            关于短路与 && ; 短路或 ||
            短路 && 和 逻辑 & 的区别
                这两个运算符的结果没有任何的区别，完全一样
                但是“短路 && ”会发生短路现象
            什么是短路现象？
                在使用短路与&& 时，当左边为false时，右边不执行
                这种情况就叫做短路
            什么时候使用 && 什么时候使用 &
                从效率的方面来讲
                && 比 & 的效率更高
            以后的开发中，短路与&&和逻辑与& 还是需要同事并存的
                大部分情况下都建议使用短路与
                只有当既需要左边表达式执行，又需要右边的表达式执行时
                才会选择逻辑与&
         */

        System.out.println(true & true); // true
        System.out.println(true & false); // false
        System.out.println(false & false); // false

        System.out.println(true && true); // true
        System.out.println(true && false); // false
        System.out.println(false && false); // false

        // 接下来理解一下短路现象
        int x = 10;
        int y = 20;
        System.out.println(x < y && x < y++);
        System.out.println(y); // 21

        int m = 30;
        int n = 50;
        System.out.println(m > n && m> n++);
        System.out.println(n); // 50

        // 当左边的表达式为true时，短路或||发生短路，右边表达式不执行
    }
}
