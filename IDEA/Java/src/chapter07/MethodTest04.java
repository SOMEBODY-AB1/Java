package chapter07;

/**
 * @author SOMEBODY
 * @date 2021-01-29-11:15
 */
/*
    第一次跨类调用方法

    在本类中调用方法时可以省略类名
    在其他类中要加上类名
 */
public class MethodTest04 {
    public static void main(String[] args){
        println();
        MyClass.println();
    }

    public static void println(){
        System.out.println("Hello Wrold!");
    }

    public static void println2(){
        System.out.println("Hello World2!");
    }
}

class MyClass {
    public static void println(){
        System.out.println("你好世界！");
    }

    public static void println2(){
        System.out.println("你好世界2!");
    }
}
