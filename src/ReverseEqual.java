/**
 翻转子串（编程基础、字符串）

 假定我们都知道非常高效的算法来检查一个单词是否为其他字符串的子串。请将这个算法编写成一个函数，给定两个字符串s1和s2，请编写代码检查s2是否为s1旋转而成，要求只能调用一次检查子串的函数。

 给定两个字符串s1,s2,请返回bool值代表s2是否由s1旋转而成。字符串中字符为英文字母和空格，区分大小写，字符串长度小于等于1000。

 我的解法是将两个s1叠加得到上，再看s3是否包含s2,不过要先判断两个字符串长度是否相同。
 * */
public class ReverseEqual {
    public static boolean checkReverseEqual(String s1, String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }
        String s3=s1+s1;
        if(!s3.contains(s2)){
            return false;
        }
        return true;
    }
    public static void main(String[]args){
        String a="waterbottle";
        String b="erbottlewat";
        System.out.println(checkReverseEqual(a,b));
    }
}
