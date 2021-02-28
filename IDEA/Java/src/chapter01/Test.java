package chapter01;

/**
 * @author SOMEBODY
 * @date 2021/1/1 - 14:37
 */
/*
    public class 和 class的区别
    1、一个Java文件可以写多个class
    2、public的类不是必须的
    3、public的类可以没有，但是如果有的话，public修饰的类必须和源文件名保持一致
    4、public的类有且只能有一个
    5、每一个类中都可以编写入口
    6、但在实际开发中只写一个main入口
    7、这只是测试！
 */

class A{
    public static void main(String[] args) {
        System.out.println("Hello!");
    }
}

/*
    public class B{

    }
    错误
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
