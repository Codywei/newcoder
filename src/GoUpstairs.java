/**
 ��¥��

 �и�С��������¥�ݣ�¥����n��̨�ף�С��һ�ο�����1�ס�2�ס�3�ס���ʵ��һ������������С���ж�������¥�ķ�ʽ��Ϊ�˷�ֹ������뽫���Mod 1000000007

 ����һ��������int n���뷵��һ������������¥�ķ�ʽ������֤nС�ڵ���100000��

 �ö�̬�滮�������жϵ����ڶ���״̬����ֹ״̬��ǰһ��״̬���м��֣��ٸ��ݳ�ʼ�����Ƶ�ÿ��״̬ת�Ƶ�ͨ�ù�ʽ��
 * */
public class GoUpstairs {
    public static int countWays(int n) {
        int n1=1;
        int n2=2;
        int n3=4;
        int sum=0;
        if(n==1){
            return n1;
        }
        if(n==2){
            return n2;
        }
        if(n==3){
            return n3;
        }

        for(int i=4;i<=n;i++){
            sum=((n1+n2)%1000000007+n3)%1000000007;
            n1=n2;
            n2=n3;
            n3=sum;
        }
        return  sum;
    }
    public static void main(String[]args){
        System.out.println(countWays(4));
    }
}