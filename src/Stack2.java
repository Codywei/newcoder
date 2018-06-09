/**
 ���޺�II

 ���޺���һ����������Ϸ����Ϸ��һ����Ҫվ����һ���˵ļ���ϡ�Ϊ��ʹ���ɵ��޺����ȹ̣�����Ӧ����������˱�������˸���һ�㡣

 ����һ����Ϸ��Ҫ���������Ŀ��Ϊ���Ӿ�Ч�������ǻ�Ҫ��������˵���߱�������˸ߡ����дһ���㷨����������ܵ������ˣ�ע������������Ա��ͬʱ���֡�

 ����һ����άint������actors��ÿ��Ԫ��������ֵ���ֱ����һ����Ա����ߺ����ء�ͬʱ������Ա����n���뷵������ܵ�����������֤������С�ڵ���500��

 ��̬�滮������������У�������һ�������ȴ�С��������
 * */
public class Stack2 {
    public static int getHeight(int[][] actors, int n) {
        for(int i = 0; i < n-1; i++ ){
            for(int j=i+1;j<n;j++){
                if(actors[j][0]<actors[i][0]){
                    swap(actors,i,j);

                }
            }
        }
        int[] res = new int[n];
        res[0] = 1;
        int max = 1;

        for(int i = 1; i < n; i++) {
            int  t = 0;
            for(int j = 0; j < i; j++) {
                if(actors[i][1] > actors[j][1]){
                    t = Math.max(t, res[j]);
                }
            }
            res[i] = t+1;
            max = Math.max(max, res[i]);
        }
        return max;
    }
    public  static void swap(int [][]A,int i,int j){
        int temp=A[i][0];
        A[i][0]=A[j][0];
        A[j][0]=temp;
        temp=A[i][1];
        A[i][1]=A[j][1];
        A[j][1]=temp;
    }
    public static void main(String[]args){
        int[][]A={{1,2},{5,2},{3,1},{7,8}};
        System.out.println(getHeight(A,4));
    }
}
