import java.util.*;
/**
 �����ַ���ѹ��

 �����ַ��ظ����ֵĴ�������дһ��������ʵ�ֻ������ַ���ѹ�����ܡ����磬�ַ�����aabcccccaaa����ѹ�����ɡ�a2b1c5a3������ѹ������ַ���û�б�̣��򷵻�ԭ�ȵ��ַ�����

 ����һ��string iniStringΪ��ѹ���Ĵ�(����С�ڵ���10000)����֤�����ַ����ɴ�СдӢ����ĸ��ɣ�����һ��string��Ϊ�����ѹ�����δ�仯�Ĵ���

 �������Ҫע�����һ���ַ�������©���ڶ��ֽⷨ�Ƚ�ʡ�ж�
 * */
public class Zipper {
    public static String zipString1(String iniString) {
        // write code here
        int sum=1;
        char temp= ' ';
        StringBuffer str=new StringBuffer();
        for(int i=0;i<iniString.length();i++){
            if(i==0){
                temp=iniString.charAt(i);
            }
            else{
                if(iniString.charAt(i)==temp){
                    sum+=1;
                    if(i==iniString.length()-1){
                        str.append(temp);
                        str.append(sum);
                    }
                }
                else{
                    str.append(temp);
                    str.append(sum);
                    temp=iniString.charAt(i);
                    sum=1;
                    if(i==iniString.length()-1){
                        str.append(temp);
                        str.append(sum);
                    }
                }
            }
        }
        if(str.toString().length()<iniString.length()) {
            return str.toString();
        }
        else{
            return iniString;
        }
    }
    public static String zipString2(String iniString) {


        int low = 0 , high = 0 ;

        int len = iniString.length();

        StringBuilder sb = new StringBuilder();

        char c = ' ';

        int count = 0;

        while(low < len){
            high = low;
            c = iniString.charAt(low);
            while((high < len)&&(iniString.charAt(high) == c)){
                high ++;
            }
            count = high - low ;
            sb.append(c);
            sb.append(count);
            low = high;
        }



        return (sb.toString().length() < len)?sb.toString():iniString;
    }

    public static void main(String[]args){
        String inistring ="gggggggggggggggewrwerwe";
        System.out.println(zipString1(inistring));
        System.out.println(zipString2(inistring));

    }
}