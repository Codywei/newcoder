/**
 ��żλ��������̻�����

 ���д���򽻻�һ�����Ķ����Ƶ�����λ��ż��λ����ʹ��Խ�ٵ�ָ��Խ�ã�

 ����һ��int x���뷵�ؽ��������int��

 ��ԭ���ֱ���0xAAAAAAAA��0x55555555��&���㣬�õ���żλ��ֵ����λ���ƣ�żλ���ƺ���ӡ�
 * */
public class Exchange {
    public static int exchangeOddEven(int x) {
        int evalval=(x&(0xAAAAAAAA));
        int oddval=(x&(0x55555555));
        return (evalval>>1)+(oddval<<1);
    }
    public static void main(String[]args){
        int a=10;
        System.out.println(exchangeOddEven(a));

    }
}
