import java.util.ArrayList;
import java.util.Collections;

/**
 字符串排列（递归）

 编写一个方法，确定某字符串的所有排列组合。

 给定一个string A和一个int n,代表字符串和其长度，请返回所有该字符串字符的排列，保证字符串长度小于等于11且字符串中字符均为大写英文字符，排列中的字符串按字典序从大到小排序。(不合并重复字符串)

 通过递归的形式将所有的排列组合表示出来（确定递归终止条件：递归到数组的最后一位 ）
 * */
public class Permutation {
    public ArrayList<String> getPermutation(String A) {
        // write code here
        ArrayList<String> list = new ArrayList<>();
        permutation(list, A.toCharArray(), 0);
        Collections.sort(list);
        Collections.reverse(list);
        return list;
    }

    public void permutation(ArrayList<String> list, char[] array, int k) {
        //检测是否递归到了最后一位
        if(k == array.length) {
            list.add(new String(array));
            return ;
        }
        for(int i = k; i < array.length; i++) {
            // 此处表示当前位依次与后面的字符交换
            swap(array, i, k);
            //当前位的后一位重复与当前位一样的操作（递归实现每个位置的交换）
            permutation(list, array, k + 1);
            //交换过的位置还需要再交换回来（这样才能实现递归）
            swap(array, i, k);
        }
    }

    /**
     *  交换函数
     */
    public void swap(char[] array, int i, int j) {
        if(i != j) {
            char temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
    public static void main(String[]args){
        String A="ABC";
        Permutation x=new Permutation();
        ArrayList<String> list=new ArrayList<>();
        list=x.getPermutation(A);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }
}
