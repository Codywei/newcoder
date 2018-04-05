/**
 �ַ�������

 ��ʵ��һ���㷨��ȷ��һ���ַ����������ַ��Ƿ�ȫ����ͬ����������Ҫ������ʹ�ö���Ĵ洢�ṹ��

 ����һ��string iniString���뷵��һ��boolֵ,True���������ַ�ȫ����ͬ��False���������ͬ���ַ�����֤�ַ����е��ַ�ΪASCII�ַ����ַ����ĳ���С�ڵ���3000��


 ����ʵ�������ַ�������һ�����ַ���ASCII����������λ�ã��е�Υ�棩���ڶ�������ѭ����������ʹ����������ʽ��
 * */
import java.util.*;
public class Different {
    public static boolean checkDifferent1(String iniString) {

        if(iniString.length()>=256){
            return false;
        }
        boolean []check=new boolean[256];
        int val=0;
        for(int i=0;i<iniString.length();i++){
            val=iniString.charAt(i);
            if(check[val]==true){
                return false;
            }
            check[val]=true;
        }
        return true;
    }

    public static boolean checkDifferent2(String iniString) {
        for(int i=0;i<iniString.length()-1;i++){
            for(int j=i+1;j<iniString.length();j++){
                if(iniString.charAt(i)==iniString.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
//��(.)����ʾһ�������飬��\\1����ʾһ���������ã�Ҳ����˵��\\1���롰(.)��������λ�õ�ֵ������ͬ������λ�ö���".*",��ʾƥ��0~n�������ַ����ܵ���˵�����������ʽ��ƥ������ظ��ַ����ַ�����
    public static boolean checkDifferent3(String iniString) {
        return !iniString.matches(".*(.)(.*\\1).*");
    }
    public static void main(String[]args){
        String iniString="abcda";
        System.out.println(checkDifferent1(iniString));
        System.out.println(checkDifferent2(iniString));
        System.out.println(checkDifferent3(iniString));
    }


}
