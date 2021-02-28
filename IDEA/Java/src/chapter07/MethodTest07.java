package chapter07;

/**
 * @author SOMEBODY
 * @date 2021-02-01-15:20
 */
public class MethodTest07 {
    public static void main(String[] args){
        int result = m();
        System.out.println(result);
        int result1 = n();
        System.out.println(result1);

        int result2 = x (1 > 2);
        System.out.println(result2);
}

    /*
    // 缺少返回语句
    public static int m (){
        boolean flag = true;
        if (flag){ // 编译器会认为一下代码可能执行也可能不执行
            return 1;
        }
    }
     */

    // 在同一个域当中，return语句后面不能再写任何的代码
    public static int m (){
        boolean flag = true;
        if (flag){
            return 1;
            // 下面就不能在写语句了
            // 永远执行不到
        }
        return 0;
    }

    public static int n(){
        boolean i = true;
        return i ? 1 : 0;
    }

    public static int x(boolean flag){
        return flag ? 1 : 0;
    }
}
