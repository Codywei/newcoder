/**
 ά��x���ȣ����ң�

 ��������Ҫ����һ������ͬʱҪ���ڶ���ÿ������ʱ����������ȣ����ڵ�ǰ������С�ڵ����������ĸ���(������������)�������һ����Ч�����ݽṹ���㷨��ʵ��������ܡ�

 ����һ��int����A��ͬʱ�������Ĵ�Сn���뷵��һ��int���飬Ԫ��Ϊÿ�μ���������ȡ���֤�����СС�ڵ���5000��

 �������˼򵥵�˫�ر���ʵ�֣�����ȷ������Ӧ�����ö���������߲��������
 * */
public class Rank {
    public  static int[] getRankOfNumber(int[] A, int n) {
        int R[] = new int[n];
        for(int i = 1;i< n;i++){
            for(int j = 0;j<i;j++){
                if(A[j]<= A[i]){
                    R[i]+=1;
                }

            }
        }
        return R;
    }

    public static void main(String []args){
        int []A={1,2,3,4,5,6};
        int []res=getRankOfNumber(A,6);
        for(int i=0;i<res.length;i++) {
            System.out.println(res[i]);
        }
    }
}
