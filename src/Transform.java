import java.util.*;
/**
 ���ط�ת

 ��һ����NxN�����ʾ��ͼ������ÿ��������һ��int��ʾ�����дһ���㷨���ڲ�ռ�ö����ڴ�ռ�������(����ʹ�û������)����ͼ��˳ʱ����ת90�ȡ�

 ����һ��NxN�ľ��󣬺;���Ľ���N,�뷵����ת���NxN����,��֤NС�ڵ���500��ͼ��Ԫ��С�ڵ���256��

 ������кܶ�˼·���ҵ�˼·���ȰѾ�����ˮƽ�����·�ת���������Խ��߷�ת
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