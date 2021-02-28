package chapter07;

/**
 * @author SOMEBODY
 * @date 2021-01-29-11:36
 */
/*
    break;和return;语句的区别
    return;比break;等级更高
 */
public class MethodTest06 {
    public static void main(String[] args){
        for (int i = 0; i < 10; i++){
            if (i % 5 == 0){
                // return; // return;是终止main函数
                // break; // break;是终止for循环
                          // 两者的等级不一样
            }
            System.out.println("i = " + i);
        }
        System.out.println("Hello World!");
    }
}
