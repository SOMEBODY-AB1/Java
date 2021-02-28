package chapter04;

/**
 * @author SOMEBODY
 * @date 2021/1/10 - 15:19
 */
/*
    关于java语言中的浮点型数据
        float   四个字节
        double  八个字节

        float是单精度
        double是双精度

        double更准确

        long类型占用8个字节
        float类型占用4个字节
        注：任意一个浮点型都比整数型空间大
        float容量 > long容量

        浮点型数据在计算机里存储的是近似值

    java中规定，任何一个浮点型数据都是默认被当做double类型来处理
    如果想让这个浮点型数据被当做float类型的话，那么请在字面量后面加上F/f
        1.0默认被当做double来处理
        1.0F被当做float来处理
 */
public class FloatTest01 {
    public static void main(String[] args) {

        // 没有类型转换
        double pi = 3.1415926;
        System.out.println(pi);

        // 需要类型转换
        // 可能会损失精度
        // 第一种方式
        float f = (float) 3.1415926;
        System.out.println(f);

        // 第二种方式
        float g = 3.1415926F;
        System.out.println(g);

        // 错误：类型不兼容
        // 原理：5先转换成double类型，再进行运算，结果是double类型
        // 需要强制类型转换

        //int i = 10.0 / 5;

        // 可以运行
        // 因为10.0先转换成int类型，然后再除以5
        int i = (int)10.0 / 5;
        System.out.println(i); // 结果为：2

        // 可以运行
        // 强转的时候只留下整数位
        int x = (int)(10.0 / 5);
        System.out.println(x);
    }
}
