package chapter05;

/**
 * @author SOMEBODY
 * @date 2021/1/12 - 12:08
 */
/*
    输出结果为：
            0
            0
            ------------------------
            1
            1
            ------------------------
            1
            2
            ------------------------
            2
            2
 */
public class Homework06 {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        System.out.println(i);
        System.out.println(j);
        i++;
        ++j;
        System.out.println("------------------------");
        System.out.println(i);
        System.out.println(j);
        System.out.println("------------------------");
        System.out.println(i++);
        System.out.println(++j);
        System.out.println("------------------------");
        System.out.println(i);
        System.out.println(j);
    }
}
