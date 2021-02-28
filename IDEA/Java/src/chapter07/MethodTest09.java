package chapter07;

/**
 * @author SOMEBODY
 * @date 2021-02-02-11:33
 */
public class MethodTest09 {
    public static void main(String[] args){
        // 代码转变
        int result = sum(100, 200);
        System.out.println(result);

        System.out.println(sum(10, 20));
        // 代码转变
        boolean flag = m();
        if (flag){
            System.out.println("Hello World!");
        }

        if (m()){
            System.out.println("Hello World1!");
        }

    }

    public static boolean m(){
        return true;
    }

    public static int sum(int i, int t){
        return i + t;
    }
}
