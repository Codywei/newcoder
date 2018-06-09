/**
 叠罗汉II

 叠罗汉是一个著名的游戏，游戏中一个人要站在另一个人的肩膀上。为了使叠成的罗汉更稳固，我们应该让上面的人比下面的人更轻一点。

 现在一个马戏团要表演这个节目，为了视觉效果，我们还要求下面的人的身高比上面的人高。请编写一个算法，计算最多能叠多少人，注意这里所有演员都同时出现。

 给定一个二维int的数组actors，每个元素有两个值，分别代表一个演员的身高和体重。同时给定演员总数n，请返回最多能叠的人数。保证总人数小于等于500。

 动态规划（最长递增子序列，按其中一种属性先从小到大排序）
 * */
public class Stack2 {
    public static int getHeight(int[][] actors, int n) {
        for(int i = 0; i < n-1; i++ ){
            for(int j=i+1;j<n;j++){
                if(actors[j][0]<actors[i][0]){
                    swap(actors,i,j);

                }
            }
        }
        int[] res = new int[n];
        res[0] = 1;
        int max = 1;

        for(int i = 1; i < n; i++) {
            int  t = 0;
            for(int j = 0; j < i; j++) {
                if(actors[i][1] > actors[j][1]){
                    t = Math.max(t, res[j]);
                }
            }
            res[i] = t+1;
            max = Math.max(max, res[i]);
        }
        return max;
    }
    public  static void swap(int [][]A,int i,int j){
        int temp=A[i][0];
        A[i][0]=A[j][0];
        A[j][0]=temp;
        temp=A[i][1];
        A[i][1]=A[j][1];
        A[j][1]=temp;
    }
    public static void main(String[]args){
        int[][]A={{1,2},{5,2},{3,1},{7,8}};
        System.out.println(getHeight(A,4));
    }
}
