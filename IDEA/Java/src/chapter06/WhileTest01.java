package chapter06;

/**
 * @author SOMEBODY
 * @date 2021/1/18 - 11:11
 */
/*
    while的语法机制以及执行原理
    1、语法机制:
        while (布尔表达式){
            循环体;
        }
    2、执行原理:
        当布尔表达式为true时，执行循环体，
        循环体结束之后再判断布尔表达式，如果又为true，
        再次执行循环体，
        当布尔表达式为false时，终止循环体

    while循环可能是0次
        当一开始布尔表达式就为false时，就不会执行循环体

        for 和 while 完全可以互换，只不过语法格式不一样

        for (初始化表达式; 布尔表达式; 更新表达式){
            循环体;
        }

        初始化表达式;
        while (布尔表达式){
            循环体;
            更新表达式;
        }
 */
public class WhileTest01 {
    public static void main(String[] args) {

    }
}
