package chapter06;

/**
 * @author SOMEBODY
 * @date 2021/1/18 - 19:00
 */
/*
    1000以内不能被7整除的数之和

 */
public class Homework10 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i <= 1000; i++){
            if (i%7 != 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
