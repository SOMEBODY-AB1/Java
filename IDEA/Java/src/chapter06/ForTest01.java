package chapter06;

/**
 * @author SOMEBODY
 * @date 2021/1/17 - 13:04
 */
/*
    1、for循环的语法机制
        for(初始化表达式; 条件表达式; 更新表达式){
            循环体; // 由java语句构成
        }
        注:
          初始化表达式最先执行，并且只执行一次
          条件表达式必须是布尔类型，也就是true或false
      执行原理：
        先执行初始化表达式，并且只执行一次
        然后执行条件表达式，如果条件表达式为true，那么执行循环体
        循环体结束，执行更新表达式，再次执行条件表达式

        如果条件表达式为false 那么for循环结束

        更新表达式的作用是，用来控制循环的次数
        如果缺失更新表达式的话，有可能会陷入死循环

 */
public class ForTest01 {
    public static void main(String[] args){
        int i = 0;
        for (i=0; i<10; i++){
            System.out.println("i=" + i);
        }
        System.out.println(i); // 输出结果为:10

        // 也可以这样写
        for (i=0; i<10; ){
            i++;
            System.out.println(i);
        }
    }
}
