package chapter06;

/**
 * @author SOMEBODY
 * @date 2021/1/18 - 10:07
 */
/*
    for循环嵌套
        执行原理:

 */
public class ForTest04 {
    public static void main(String[] args){
        for(int i = 0; i < 2; i++){
            for (int k = 0; k < 10; k++){
                System.out.println(k);
            }
        }

        System.out.println("===================================");

        // 输出结果为0~9 只输出一次
        // t 只会初始化一次
        int t = 0;
        for (int l = 0; l < 2; l++){
            for ( ; t < 10; t++){
                System.out.println(t);
            }
        }
    }
}
