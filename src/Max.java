/**
 无判断max

 请编写一个方法，找出两个数字中最大的那个。条件是不得使用if-else等比较和判断运算符。

 给定两个int a和b，请返回较大的一个数。若两数相同则返回任意一个。

 通过公式(a+b+Math.abs(a-b))/2
 * */
public class Max {
    public static int getMax(int a, int b) {
        return (a+b+Math.abs(a-b))/2;
    }
    public static void main(String[]args){
        int a=-3;
        int b=-5;
        System.out.println(getMax(a,b));
    }
}
