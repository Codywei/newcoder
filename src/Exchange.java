/**
 奇偶位交换（编程基础）

 请编写程序交换一个数的二进制的奇数位和偶数位。（使用越少的指令越好）

 给定一个int x，请返回交换后的数int。

 将原数分别与0xAAAAAAAA，0x55555555作&运算，得到奇偶位的值，奇位右移，偶位左移后相加。
 * */
public class Exchange {
    public static int exchangeOddEven(int x) {
        int evalval=(x&(0xAAAAAAAA));
        int oddval=(x&(0x55555555));
        return (evalval>>1)+(oddval<<1);
    }
    public static void main(String[]args){
        int a=10;
        System.out.println(exchangeOddEven(a));

    }
}
