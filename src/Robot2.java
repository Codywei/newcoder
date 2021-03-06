/**
 机器人走方格II（递归、动态规划）

 有一个XxY的网格，一个机器人只能走格点且只能向右或向下走，要从左上角走到右下角。请设计一个算法，计算机器人有多少种走法。注意这次的网格中有些障碍点是不能走的。

 给定一个int[][] map(C++ 中为vector >),表示网格图，若map[i][j]为1则说明该点不是障碍点，否则则为障碍。另外给定int x,int y，表示网格的大小。

 请返回机器人从(0,0)走到(x - 1,y - 1)的走法数，为了防止溢出，请将结果Mod 1000000007。保证x和y均小于等于50。

 先将边界确定（第一行和第一列的值），排除障碍点后再用动态规划。
 * */
public class Robot2 {
    public static int countWays2(int[][] map, int x, int y) {
        int[][] dp=new int[x][y];
        //为第一行赋初值
        for(int k=0;k<y;k++){
            if(map[0][k]==1){
                //从起点开始向右走就只有一种走法
                dp[0][k]=1;
            }
            else {
                //如果有障碍，则就无法到达，所以dp[0][k]=0,该行后边的自然也都无法到达
                dp[0][k]=0;
                break;
            }
        }
        //为第一列赋初值
        for(int k=0;k<x;k++){
            if(map[k][0]==1) {
                //从起点开始向下走就只有一种走法
                dp[k][0]=1;

            }
            else {
                //如果有障碍，则就无法到达，所以dp[k][0]=0,该行后边的自然也都无法到达
                dp[k][0]=0;
                break;
            }
        }

        for(int i=1;i<x;i++){
            for(int j=1;j<y;j++){
                if(map[i][j]!=1){
                    //要到达的点是障碍点则说明不可达。所以dp[i][j]=0
                    dp[i][j]=0;
                }
                else {
                    dp[i][j] = (dp[i - 1][j] + dp[i][j - 1]) % 1000000007;
                }
            }
        }
        return dp[x-1][y-1];
    }
    public static void main(String[]args){
        int[][]map={{1,0},{1,1}};
        System.out.println(countWays2(map,2,2));
    }
}