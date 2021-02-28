package chapter06;

/**
 * @author SOMEBODY
 * @date 2021/1/23 - 15:05
 */
/*
    i = 6;
    k = 1、2、3、4、5;
 */
public class Homework16 {
    public static void main(String[] args) {
        for (int i = 2; i <= 1000; i++){

            int sum = 0;

            for (int k = 1; k <= i/2; k++){
                    if (i % k == 0){
                        sum += k;
                    }
                }
            if (i == sum){
                System.out.println(i);
            }
        }
    }
}

