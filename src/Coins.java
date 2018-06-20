/**
 硬币表示（递归、动态规划）

 有数量不限的硬币，币值为25分、10分、5分和1分，请编写代码计算n分有几种表示法。

 给定一个int n，请返回n分有几种表示法。保证n小于等于100000，为了防止溢出，请将答案Mod 1000000007。

 动态规划。迭代处理每一种可能性。（从小面值到大面值）[方法一：一位数组  方法二：二维数组]
 * */
public class Coins {
    public static int countWays1(int n) {

        int []dp = new int[n + 1];
        int []A = {1, 5, 10, 25};
        dp[0]=1;
        for (int i = 0; i < A.length; i++) {
            for (int j = A[i]; j <= n; j++) {
                dp[j] = (dp[j] + dp[j - A[i]]) % 1000000007;
            }
        }

        return dp[n];
    }

    public static int countWays2(int n){
        int []A={1,5,10,25};
        int[][]dp=new int[A.length][n+1];
        for(int j=0;j<=n;j++){
            dp[0][j]=1;
        }
        for(int i=1;i<A.length;i++){
            for(int j=0;j<=n;j++){
                int t=j-A[i];
                if(t>=0){
                    dp[i][j]=(dp[i-1][j]+dp[i][t])%1000000007;
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[A.length-1][n];
    }

    public static void main(String[]args){
        System.out.println(countWays2(34));
    }
}