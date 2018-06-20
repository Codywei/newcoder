/**
 最大连续数列和（编程基础）

 对于一个有正有负的整数数组，请找出总和最大的连续数列。

 给定一个int数组A和数组大小n，请返回最大的连续数列的和。保证n的大小小于等于3000。

 在一轮遍历中，记录每一段连续数列的和，取最大的和（此题连续正和连续负视为连续）
 * */
public class MaxSum {
    public static int getMaxSum(int[] A, int n) {
        int dp0 = A[0], max = A[0];
        for(int i = 1; i < n; i++)
        {
            if(dp0 + A[i] > A[i]) {
                dp0 = dp0 + A[i];
            }
            else {
                dp0 = A[i];
            }
            if(dp0 > max) {
                max = dp0;
            }
        }
        return max;

    }
    public static void main(String[]args){
        int []A={1,2,3,-6,1};
        System.out.println(getMaxSum(A,5));
    }
}
