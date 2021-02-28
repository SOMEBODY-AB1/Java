package chapter03;

/**
 * @author SOMEBODY
 * @date 2021/1/6 - 17:32
 */
/*
    变量的第一个测试程序：Var变量
    1、关于程序当中的数据
        开发软件是为了解决现实世界中的数据
        而现实世界中，有很多问题都是用数据去描述的
        所以软件执行过程中最主要的就是对数据的处理

        软件在处理数据之前需要能够表示数据
        在java中如何去表示数据呢？
        在java中有这样一个概念：“字面量”
        注：java语言中“数据”被称为“字面量”

        字符型字面量：'a'、'b'、'中'
        字符串型字面量：“abc”、“a”、“b”
            注：所有的字符型字面量都是由单引号括起来
               所有的字符串型字面量都是由说引号括起来
            字符型一定是一个字符才能构成“字面量”

            单引号一定是字符型字面量
            双引号一定是字符串型字面量

 */
public class VarTest01 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(3.14);
        System.out.println('a');
        System.out.println('中');
        System.out.println("abc");
        System.out.println(true);
        System.out.println(false);
    }
}
