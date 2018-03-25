import java.util.*;

/**
 空格替换

 请编写一个方法，将字符串中的空格全部替换为“%20”。假定该字符串有足够的空间存放新增的字符，并且知道字符串的真实长度(小于等于1000)，同时保证字符串由大小写的英文字母组成。

 给定一个string iniString 为原始的串，以及串的长度 int len, 返回替换后的string。

 剑指offer有类似的题，但是用java实现有点怪怪的，第一个解法是stringbuffer实现，思路简单，第二个解法用字符数组实现，先计算需要的空间，再从后完成替换，减少字符移动的次数。

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