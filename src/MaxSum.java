/**
 ����������кͣ���̻�����

 ����һ�������и����������飬���ҳ��ܺ������������С�

 ����һ��int����A�������Сn���뷵�������������еĺ͡���֤n�Ĵ�СС�ڵ���3000��

 ��һ�ֱ����У���¼ÿһ���������еĺͣ�ȡ���ĺͣ���������������������Ϊ������
 * */
public class MaxSum {
    public static int getMaxSum(int[] A, int n) {
        int dp0 = A[0], max = A[0];
        for(int i = 1; i < n; i++)
        {
            if(dp0 + A[i] > A[i]) {
                dp0 = dp0 + A[i];
            }
            else {
                dp0 = A[i];
            }
            if(dp0 > max) {
                max = dp0;
            }
        }
        return max;

    }
    public static void main(String[]args){
        int []A={1,2,3,-6,1};
        System.out.println(getMaxSum(A,5));
    }
}
