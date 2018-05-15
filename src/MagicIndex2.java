/**
 ħ������II

 ������A[0..n-1]�У�����ν��ħ����������������A[i]=i��

 ����һ�����½����У�Ԫ��ֵ������ͬ����дһ���������ж�������A���Ƿ����ħ����������˼��һ�ָ��Ӷ�����o(n)�ķ�����

 ����һ��int����A��int n���������С���뷵��һ��bool�������Ƿ����ħ��������

 ���ö��ֲ������ݹ�
 * */

public class MagicIndex2 {
    public  static boolean findMagicIndex2(int[] A, int n) {
        // write code here
        if(A==null||A.length<n||n<0) {
            return false;
        }
        return find(A,0,n-1);
    }
    public  static boolean find(int[] A,int low,int high){
        if(low>high) {
            return false;
        }
        if(low==high){
            if(A[low]==low) {
                return true;
            }
            else {
                return false;
            }
        }
        int mid=(low+high)/2;
        if(A[mid]==mid) {
            return true;
        }

        return find(A,low,mid-1)||find(A,mid+1,high);
    }
    public static void main(String[]args){
        int[]A={1,1,1,2,3};
        System.out.println(findMagicIndex2(A,5));
    }
}