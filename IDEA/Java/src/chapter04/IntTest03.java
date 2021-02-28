package chapter04;

/**
 * @author SOMEBODY
 * @date 2021/1/9 - 10:34
 */
/*
    1、小容量可以自动赋值给大容量：自动类型转换
    2、大容量不能直接赋值给小容量，需要强制类型转换符进行强制类型转换
    但是需要注意的是：加强制类型转换符后虽然编译通过了，但是运行程序的时候可能会损失精度
    强制类型转换：(int)
 */
public class IntTest03 {
    public static void main(String[] args) {
        long f = 100L;
        // int i = f; // 会报错,没有这种语法，大容量不能直接赋值给小容量

        int i = (int)f;// (int)就是强制类型转换符，加上去就能编译通过
                       // 但是要注意的是：虽然编译通过了，但是运行的时候可能会损失精度
        System.out.println(i);
    }
}
