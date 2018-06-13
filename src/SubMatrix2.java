/**
 �����Ӿ���

 ��һ���������͸�������ɵ�NxN�������д�����ҳ�Ԫ���ܺ������Ӿ����볢��ʹ��һ����Ч�㷨��

 ����һ��int����mat�;���Ľ���n���뷵��Ԫ���ܺ������Ӿ����Ԫ��֮�͡���֤Ԫ�ؾ���ֵС�ڵ���100000���Ҿ������С�ڵ���200��

 �Ѷ�ά����M x N ÿһ�зֱ���ӣ��Ϳ��Եó�һ��һά����(����ΪN�������һά��������������;���ԭ�����а���M��X�е�һ������Ӿ���͡�

 ����ֻ��ö�ٳ�ԭN x N ��������� M x N���Ӿ��������Ӿ���ͣ��Ϳ��Եó������
 * */
public class SubMatrix2 {
    public static int sumOfSubMatrix(int[][] mat, int n) {
        int maxVal = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            int[] temp = mat[i];
            maxVal = Math.max(maxVal,helper(temp));
            for(int j = i + 1; j < n; j++){
                for(int k = 0; k < n; k++){
                    temp[k] += mat[j][k];
                }
                maxVal = Math.max(maxVal,helper(temp));
            }
        }
        return maxVal;
    }
    /**
     * �ҳ������������������
     */

     static int helper(int[] temp2){
        int temp = temp2[0];
        int maxVal = temp;
        for(int i = 1; i < temp2.length; i++){
            if(temp < 0){
                temp = temp2[i];
            }else{
                temp +=temp2[i];
            }
            if(temp > maxVal){
                maxVal = temp;
            }
        }
        return maxVal;
    }

    public static void main(String[]args){
//        int [][]A={{1,2,-3},{3,4,-5},{-5,-6,-7}};
        int [][]A={{10,-10,12},{15,-24,12},{1,-1,1}};
        System.out.println(sumOfSubMatrix(A,3));

    }
}
