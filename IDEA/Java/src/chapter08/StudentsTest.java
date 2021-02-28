package chapter08;

/**
 * @author SOMEBODY
 * @date 2021-02-15-14:37
 */
/*
    对象的创建与使用
 */
/*
    引用和对象的区别
        对象是在堆内存中new 出来的
        引用是存放对象内存地址的一个变量
 */
public class StudentsTest {
    public static void main(String[] args){
        // 创建对象的语法格式
        // new 对象名();
        // Students 属于引用数据类型
        // 访问实例变量：引用.实例变量
        // s1 就是引用
        // new Students(); 就是对象
        Students s1 = new Students(); // 和 int i = 10;
        System.out.println(s1.name);
    }
}
