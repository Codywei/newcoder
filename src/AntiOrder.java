/**
 �����е�����ԣ����ң�

 ��һ�������������������������飬��ǰ��һ�����ں���һ�����֣����������������һ������ԡ������һ����Ч���㷨��������������е�����Ը�����

 ����һ��int����A�����Ĵ�Сn���뷵��A�е�����Ը�������֤nС�ڵ���5000��

 ˫�ر���
 * */
public class AntiOrder {
    public static int count(int[] A, int n) {
        int res=0;
        for(int i=0;i<A.length-1;i++){
           for(int j=i;j<A.length;j++){
               if(A[i]>A[j]){
                   res++;
               }
           }
       }
       return res;
    }
    public static void main(String []args){
        int []A={1,2,3,4,5,0};
        System.out.println(count(A,6));
    }
}
