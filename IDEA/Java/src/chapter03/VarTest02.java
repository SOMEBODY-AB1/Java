    package chapter03;

/**
 * @author SOMEBODY
 * @date 2021/1/6 - 18:27
 */
/*
    什么是变量？
        变量其实就是内存中存储数据的最基本单位

    数据类型有什么作用呢？
        不同的数据类型，会分配不同大小的内存空间

    注：一个字节是8个比特位
       一个比特位是二进制的0或1

       int i = 2;
       在内存中是:00000000 00000000 00000000 00000010

    对于一个变量来说，包括三个东西：
        变量的数据类型
        变量的名字
        变量保存的值
        声明：数据类型 变量名 = 值;

        在java语言中有一个规定，变量必须先声明，再赋值才能访问。（没有赋值相当于这块空间没有分配）
        在java语言中给一个变量赋值：
            使用一个运算符：“=”，它叫做赋值运算符

 */
public class VarTest02 {
    public static void main(String[] args) {
        int nianling;

        //赋值
        nianling = 10;
        System.out.println(nianling);

        //重新赋值
        nianling = 45;
        System.out.println(nianling);
        
    }
}
