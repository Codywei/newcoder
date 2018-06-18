import java.util.*;

/**
 确定两个字符串乱序同构（字符串）

 给定两个字符串，请编写程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。这里规定大小写为不同字符，且考虑字符串重点空格。

 给定一个string stringA和一个string stringB，请返回一个bool，代表两串是否重新排列后可相同。保证两串的长度都小于等于5000。

 这里有两个不同的方法实现，第一个实现先排序再比较，第二个是创建256维数组，用于记录字符对应ascii码的个数，再比较是否相同
 * */
public class Same {
    public static boolean checkSam1(String stringA, String stringB) {
        char[] c1=stringA.toCharArray();
        char[] c2=stringB.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1,c2);

    }
    public static boolean checkSam2(String stringA, String stringB) {
        int lenA = stringA.length();
        int lenB = stringB.length();
        if(lenA != lenB){
            return false;
           }
        int[] strA = new int[256];
        int[] strB = new int[256];
        for(int i = 0; i < lenA; i++){
           strA[stringA.charAt(i)]++;
           strB[stringB.charAt(i)]++;
        }
       for(int i = 0;i<strA.length;i++){
            if(strA[i]!=strB[i]){
                 return false;
       }
       }
         return true;
    }
    public static void main(String[]args){
        String stringA="kkkbaaa";
        String stringB="akakaka";
        System.out.println(checkSam1(stringA,stringB));
        System.out.println(checkSam2(stringA,stringB));
    }


}