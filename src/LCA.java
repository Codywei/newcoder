/**
 �����������(��)

 ��һ���������������������㰴�����һ��һ��ش����������α�ţ��������Ϊ1���������������a��b�������һ���㷨�����a��b�������������ȵı�š�

 ��������int a,b��Ϊ�������ı�š��뷵��a��b������������ȵı�š�ע�������㱾��Ҳ����Ϊ�������ȡ�

 ��һ������Ҫ���ö����������ʣ��Ƚϼ򵥣�����������
 * */
public class LCA {
    public static int getLCA(int a, int b) {
        while(a!=b) {
            if (a < b) {
                b = b / 2;
            } else {
                a = a / 2;
            }
        }
        return a;
    }
    public static void main(String[]args){
        int a =12;
        int b=15;
        System.out.println(getLCA(a,b));

    }

}