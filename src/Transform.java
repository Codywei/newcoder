import java.util.*;
/**
 像素翻转

 有一副由NxN矩阵表示的图像，这里每个像素用一个int表示，请编写一个算法，在不占用额外内存空间的情况下(即不使用缓存矩阵)，将图像顺时针旋转90度。

 给定一个NxN的矩阵，和矩阵的阶数N,请返回旋转后的NxN矩阵,保证N小于等于500，图像元素小于等于256。

 这道题有很多思路，我的思路是先把矩阵沿水平线上下翻转，再沿主对角线翻转
 * */
public class Transform {
    public static int[][] transformImage(int[][] mat, int n) {
        int temp = 0;
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n; j++) {
                temp = mat[i][j];
                mat[i][j] = mat[n - 1 - i][j];
                mat[n - 1 - i][j] = temp;

            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        return mat;

    }

    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] mat2 = new int[3][3];
        mat2 = transformImage(mat, 3);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mat2[i][j]+" ");

            }
            System.out.println();
        }
    }
}