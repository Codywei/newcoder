/**
 ���ж�max

 ���дһ���������ҳ����������������Ǹ��������ǲ���ʹ��if-else�ȱȽϺ��ж��������

 ��������int a��b���뷵�ؽϴ��һ��������������ͬ�򷵻�����һ����

 ͨ����ʽ(a+b+Math.abs(a-b))/2
 * */
public class Max {
    public static int getMax(int a, int b) {
        return (a+b+Math.abs(a-b))/2;
    }
    public static void main(String[]args){
        int a=-3;
        int b=-5;
        System.out.println(getMax(a,b));
    }
}
