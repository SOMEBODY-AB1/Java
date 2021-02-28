package chapter07;

/**
 * @author SOMEBODY
 * @date 2021/1/25 - 11:29
 */
public class MethodTest02 {
    // 方法定义在类体当中
    // 方法定义的顺序没有问题

    // x y z 是局部变量
    // 为什么说x y z 执行完之后的内存空间就释放了
    // 如果运行结束后内存不释放,那么在第二次调用的时候
    // 会在同一块内存空间开辟另外的x y z
    // 但是在同一块内存空间不能有相同的变量名
    public static void sumInt(int x, int y){
        int z = x + y;
        System.out.println(x + "+" + y + "=" + z);
    }
    public static void sumDoublie(double i, double u){
        double o = i * u;
        System.out.println(i + "*" + u + "=" + o);
    }
    public static void main(String[] args){
        sumInt(100,200);
        sumInt(666,888);
        sumInt(123,456);

        sumDoublie(66.6, 88.8);
    }
}
