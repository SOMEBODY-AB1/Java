package chapter03;

/**
 * @author SOMEBODY
 * @date 2021/1/6 - 20:53
 */
/*
    题目：
        通过变量来描述学生的信息
        学生信息包括:学号、姓名、性别、身高。
        其中学号采用整数，姓名采用字符串，性别采用字符型，身高采用浮点型
        (提示:查阅相关资料,在java中如何定义字符串类型的变量，如何定义字符型的变量，还有如何定义浮点型的变量)。
        具体的学生数据有两份，
        第一个学生信息是:学号110，姓名张三，性别男，身高1.85米。
        第二个学生信息是:学号120，姓名李四，性别女，身高1.65米。
        要求最终将学生的信息输出到控制台。
    输出：
        学号=110
        姓名=张三
        性别=男
        身高=1.85米
        ----------------------------------------
        学号=120
        姓名=李四
        性别=女
        身高=1.65米
 */
public class Homework {
    public static void main(String[] args) {
        int stuNomber1 = 110;
        //第一个学生信息
        String stuName1 = "张三"; // String 是字符串型
        char stuSex1 = '男'; //char 是字符型
        double stuHeight1 = 1.85; // double 是浮点型
        System.out.println("学号="+ stuNomber1);
        System.out.println("姓名="+ stuName1);
        System.out.println("性别="+ stuSex1);
        System.out.println("身高="+ stuHeight1+"米");
        System.out.println("----------------------------------------");

        //第二个学生类型
        int stuNomber2 = 120;
        String stuName2 = "李四";
        char stuSex2 = '女';
        double stuHeight2 = 1.65;
        System.out.println("学号="+ stuNomber2);
        System.out.println("姓名="+ stuName2);
        System.out.println("性别="+ stuSex2);
        System.out.println("身高="+ stuHeight2+"米");
    }
}