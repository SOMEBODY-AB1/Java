package chapter03;

/**
 * @author SOMEBODY
 * @date 2021/1/6 - 20:21
 */
/*
    变量的作用域
        1、什么是作用域？
            变量的有效范围
        2、关于变量的作用范围，可以记住一句话：
            出了大括号，就不认识它了
 */
public class VarTest07 {

        int i = 300;

    public static void main(String[] args) {
        int i = 100; //这个 i 的有效范围是main方法
        {
            System.out.println(i); // 可以
        }
        System.out.println(i); // 输出结果为 100

        int k;
        for(k=0; k<10; k++){
            System.out.println(k);
        }
        System.out.println(k);
    }

    //在不同的方法体中可以声明同样名字的变量
    public static void x(String[] args) {
        int i = 200; //这个 i 的有效范围是x方法
        System.out.println(i);
    }

    public static void z(String[] args) {
        /*
        错误
        System.out.println(i);
        */
    }

    public static void m(String[] args) {
        for(int n=0; n<10; n++ ){
            System.out.println(n+1);
        }
    }

}

