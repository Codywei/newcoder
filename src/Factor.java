/**
 �׳�β�㣨��̻�����

 �����һ���㷨������n�Ľ׳��ж��ٸ�β���㡣

 ����һ��int n���뷵��n�Ľ׳˵�β���������֤nΪ��������

 ͳ�����������а���5�ĸ�����2һ����5�࣬����ֻ��ͳ��5����5�ĸ�������β��ĸ�����
 * */
public class Factor {
    public static int getFactorSuffixZero(int n) {
        int five=0;
        for(int i=1;i<=n;i++){
            int temp=i;
            while((temp%5)==0){
                temp=temp/5;
                five++;
            }
        }
        return five;
    }
    public static void main(String[]args){
        System.out.println(getFactorSuffixZero(20));
    }
}
