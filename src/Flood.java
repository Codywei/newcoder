/**
 洪水

 在一个nxm矩阵形状的城市里爆发了洪水，洪水从(0,0)的格子流到这个城市，在这个矩阵中有的格子有一些建筑，洪水只能在没有建筑的格子流动。

 请返回洪水流到(n - 1,m - 1)的最早时间(洪水只能从一个格子流到其相邻的格子且洪水单位时间能从一个格子流到相邻格子)。

 给定一个矩阵map表示城市，其中map[i][j]表示坐标为(i,j)的格子，值为1代表该格子有建筑，0代表没有建筑。同时给定矩阵的大小n和m(n和m均小于等于100)，请返回流到(n - 1,m - 1)的最早时间。保证洪水一定能流到终点。

 就像题目的意思一样，采用泛洪算法，把建筑全部换成-1，正数用来记录洪水到达每个点的时间。

 每一次循环都寻找上一个时间点被淹没的点，寻找这个点周围仍然为0并且没有建筑的地方，填上新的时间点，直到最后一个格子被淹没。
 * */
public class Flood {
    public static int floodFill(int[][] map, int n, int m) {
    for(int i=0;i<n;i++) {
        for (int j = 0; j < m; j++) {
            if (map[i][j] == 1) {
                map[i][j] = -1;
            }
        }
    }
            map[0][0]=1;
            int count=1;
            while(map[n-1][m-1]==0){
                for( int i=0;i<n;i++){
                    for( int j=0;j<m;j++){
                        if(map[i][j]==count) {
                            if (i != 0) {
                                if (map[i - 1][j] == 0) {
                                    map[i - 1][j] = count + 1;
                                }
                            }

                            if(i!=n-1) {
                                if (map[i + 1][j] == 0) {
                                    map[i + 1][j] = count + 1;

                                }
                            }
                            if(j!=0) {
                                if (map[i][j - 1] == 0) {
                                    map[i][j - 1] = count + 1;
                                }
                            }

                            if(j!=m-1) {
                                if (map[i][j + 1] == 0) {
                                    map[i][j + 1] = count + 1;
                                }
                            }

                            }
                        }
                    }
                count++;
            }
            return count-1;
    }
    public static void main(String[]args){
        int[][] map={{0,1,0},{0,0,0},{0,1,0}};
        System.out.println(floodFill(map,3,3));
    }
}
