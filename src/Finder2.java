/**
 Ԫ�ز���

 ��һ���Ź�������飬����n����������������������������һ�����ȵ���λ�����磬ԭ����Ϊ[1,2,3,4,5,6]��������λ5��λ�ü������[6,1,2,3,4,5],���ڶ�����λ������飬��Ҫ����ĳ��Ԫ�ص�λ�á�

 �����һ�����Ӷ�Ϊlog������㷨����������

 ����һ��int����A��Ϊ��λ������飬ͬʱ���������Сn����Ҫ���ҵ�Ԫ�ص�ֵx���뷵��x��λ��(λ�ô��㿪ʼ)����֤������Ԫ�ػ��졣

 ���ֲ��ҵļ�ǿ�棬����˼·���Ƕ��֣��ټ���һЩ��������(���ֲ���������һ���������)
 * */
public class Finder2 {
    public static  int findElement(int[] A, int n, int x) {
        // write code here
        //���ֲ���
        //ע�⣺���������е� ����һ���Ź��������
        int left=0;
        int right=n-1;
        int mid=0;
        //������λ�ˣ�����λ֮���м�Ԫ�ص��������߱ض���һ���������

        while(left<=right) {
            mid=(left+right)/2;
            if(A[mid]==x){
                return mid;
            }

            if(A[mid]<x) {
                //A[mid]<A[left] ˵���ұ�������ģ���x>A[right]˵��x��mid���
                if(A[mid]<A[left]&&x>A[right]) {
                    right=mid-1;
                }
                else {
                    left=mid+1;
                }
            }
            else {
                //A[mid]>A[left]˵�����������ģ���x<A[left]��˵��x��mid�ұ�
                if(A[mid]>A[left]&&x<A[left]) {
                    left=mid+1;
                }
                else {
                    right=mid-1;
                }

            }
        }
        return -1;

    }
      public static void main(String []args){
        int []A={6,1,2,3,4,5};
        System.out.println(findElement(A,6,6));
      }
}
