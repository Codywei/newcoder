import java.util.*;
/**
 最长合成子串（编程基础，较难的递归）

 有一组单词，请编写一个程序，在数组中找出由数组中字符串组成的最长的串A，即A是由其它单词组成的(可重复)最长的单词。

 给定一个string数组str，同时给定数组的大小n。请返回最长单词的长度，保证题意所述的最长单词存在。

 先将数组按字符串长度排序，再利用递归判断是否有合适的子串构成当前字符串
 * */
public class LongestString {
    public int getLongest(String[] str, int n) {
        if(n <=  1) {
            return 0;
        }
        //按照长度从大到小排序
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });
        HashSet<String> set = new HashSet<>();
        for(int i = 0; i < n; i++ ) {
            set.add(str[i]);
        }
        for(int i = 0; i < n; i++) {
            if(isOk(str[i], str, 1, set, false)) {
                return str[i].length();
            }
        }
        return 0;


    }

    public boolean isOk(String s, String[] str, int i, HashSet<String> set, boolean isFirst) {
        if(s.length() == 0) {
            return true;
        }
        if(i > s.length()) {
            return false;
        }
        if(i == s.length() && !isFirst) {
            return false;
        }
        String left = s.substring(0, i);
        String right = s.substring(i);
        //类似递归循环，判断以i分割得到的子串是否满足条件，不满足则转到以i+1为分割点
        return (set.contains(left) && isOk(right, str, 1, set, true)) || isOk(s, str, i + 1, set, isFirst);

    }
    public static void main(String []args){
        String []str={"a","b","c","ab","bc","abc"};
        LongestString ls=new LongestString();
        System.out.println(ls.getLongest(str,6));
    }
}
