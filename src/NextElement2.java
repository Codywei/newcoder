/**
��һ���ϴ�Ԫ��II����̻�����

 ������һ�����飬���ҳ�������ÿ��Ԫ�صĺ�����������С��Ԫ�أ�����������Ϊ-1��

 ����һ��int����A������Ĵ�Сn���뷵��ÿ��Ԫ�������ֵ��ɵ����顣��֤A��Ԫ��Ϊ����������nС�ڵ���1000��

 ͬǰһ�⣬ ��һ�����飬���ر������ж�������Ϊ�Ƿ�Ϊ��СԪ�ء�
* */
public class NextElement2 {
    public static int[] findNext(int[] A, int n) {
        int []res=new int[n];
        for(int i=0;i<n;i++){
            res[i]=-1;
        }
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(A[j]>A[i] && (res[i]==-1||res[i]>A[j])) {
                    res[i] = A[j];
                }
            }
        }
        return res;

    }
    public static void main(String[]args){
        int  []A={11,13,10,5,12,21,3};
        int []res=findNext(A,7);
        for(int i=0;i<7;i++){
            System.out.println(res[i]);
        }
    }
}
