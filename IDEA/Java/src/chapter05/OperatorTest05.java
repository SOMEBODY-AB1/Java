package chapter05;

/**
 * @author SOMEBODY
 * @date 2021/1/12 - 9:37
 */
/*
    条件运算符：
        语法格式：
            布尔表达式？表达式1：表达式2
        执行原理：
            表达式的结果为true时，表达式1的执行结果为整个表达式的执行结果
            表达式的结果为false时，表达式2的执行结果为整个表达式的执行结果
 */
public class OperatorTest05 {
    public static void main(String[] args) {
        // '男'; // 不是语句
        boolean sex = false;
        // 不是语句
        // sex ? '男':'女';
        // '男';同等意思

        // 前面的变量 c 的类型不能随便写
        // 最终结果为字符，所以用“char”
        char c = sex ? '男':'女';
        System.out.println(c); // 输出结果为：女

        // String x = sex ? '男':"女"; // 错误：类型不兼容

        System.out.println(sex ? '男':"女"); // 可以：输出结果为:女
    }
}
