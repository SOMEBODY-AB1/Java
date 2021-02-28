package Homework01;

/**
 * @author SOMEBODY
 * @date 2021-02-15-16:51
 */
public class Test {
    public static void main(String[] args){
        Address a1 = new Address();
        a1.city = "天津市";
        a1.street = "上古林街道";
        a1.Zipcode = 100100;

        User u1 = new User();
        u1.name = "张三";
        u1.age = 20;
        u1.addr = a1;

        System.out.println(u1.name + "是" + u1.addr.city + "的人");
    }
}
