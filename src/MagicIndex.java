/**
 ħ������I

 ������A[0..n-1]�У�����ν��ħ����������������A[i]=i������һ���������飬Ԫ��ֵ������ͬ����дһ���������ж�������A���Ƿ����ħ����������˼��һ�ָ��Ӷ�����o(n)�ķ�����

 ����һ��int����A��int n���������С���뷵��һ��bool�������Ƿ����ħ��������

 ����������жϣ�����ų������Ĵ��ڵĻ������������������ֵ��Ȼ�������ֵһһ��Ӧ�����Ե���λ�ض�Ϊ�㡣
 * */
public class MagicIndex {

    public static boolean findMagicIndex(int[] A, int n) {

        if(A[0]!=0){
            return false;
        }
        else{
            return true;
        }
    }
    public static void main(String[]main){
        int A[]={0,2,3,4,5,6};
        System.out.println(findMagicIndex(A,6));
    }
}