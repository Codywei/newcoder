/**
 整数转化（编程基础）

 编写一个函数，确定需要改变几个位，才能将整数A转变成整数B。

 给定两个整数int A，int B。请返回需要改变的数位个数。

 先求两个数的异或，再求异或值里有几个1.
 * */
public class Transform2 {
    public static int calcCost(int A, int B) {
        int result =A^B ;
        return Integer.bitCount(result);
    }
    public static void main(String[]args){
        int a=1;
        int b=2;
        System.out.println(calcCost(a,b));
    }
}
