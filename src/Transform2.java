/**
 ����ת������̻�����

 ��дһ��������ȷ����Ҫ�ı伸��λ�����ܽ�����Aת�������B��

 ������������int A��int B���뷵����Ҫ�ı����λ������

 ����������������������ֵ���м���1.
 * */
public class Transform2 {
    public static int calcCost(int A, int B) {
        int result =A^B ;
        return Integer.bitCount(result);
    }
    public static void main(String[]args){
        int a=1;
        int b=2;
        System.out.println(calcCost(a,b));
    }
}
