package chapter07;

/**
 * @author SOMEBODY
 * @date 2021-01-29-11:25
 */
/*
    代码遵行自上而下的顺序逐行执行
 */
public class MethodTest05 {
    public static void main(String[] args){
        m1();
    }

    public static void m1(){
        m2();
    }

    public static void m2(){
        T.m3();
    }
}

class T {
    public static void m3(){
        System.out.println("Hello World!");
    }
}
