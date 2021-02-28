package chapter03;

/**
 * @author SOMEBODY
 * @date 2021/1/6 - 20:11
 */
/*
    1、关于变量的一个分类（背）
       变量根据出现的位置进行划分
         在方法体中声明的变量：局部变量
         在方法体外，类体内声明的变量：成员变量

         重点依据：声明的位置
    2、注：局部变量只在方法体中有效，方法体结束该变量的内存就释放了
 */
public class VarTest06 {

    //成员变量
    int i = 100;

    //主方法
    public static void main(String[] args) {
        //局部变量
        int k = 100; //main方法结束k内存释放
        System.out.println(k);
    }
}
