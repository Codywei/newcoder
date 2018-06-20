/**
 2的个数（编程基础）

 请编写一个方法，输出0到n(包括n)中数字2出现了几次。

 给定一个正整数n，请返回0到n的数字中2出现了几次。

 https://blog.csdn.net/huzhigenlaohu/article/details/51779365
 取第 i 位左边（高位）的数字，乘以 10^i-1），得到基础值 a。
 取第 i 位数字，计算修正值：
 如果大于 X，则结果为 a+10^（i-1）。
 如果小于 X，则结果为 a。
 如果等 X，则取第 i 位右边（低位）数字，设为 b，最后结果为 a+b+1。
 * */
public class Count2 {
    public int countNumberOf2s(int n) {
        // write code here
        int count = 0;
        for (int i = 1; i <= n; i *= 10) {
            int a = n / i,b = n % i;
            //之所以补8，是因为当百位为0，则a/10==(a+8)/10，
            //当百位>=2，补8会产生进位位，效果等同于(a/10+1)
            count += (a + 7) / 10 * i + ((a % 10 == 2) ? b + 1 : 0);
        }
        return count;
    }

}
