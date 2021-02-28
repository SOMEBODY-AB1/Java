package chapter06;

/**
 * @author SOMEBODY
 * @date 2021/1/18 - 11:57
 */
/*
    break;语句:
    1、break; 语句比较特殊，一个单词成为一个语句
        continue也是

    2、break 翻译为:折断

    3、break; 语句可以用在:
        第一:用在switch语句中，用来终止switch语句
        第二:用在循环语句中，用来终止循环语句
            用在for、while、do..while.. 当中
    4、break 语句的执行并不会让整个方法结束
        break会让离他最近的循环体结束
 */
public class BreakTest01 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            if (i == 5){
                break;
            }
            System.out.println("i = " + i); // 输出的结果为: 0、1、2、3、4
        }

        // a: 意思是给for循环起名，这样写可以直接终止外循环
        // 很少见
        a:for (int k = 0; k < 2; k++){
            b:for (int i = 0; i < 10; i++){
                if (i == 5){
                    break a;
                }
                System.out.println("i ==> " + i);
            }
        }
    }
}
