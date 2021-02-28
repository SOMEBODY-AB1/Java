package chapter06;

/**
 * @author SOMEBODY
 * @date 2021/1/18 - 12:23
 */
/*
    continue;语句：
        1、continue语句翻译为：继续
        2、continue是终止本次循环，直接进入下一次循环，继续循环

        for (){
            if (){ // 当这个条件成立时，下面的continue执行
                continue; // 当continue执行时下面的代码不再执行，直接进入下一次循环
            }
            code1;
            code2;
            code3;
        }
 */
public class ContinueTest01 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            if (i == 5){
                break;
            }
            System.out.println("i = " + i); // 输出的结果为: 0、1、2、3、4
        }

        System.out.println("==============================");

        for (int i = 0; i < 10; i++){
            if (i == 5){
                continue;
            }
            System.out.println(i);
        }
    }
}
