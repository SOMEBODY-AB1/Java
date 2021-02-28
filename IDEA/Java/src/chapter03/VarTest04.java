package chapter03;

/**
 * @author SOMEBODY
 * @date 2021/1/6 - 20:03
 */

    //错误：Error:(12, 16) java: 已在方法 main(java.lang.String[])中定义了变量 i
public class VarTest04 {
    public static void main(String[] args) {
        int i = 10;
        System.out.println(i);

        //double i = 1.3;
        //System.out.println(i);
    }
}
