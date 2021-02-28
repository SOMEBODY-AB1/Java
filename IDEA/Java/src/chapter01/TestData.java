package chapter01;

/**
 * @author SOMEBODY
 * @date 2020/12/30 - 14:11
 */
/*
************
程序的注释写法
************
*/
/*
对这一源程序解释
    1、在Java中任何有效的代码必须写到“类体”当中，最外层必须是一个类的定义。
    2、public表示公开的，class表示定义一个类，TestData表示类名。
       类名后面必须是一对大括号，这一对大括号被称为“类体”
    3、代码缩进：我包着你，你就比我低一级，你就需要缩进。
*/
public class TestData { // 声明/定义一个公开的类，名字叫TestData
    /*
    这两行代码被称为：main方法（程序的入口）  main方法也叫作主方法。
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    也就是说：JVM在执行程序的时候，会主动去找这样一个方法，没有这样一个规格的方法，程序不会执行。
    注：方法必须放在“类体”中
    */
    //注：args可以任意更改。
    public static void main(String[] args) {
        /*
        方法体：放在类体中
        注：方法体是用一条一条的Java语句构成
           方法体中的代码是逐行去执行的
        任何一条Java语句必须是以“;”结尾（英文！）
        System.out.println("Hello World!"); 这就是方法体
        */
        System.out.println("Hello World!");
    }
}
