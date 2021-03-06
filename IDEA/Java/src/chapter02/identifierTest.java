package chapter02;

/**
 * @author SOMEBODY
 * @date 2021/1/1 - 17:10
 */

/*
    标识符命名规范：
        1、命名规则和命名规范的区别
            命名规则是语法，不遵守就会报错
            命名规范只是说，大家尽量按照统一的规范来命名，不符合规范也行，
            代码可以编译通过的，但是你的代码风格和别人不一样，这个通常也是不允许的
            统一按照规范进行的话，代码的可读性很好
            代码很容易让其他开发人员理解
        2、具体的命名规范
            规范1：见名知意（标识符起名的时候，一看这个标识符就知道是什么意思）
            规范2：遵循驼峰命名方式（一高一低，一高一低...）
                驼峰有益于单词与单词之间很好的进行分隔
                如：BiaoShiFuTest
            规范3：标识符命名要具有一定的含义
            规范4：类名、接口名有特殊要求
                类名和接口名首字母大写，后面每个单侧的首字母大写
                    StudentTest、UserTest，这是类名、接口名
            规范5：变量名、方法名有特殊要求
                变量名和方法名首字母小写，后面每个单词首字母大写
                    nianLing（Nianling、NianLing这样写就不符合）
            规范6：所有常量名全部大写，并且单词与单词之间采用下划线衔接
                USER_AGE：用户年龄
 */
public class identifierTest {
    public static void main(String[] args) {
        // age年龄
        int age = 20;
    }
}
