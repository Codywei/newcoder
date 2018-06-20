/**
 阶乘尾零（编程基础）

 请设计一个算法，计算n的阶乘有多少个尾随零。

 给定一个int n，请返回n的阶乘的尾零个数。保证n为正整数。

 统计所有数字中包含5的个数（2一定比5多，所以只用统计5），5的个数就是尾零的个数。
 * */
public class Factor {
    public static int getFactorSuffixZero(int n) {
        int five=0;
        for(int i=1;i<=n;i++){
            int temp=i;
            while((temp%5)==0){
                temp=temp/5;
                five++;
            }
        }
        return five;
    }
    public static void main(String[]args){
        System.out.println(getFactorSuffixZero(20));
    }
}
