import java.util.Arrays;
/**
 ʵʱ��λ������̻�����

 ����һЩ������ɵ�����Ҫ�������δ��룬�����һ����Ч�㷨������ÿ�δ���һ�����ֺ������ǰ���д������ֵ���λ����(��������ż��������������λ��Ϊ��n/2С�����֣�nΪ�Ѵ������ָ���)��

 ����һ��int����A��Ϊ������������У�ͬʱ�������д�Сn���뷵��һ��int���飬����ÿ�δ�������λ������֤nС�ڵ���1000��

������ ��һ����ʱ�����¼����λ����ǰλ��Ԫ�أ������ȡ��λ��
 * */
public class Middle {
    public static int[] getMiddle(int[] A, int n) {
        int []res=new int[n];
        for(int i=0;i<n;i++){
            int []temp=new int[i+1];
            for(int j=0;j<=i;j++){
                 temp[j]=A[j];
            }
            Arrays.sort(temp);
            res[i]=temp[(temp.length-1)/2];
        }
        return res;
    }
    public static void main(String []args){
        int []A={1,2,3,4,5,6};
        int []res=getMiddle(A,6);
        for(int i=0;i<A.length;i++){
            System.out.println(res[i]);
        }
    }
}
