import java.util.*;

/**
 ȷ�������ַ�������ͬ�����ַ�����

 ���������ַ��������д����ȷ������һ���ַ������ַ��������к��ܷ�����һ���ַ���������涨��СдΪ��ͬ�ַ����ҿ����ַ����ص�ո�

 ����һ��string stringA��һ��string stringB���뷵��һ��bool�����������Ƿ��������к����ͬ����֤�����ĳ��ȶ�С�ڵ���5000��

 ������������ͬ�ķ���ʵ�֣���һ��ʵ���������ٱȽϣ��ڶ����Ǵ���256ά���飬���ڼ�¼�ַ���Ӧascii��ĸ������ٱȽ��Ƿ���ͬ
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