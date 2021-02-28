package chapter03;

/**
 * @author SOMEBODY
 * @date 2021/1/6 - 19:46
 */
/*
    重：在同一个域中变量名不能重复声明
       变量可以重复赋值但是不能重复声明
 */
public class VarTest03 {
    public static void main(String[] args) {

        //定义一个整形变量，变量名位nianling，存储值为10
        int nianling = 10;
        System.out.println(nianling);

        //重新赋值，50
        nianling = 50;
        System.out.println(nianling);

        //int nianling = 100; 错误（变量名不能重复）
    }
}
