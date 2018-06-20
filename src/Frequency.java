import java.util.HashMap;
/**
 词频统计（编程基础）

 请设计一个高效的方法，找出任意指定单词在一篇文章中的出现频数。

 给定一个string数组article和数组大小n及一个待统计单词word，请返回该单词在文章中的出现频数。保证文章的词数小于等于1000。

 建立一个hashmap，存放所有出现的词的词频。
 * */

public class Frequency {
    public static int getFrequency(String[] article, int n, String word) {
        HashMap <String,Integer>freq=new HashMap();
        for(int i=0;i<n;i++){
           if(!freq.containsKey(article[i])) {
               freq.put(article[i],1);
           }
           else{
               freq.put(article[i],freq.get(article[i])+1);
           }
        }

        return freq.get(word)!=null?freq.get(word):0 ;
    }
    public static void main(String []args){
        String []article={"12","12","23"};
        System.out.println(getFrequency(article,3,"34"));
    }
}
