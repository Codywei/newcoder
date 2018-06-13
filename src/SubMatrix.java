/**
 最大子方阵

 有一个方阵，其中每个单元(像素)非黑即白(非0即1)，请设计一个高效算法，找到四条边颜色相同的最大子方阵。

 给定一个01方阵mat，同时给定方阵的边长n，请返回最大子方阵的边长。保证方阵边长小于等于100。

 两重循环，以从大到小的长度顺序遍历子方阵（四方向）
 * */
public class SubMatrix {
    public static int maxSubMatrix(int[][] mat, int n) {
        int maxlength = n;
        boolean flag = true;
        while (maxlength != 0) {
            for (int i = 0; i <=n - maxlength; i++) {
                for (int j = 0; j <=n - maxlength; j++) {
                    int pixel = mat[i][j];
                    for (int k = 0; k < maxlength; k++) {
                        // 上边的线
                        int top = mat[i][j + k];

                        // 下边的线
                        int bottom = mat[i + maxlength - 1][j + k];

                        // 左边的线
                        int left = mat[i + k][j];

                        // 右边的线
                        int right = mat[i + k][j + maxlength - 1];
                        if (top != pixel || bottom != pixel || left != pixel || right != pixel) {
                            flag = false;
                            break;
                        }

                    }
                    if (flag) {
                        return maxlength;
                    }

                }
            }
            maxlength--;
        }
        return 0;
    }
    public static void main(String[]args){
        int [][]A={{1,1,1},{1,0,1},{1,1,1}};
        System.out.println(maxSubMatrix(A,3));

    }
}
