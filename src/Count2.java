/**
 2�ĸ���

 ���дһ�����������0��n(����n)������2�����˼��Ρ�

 ����һ��������n���뷵��0��n��������2�����˼��Ρ�

 https://blog.csdn.net/huzhigenlaohu/article/details/51779365
 ȡ�� i λ��ߣ���λ�������֣����� 10^i?1�����õ�����ֵ a��
 ȡ�� i λ���֣���������ֵ��
 ������� X������Ϊ a+10^��i?1����
 ���С�� X������Ϊ a��
 ����� X����ȡ�� i λ�ұߣ���λ�����֣���Ϊ b�������Ϊ a+b+1��
 * */
public class Count2 {
    public static int countNumberOf2s(int n) {
        // write code here
        int count = 0;
        for (int i = 1; i <= n; i *= 10) {
            int a = n / i,b = n % i;
            //֮���Բ�8������Ϊ����λΪ0����a/10==(a+8)/10��
            //����λ>=2����8�������λλ��Ч����ͬ��(a/10+1)
            count += (a + 7) / 10 * i + ((a % 10 == 2) ? b + 1 : 0);
        }
        return count;
    }

}