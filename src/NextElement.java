/**
 ��һ���ϴ�Ԫ��

 ����������һ��int���飬�����ҳ�������ÿ��Ԫ�ص���һ���������Ԫ�ء�

 ����һ��int����A������Ĵ�Сn���뷵��һ��int���飬����ÿ��Ԫ�ر��������һ��Ԫ��,����������Ϊ-1����֤������Ԫ�ؾ�Ϊ��������

 ��һ�����飬���ر������ҵ���һ���ϴ��Ԫ�غ��˳�һ��ѭ����
 * */
public class NextElement {
    public static int[] findNext(int[] A, int n) {
       int []res=new int[n];
       for(int i=0;i<n;i++){
           res[i]=-1;
       }
       for(int i=0;i<n;i++){
           for(int j=i;j<n;j++){
               if(A[j]>A[i]) {
                   res[i] = A[j];
                   break;
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
