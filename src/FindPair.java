import java.util.Arrays;
/**
 �����Բ���

 �����һ����Ч�㷨���ҳ�����������֮��Ϊָ��ֵ�����������ԡ�

 ����һ��int����A�������Сn�Լ�����ҵĺ�sum���뷵�غ�Ϊsum�������Եĸ�������֤�����СС�ڵ���3000��

 ����������Ȼ���������ֱ���ͷ�����������β���ڱ��������м����
 * */
public class FindPair {
    public  static int countPairs(int[] A, int n, int sum) {
        Arrays.sort(A);
        int res=0;
        for(int i=0;i<A.length;i++){
            for(int j=A.length-1;j>i;j--){
                if(A[i]+A[j]==sum){
                    res++;
                }else if(A[i]+A[j]<sum){
                    break;
                }
            }
        }
        return res;
    }

    public static void  main(String[]args){
          int []A={1,2,3,4,5};
          System.out.println(countPairs(A,5,6));
    }
}
