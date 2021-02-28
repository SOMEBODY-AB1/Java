package chapter03;

/**
 * @author SOMEBODY
 * @date 2021/1/6 - 20:02
 */
/*
    一行可以声明多个变量
 */
public class VarTest05 {
    public static void main(String[] args) {

        int a,b,c,d = 100; //一行可以声明多个变量，但没有被赋值，只对d赋值，为100
        int i,g,t,m;
        i = 1;
        g = 2;
        t = 3;
        m = 4;
        //System.out.println(a);
        //输出结果：Error:(20, 28) java: 可能尚未初始化变量a

    }
}
