import java.util.*;
/**
 最大字母矩阵（编程基础）

 有一个单词清单，请设计一个高效算法，计算由清单中单词组成的最大子矩阵，要求矩阵中的行和列都是清单中的单词。

 给定一个string数组dic，代表单词清单，同时给定清单的大小n，请返回最大子矩阵的面积。保证单词清单的大小小于等于50，且某一长度的串的数量小于等于12。

 单词出现的次数*单词长度(题目有歧义)
 * */
public class AlphaMatrix {
    public static int findAlphaMatrix(String[] dic, int n) {

        int result = 0;
        HashMap<String, Integer> map = new HashMap<>();

        for(int i=0; i<dic.length; i++){
            if(!map.containsKey(dic[i])) {
                map.put(dic[i], 1);
            }
            else{
                map.put(dic[i], map.get(dic[i])+1);
            }
        }

        for(int i=0; i<dic.length; i++){
            result = Math.max(result, map.get(dic[i])*dic[i].length());
        }

        return result;
    }
    public static void main(String[]args){
        String []dic={"aba","aba","aba","bb","bb"};
        System.out.println(findAlphaMatrix(dic,5));
    }
}
