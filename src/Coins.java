/**
 Ӳ�ұ�ʾ���ݹ顢��̬�滮��

 ���������޵�Ӳ�ң���ֵΪ25�֡�10�֡�5�ֺ�1�֣����д�������n���м��ֱ�ʾ����

 ����һ��int n���뷵��n���м��ֱ�ʾ������֤nС�ڵ���100000��Ϊ�˷�ֹ������뽫��Mod 1000000007��

 ��̬�滮����������ÿһ�ֿ����ԡ�����С��ֵ������ֵ��[����һ��һλ����  ����������ά����]
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