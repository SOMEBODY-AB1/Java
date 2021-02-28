package chapter06;

/**
 * @author SOMEBODY
 * @date 2021/1/23 - 14:21
 */
/*
    一天给2.5
    每到5的倍数天时减6
    问什么时候存够100

    两种都可以
 */
public class Homework15 {
    public static void main(String[] args) {
        int day = 0;
        double money = 0;

        while (money <= 100) {
            day++;
            money += 2.5;

            if (day % 5 == 0) { // 天数为五天的倍数时减6
                money -= 6;
            }

            System.out.println(day + "+" + money);
        }

    }
    public static void other(String[] args) {
        double my = 0;
        int day;

        for (day = 1; ; day++) {
            my += 2.5;
            if (day % 5 == 0) {
                my -= 6;
            }
            if (my >= 100) {
                break;
            }
        }
        System.out.println(day + "+" + my);
    }
}
