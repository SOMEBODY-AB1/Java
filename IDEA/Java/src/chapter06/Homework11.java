package chapter06;

/**
 * @author SOMEBODY
 * @date 2021/1/18 - 19:03
 */
/*
    1+2-3+4-5+6-7+8...+100
    先取1到100每个数字
    基数为相减 1-3-5-7-9-11...-99
    偶数位相加 2+4+6+8+10+12...+100
 */
public class Homework11 {
    public static void main(String[] args) {
        int sum = 1;

        for (int i = 2; i <= 100; i++) {
            if (i % 2 == 1) {
                sum -= i;
            }else if (i % 2 == 0) { // 偶数
                sum += i;
            }
        }
        System.out.println(sum);

        // 1-2+3-4+5-6+7-8...-100
        // 奇数求和
        // 偶数求差
        int sum1 = 0;

        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0){
                sum1 = sum1 - i;
            }else if (i % 2 == 1){
                sum1 = sum1 + i;
            }
        }
        System.out.println(sum1);
    }
}
