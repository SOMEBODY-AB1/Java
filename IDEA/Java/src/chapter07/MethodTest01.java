package chapter07;

/**
 * @author SOMEBODY
 * @date 2021/1/25 - 11:18
 */
/*
    方法:
        如果一个程序没有方法，代码就无法得到复用
 */
public class MethodTest01 {
    public static void main(String[] args){
        // 需求1:计算100 加 200 的值
        int x = 100;
        int y = 200;
        int z = x + y;
        System.out.println(x + "+" + y + "=" + z);

        // 需求2:计算666 加 888 的值
        int a = 666;
        int b = 888;
        int c = a + b;
        System.out.println(a + "+" + b + "=" + c);
    }
}
