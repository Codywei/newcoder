import java.util.*;

/**
 �ո��滻

 ���дһ�����������ַ����еĿո�ȫ���滻Ϊ��%20�����ٶ����ַ������㹻�Ŀռ����������ַ�������֪���ַ�������ʵ����(С�ڵ���1000)��ͬʱ��֤�ַ����ɴ�Сд��Ӣ����ĸ��ɡ�

 ����һ��string iniString Ϊԭʼ�Ĵ����Լ����ĳ��� int len, �����滻���string��

 ��ָoffer�����Ƶ��⣬������javaʵ���е�ֵֹģ���һ���ⷨ��stringbufferʵ�֣�˼·�򵥣��ڶ����ⷨ���ַ�����ʵ�֣��ȼ�����Ҫ�Ŀռ䣬�ٴӺ�����滻�������ַ��ƶ��Ĵ�����

 * */
public class Replacement {


    public static String replaceSpace1(String iniString, int length) {
        char[] charArr = iniString.toCharArray();
        int sum=0;
        for(int i=0;i<charArr.length;i++){
            if(charArr[i]==' '){
                sum+=2;
            }
        }
        int newlength=charArr.length+sum;
        char[] newcharArr = new char[newlength];
        int lengthindex=newlength-1;

        for(int i=charArr.length-1;i>=0;i--){
            if(charArr[i]==' '){
                newcharArr[lengthindex--]='0';
                newcharArr[lengthindex--]='2';
                newcharArr[lengthindex--]='%';

            }
            else{
                newcharArr[lengthindex--]=charArr[i];
            }
        }

        return String.valueOf(newcharArr);
    }

    public static String replaceSpace2(String iniString,int length){
        StringBuffer str=new StringBuffer();
        for(int i=0;i<length;i++){
            if(iniString.charAt(i)==' '){
                str.append("%20");

            }
            else{
                str.append(iniString.charAt(i));

            }
        }
        return str.toString();
    }
    public static  void main(String[]args){
        String iniString="werwd rewrw ytyrt";
        System.out.println(replaceSpace1(iniString,17));
        System.out.println(replaceSpace1(iniString,17));
    }
}