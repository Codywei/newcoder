/**
 �����Ʋ��루��̻�����

 ������32λ����n��m�����д�㷨��m�Ķ�������λ���뵽n�Ķ����Ƶĵ�j����iλ,���ж����Ƶ�λ���ӵ�λ������λ����0��ʼ��

 ����������int n��int m��ͬʱ����int j��int i�����������������뷵�ز������������֤n�ĵ�j����iλ��Ϊ�㣬��m�Ķ�����λ��С�ڵ���i-j+1��

 ����n����jλ���ٽ���������������
 * */
public class BinInsert {
    public static  int binInsert(int n, int m, int j, int i) {

        m <<= j;
        return n | m;
    }
    public static void main(String[]args){
        int n=1024;
        int m=19;
        int j=2;
        int i=6;
        int result=binInsert(n,m,j,i);
        System.out.println(Integer.toBinaryString(result));
    }

}