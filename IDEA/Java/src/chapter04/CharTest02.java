package chapter04;

/**
 * @author SOMEBODY
 * @date 2021/1/7 - 20:56
 */
/*
    java 字符转义
        "\"表示转义
        \n 表示换行
        \t 表示 tab
        \U 表示后面的是一个字符的Unicode编码
        \' 表示 '
        \" 表示 "

 */
public class CharTest02 {
    public static void main(String[] args) {

        char c1 = 'a';
        char c2 = '\t';
        // \U 是Unicode编码
        // Unicode是十六进制
        char x = '\u4e2d';
        // System.out.println('''); 不可以
        System.out.println(c1);
        System.out.println(c2);
        System.out.println('\'');
        System.out.println('\\');
        System.out.println("\"test\"");
        System.out.println("“test”");
        System.out.println("'");
        System.out.println('"');
        System.out.println(x);
    }
}
