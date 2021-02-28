package chapter04;

/**
 * @author SOMEBODY
 * @date 2021/1/10 - 15:42
 */
/*
    1、在java中Boolean类型只有两个值，没有其他值：
       true和false
    2、在实际开发中boolean通常使用在逻辑判断当中(充当条件)
 */
public class BooleanTest01 {
    public static void main(String[] args) {

        // 错误：类型不兼容
        // boolean xingbie = 1;

        boolean sex = true;
        System.out.println(sex);

        if(sex){
            System.out.println("1");
        }else if(false){
            System.out.println("2");
        }else {
            System.out.println("3");
        }
    }
}
