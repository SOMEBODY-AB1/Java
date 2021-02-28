package chapter05;

/**
 * @author SOMEBODY
 * @date 2021/1/12 - 11:43
 */
/*
    输出结果为:
            x=true
            y=false
            z=true
 */
public class Homework03 {
    public static void main(String[] args) {
        boolean x,y,z;
        int a = 15;
        int b = 2;
        x = a > b;
        y = a < b;
        z = a !=b;
        System.out.println("x=" + x);
        System.out.println("y=" + y);
        System.out.println("z=" + z);
    }
}
