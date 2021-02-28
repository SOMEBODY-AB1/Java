package chapter07;

/**
 * @author SOMEBODY
 * @date 2021/1/25 - 11:58
 */
/*
一、
    1、方法的语法机制

        [修饰符列表] 返回值类型 方法名 (形式参数列表){
            方法体;
        }

    注:[] 中的成分不是必须的，是可以选择的
        方法体有java语句构成
二、
    2、返回值是什么？
        返回值一般指的是一个方法执行之后的结果
    3、返回值不能空白，当没有返回值时要写 void
    4、如果返回值“不是void”，那么在方法体执行结束时必须使用“return 值;”
    这样的语句来完成值得返回
    除了void以外其他的都必须要有“return 值;”
        return 值; 作用是返回值
        只要有“return”关键字执行，当前方法必然结束
        注:不是整个程序结束

    main {
        // 调用a方法
        a(){} // 如果a方法执行结束，返回值就返回给main方法了
    }
    a(){}

    5、如果返回值是void就不能有“return 值;”
        但是可以有“return;”意思就是结束该方法
三、
    1、方法名
        见名知意
        首字母小写后面的首字母大写
        合法标识符
四、
    1、形式参数列表
        形参中的每一个参数都是“局部变量”，方法结束后内存释放
        形参个数:0~N个
        public static void sumInt(int x, double y, String z, boolean c){}
        当形参有多个时，用“ ,”隔开
 */
/*
    1、方法调用
        语法格式:
            类名.方法名(实际参数列表);
            实参和形参必须一一对应

 */
public class MethodTest03 {
    public static void main(String[] args){
        // 怎么接收返回值？
        // 在调用方法前加数据类型 加变量名
        int result = MethodTest03.sum(100, 200);
        // 也可以用double
        // 小容量转大容量，强制类型转换
        double result1 = MethodTest03.sum(100, 200);
        System.out.println(result);
        System.out.println(result1);

        byte a = 10;
        byte b = 20;
        int result2 = MethodTest03.sum(a, b); // 自动类型转换
        System.out.println(result2);
    }

    public static int sum (int a, int b){
        int x = a + b;
        return x;
    }
}
