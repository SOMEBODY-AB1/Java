package chapter06;

/**
 * @author SOMEBODY
 * @date 2021/1/16 - 12:09
 */
/*
    if 语句的语法结构\运行原理
        注:
            1、对于if语句来讲，在任何情况下只可能有一个分支语句执行，不可能有两个及以上的的分支执行
                （一个完整的if语句）
            2、当分支中java语句只有一条时那么大括号可以省略，但是最好写
            3、控制语句和控制语句之间可以嵌套
        写法：
        第一种写法：
            if(布尔表达式){
                java语句
            }
            这里的大括号{}表示一个分支
        第二种：
            if(布尔表达式){
                java语句;
            } else {
                java语句;
            }
        第三种：
            if(布尔表达式){
                java语句
            } else if(布尔表达式){
                java语句
            } else if(布尔表达式){
                java语句
            }
        第四种：
            if(布尔表达式){
                java语句
            } else if(布尔表达式){
                java语句
            } else if(布尔表达式){
                java语句
            } else{
                java语句
            }
 */
public class IfTest01 {
    public static void main(String[] args){
        // 定义一个布尔类型
        boolean sex = true;

        if(sex){
            System.out.println("男");
        }else{
            System.out.println("女");
        }

        // 单等号是赋值运算符，因为sex本身就是布尔类型所以可以直接赋值
        // 这样就没必要写else了
        // if 语句里的sex就是true了所以输出男
        // 不要这样写
         if(sex = true){ // 在这一行sex一定是true
            System.out.println("男");
        }else{
            System.out.println("女");
        }

        /*
        错误:类型不兼容
        int i = 100;
        if(i = 100){
            System.out.println("哈哈");
        }
        */

        // 可以这样写:分支中只有一条java语句，大括号可以省略
        // 系统会自动添加大括号
        if(sex)
            System.out.println("男");
        else
            System.out.println("女");

        sex = false;
        System.out.println(sex ? "男" :"女");
    }
}
