/**
 字符串互异

 请实现一个算法，确定一个字符串的所有字符是否全都不同。这里我们要求不允许使用额外的存储结构。

 给定一个string iniString，请返回一个bool值,True代表所有字符全都不同，False代表存在相同的字符。保证字符串中的字符为ASCII字符。字符串的长度小于等于3000。


 这里实现了三种方法。第一种用字符的ASCII码代表数组的位置（有点违规），第二种两层循环，第三种使用了正则表达式。
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
//“(.)”表示一个捕获组，“\\1”表示一个反向引用，也就是说“\\1”与“(.)”这两个位置的值可以相同，其他位置都是".*",表示匹配0~n个任意字符。总的来说，这个正则表达式是匹配出现重复字符的字符串。
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
