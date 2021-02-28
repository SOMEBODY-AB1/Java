package chapter04;

/**
 * @author SOMEBODY
 * @date 2021/1/9 - 10:53
 */
/*
    java中的一个很重要的语法规则：
        当这个整数型字面量，没有超出byte的取值范围
        那么这个整形数值就可以直接赋值给byte
    这种语法机制是为了方便编程
 */
public class IntTest04 {
    public static void main(String[] args) {
        // 分析：
        // 300是int 类型的字面量，b是byte类型变量
        // byte b = 300;
        byte b = (byte)300;
        System.out.println(b);

        // 可以直接类型转换
        byte x = 1;
        System.out.println(x);
    }
}
