/**
 ��ת�Ӵ�����̻������ַ�����

 �ٶ����Ƕ�֪���ǳ���Ч���㷨�����һ�������Ƿ�Ϊ�����ַ������Ӵ����뽫����㷨��д��һ�����������������ַ���s1��s2�����д������s2�Ƿ�Ϊs1��ת���ɣ�Ҫ��ֻ�ܵ���һ�μ���Ӵ��ĺ�����

 ���������ַ���s1,s2,�뷵��boolֵ����s2�Ƿ���s1��ת���ɡ��ַ������ַ�ΪӢ����ĸ�Ϳո����ִ�Сд���ַ�������С�ڵ���1000��

 �ҵĽⷨ�ǽ�����s1���ӵõ��ϣ��ٿ�s3�Ƿ����s2,����Ҫ���ж������ַ��������Ƿ���ͬ��
 * */
public class ReverseEqual {
    public static boolean checkReverseEqual(String s1, String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }
        String s3=s1+s1;
        if(!s3.contains(s2)){
            return false;
        }
        return true;
    }
    public static void main(String[]args){
        String a="waterbottle";
        String b="erbottlewat";
        System.out.println(checkReverseEqual(a,b));
    }
}
