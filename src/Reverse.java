/**
 ԭ����ת����̻������ַ�����

 ��ʵ��һ���㷨���ڲ�ʹ�ö������ݽṹ�ʹ���ռ������£���תһ���������ַ���(����ʹ�õ������̱���)��

 ����һ��string iniString���뷵��һ��string��Ϊ��ת����ַ�������֤�ַ����ĳ���С�ڵ���5000��

 ��������������ʵ�֣����������������õ�����Ŀռ䣬��һ��stringbuffer,�ڶ����ַ������۰뽻��
 * */

import java.util.*;

public class Reverse {

    public static String reverseString1(String iniString) {

        StringBuffer s=new StringBuffer();
        for(int i=0;i<iniString.length();i++){
            s.append(iniString.charAt(iniString.length()-1-i));
        }
        return s.toString();
    }

    public static String reverseString2(String iniString) {

        char [] stringArr =iniString.toCharArray();
        char tmp=' ';
        for(int i=0;i<stringArr.length/2;i++){
           tmp=stringArr[i];
           stringArr[i]=stringArr[stringArr.length-1-i];
           stringArr[stringArr.length-1-i] =tmp;

        }
        return String.valueOf(stringArr);
    }

    public static void main(String[]args){
        String iniString="abcda";
        System.out.println(reverseString1(iniString));
        System.out.println(reverseString2(iniString));

    }
}