import java.util.*;
/**
 基本字符串压缩

 利用字符重复出现的次数，编写一个方法，实现基本的字符串压缩功能。比如，字符串“aabcccccaaa”经压缩会变成“a2b1c5a3”。若压缩后的字符串没有变短，则返回原先的字符串。

 给定一个string iniString为待压缩的串(长度小于等于10000)，保证串内字符均由大小写英文字母组成，返回一个string，为所求的压缩后或未变化的串。

 这道题主要注意最后一个字符不能遗漏，第二种解法比较省判断
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