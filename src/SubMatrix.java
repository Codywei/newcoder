/**
 ����ӷ���

 ��һ����������ÿ����Ԫ(����)�Ǻڼ���(��0��1)�������һ����Ч�㷨���ҵ���������ɫ��ͬ������ӷ���

 ����һ��01����mat��ͬʱ��������ı߳�n���뷵������ӷ���ı߳�����֤����߳�С�ڵ���100��

 ����ѭ�����ԴӴ�С�ĳ���˳������ӷ����ķ���
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
                        // �ϱߵ���
                        int top = mat[i][j + k];

                        // �±ߵ���
                        int bottom = mat[i + maxlength - 1][j + k];

                        // ��ߵ���
                        int left = mat[i + k][j];

                        // �ұߵ���
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
