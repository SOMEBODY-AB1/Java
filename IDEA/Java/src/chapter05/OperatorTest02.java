package chapter05;

/**
 * @author SOMEBODY
 * @date 2021/1/10 - 16:59
 */
/*
    关系运算符：
        >
        <
        =
        !=
        >=
        <=
        ==
    注意：
        所有的关系运算符的运算结果都是布尔类型
        不是true就是false，不可能是其他类型值

    在java中：
        =：  赋值运算符
        ==： 关系运算符，判断是否相等

    注意：在两个关系运算符如：== 中间不能加空格
        <= 是对的 < = 是错的
 */
public class OperatorTest02 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        System.out.println(a > b); // false
        System.out.println(a >= b); // true
        System.out.println(a < b); // false
        System.out.println(a <= b); // true
        System.out.println(a == b); // true
        System.out.println(a != b); // false
    }
}
