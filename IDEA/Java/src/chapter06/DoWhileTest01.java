package chapter06;

/**
 * @author SOMEBODY
 * @date 2021/1/18 - 11:29
 */
/*
    do..while..的语法机制以及执行原理
    1、语法机制:
        do {
            循环体;
        }while (布尔表达式);
        注:while 括号后面要加“;”

    2、执行原理:
        先执行循环体中的代码，执行一次循环体之后，
        判断布尔表达式的结果，如果为true，那么继续执行循环体，
        如果为false，那么就结束循环体

        对于do..while..来说循环体至少执行一次，执行次数是:1~n次
        对于while来说，执行次数是:0~n次
 */
public class DoWhileTest01 {
    public static void main(String[] args) {
        int i = 0;

        // 输出结果为:0~9
        do {
            System.out.println(i);
            i++;
        }while (i < 10);

        System.out.println("===============================");

        // 执行结果是一样的
        i = 0;
        do {
            System.out.println(i++);
        }while (i < 10);

        System.out.println("===============================");

        // 输出结果为1~10
        // 当输出结果为9时i就是9
        // 9 < 10 成立再次执行循环体
        // 但是此时的i 就是10了
        // 输出10 之后10 < 10 不成立
        // 循环体结束
        i = 0;
        do {
            System.out.println(++i);
        }while (i < 10);
    }
}
