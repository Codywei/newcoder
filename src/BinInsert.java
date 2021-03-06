/**
 二进制插入（编程基础）

 有两个32位整数n和m，请编写算法将m的二进制数位插入到n的二进制的第j到第i位,其中二进制的位数从低位数到高位且以0开始。

 给定两个数int n和int m，同时给定int j和int i，意义如题所述，请返回操作后的数，保证n的第j到第i位均为零，且m的二进制位数小于等于i-j+1。

 先让n左移j位，再将两个数做或运算
 * */
public class BinInsert {
    public static  int binInsert(int n, int m, int j, int i) {

        m <<= j;
        return n | m;
    }
    public static void main(String[]args){
        int n=1024;
        int m=19;
        int j=2;
        int i=6;
        int result=binInsert(n,m,j,i);
        System.out.println(Integer.toBinaryString(result));
    }

}