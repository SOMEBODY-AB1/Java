package chapter05;

/**
 * @author SOMEBODY
 * @date 2021/1/10 - 17:56
 */
/*
    赋值运算符
        1、赋值运算符包括基本赋值运算符和扩展赋值运算符
        2、基本赋值运算符：=
        3、扩展赋值运算符：+=、-=、*=、/=、%=
            注意：扩展运算符在编写时，中间不能加空格
                +=正确
                + =错误


        很重要的语法机制：使用扩展赋值运算符时，永远都不会改变运算结果的类型
        byte i = 1;
        i += 1000;
        输出结果还是byte类型，只不过会损失精度
 */
public class OperatorTest04 {
    public static void main(String[] args) {

        // 赋值运算符“=”右边的优先级比较高，限制性右边的表达式
        // 然后将右边的表达式执行结束的结果放到左边的“盒子”当中（赋值）
        int i = 10;
        // 重新赋值
        i = 20;

        /*
            以+=为例
         */
        int k = 10;
        k += 20; // 相当于追加20
        System.out.println(k); // 输出结果为：30

        byte m = 10;
        m += 20; // 输出结果为：30
        // 等价于 m = (byte)(m + 1)
        System.out.println(m);

        byte b = 100;
        b += 200; // 超出byte的取值范围了
        System.out.println(b); // 输出结果为：44，会自动损失精度

        int x = 100;
        x += 100;
        System.out.println(x); // 输出结果为：200
        x -= 100;
        System.out.println(x); // 输出结果为：100
        x *=10;
        System.out.println(x); // 输出结果为：1000
        x /= 30;
        System.out.println(x); // 输出结果为：33
        x %= 10;
        System.out.println(x); // // 输出结果为：3
    }
}
