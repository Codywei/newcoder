import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/**
 变位词排序

 请编写一个方法，对一个字符串数组进行排序，将所有变位词合并，保留其字典序最小的一个串。这里的变位词指变换其字母顺序所构成的新的词或短语。

 例如"triangle"和"integral"就是变位词。

 给定一个string的数组str和数组大小int n，请返回排序合并后的数组。保证字符串串长小于等于20，数组大小小于等于300。

 首先给每个变位词生成一个按字典序排序的key，如果可以相同则字典序值小的放入map中，最后再统一排序。
 * */
public class SortString {
    public static ArrayList<String> sortStrings(String[] str, int n) {
        ArrayList<String> list=new ArrayList<>();
        HashMap<String,String> map=new HashMap<>();
        for(int i=0;i<n;i++){

            char []chars =str[i].toCharArray();
            Arrays.sort(chars);

            /**
              这里chars不能使用tostring方法;
             */
            String key=new String(chars);
            String value=map.get(key);
            if(value==null|| value.compareTo(str[i])>0){
                map.put(key,str[i]);
            }

        }
        list.addAll(map.values());
        Collections.sort(list);
        return list;

    }

    public static  void main(String[]args){
        ArrayList<String> list1=new ArrayList<>();
        String[] str={"ab","ba","abc","cba"};
        list1=sortStrings(str,4);
        for(int i=0;i<list1.size();i++){
            System.out.println(list1.get(i));
        }

    }
}
