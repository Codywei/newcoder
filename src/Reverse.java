/**
 原串翻转（编程基础，字符串）

 请实现一个算法，在不使用额外数据结构和储存空间的情况下，翻转一个给定的字符串(可以使用单个过程变量)。

 给定一个string iniString，请返回一个string，为翻转后的字符串。保证字符串的长度小于等于5000。

 这里有两个方法实现，不过两个方法都用到额外的空间，第一种stringbuffer,第二种字符数组折半交换
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